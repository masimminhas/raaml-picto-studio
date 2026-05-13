# FMEA validation pilot — Refinery + EVL

This folder is the methodology artefact for validating the FMEA fragment of
the bifurcated RAAML metamodel set. It pairs the existing EVL well-formedness
rules (`raaml-picto-studio/raaml-semantic-constraints.evl`, §1) with a
Refinery encoding (`fmea.problem`) so the two tools act as independent
oracles: Refinery generates structurally consistent instance models, EVL
checks them.

## 1. What this pilot validates (and what it does not)

The methodology distinguishes three orthogonal properties; this pilot
addresses all three for the FMEA package only.

| Property | How the pilot exercises it |
|---|---|
| Domain faithfulness | External case studies are loaded as starting models; anything that cannot be expressed is a coverage gap. |
| Structural correctness | Refinery generates models within the bounds in `fmea.problem §5`; multiplicity / containment errors surface as UNSAT or as malformed generated models. |
| Constraint adequacy | Each EVL rule is mapped to either a Refinery `error` predicate or an explicit out-of-scope note; the mapping table makes coverage gaps audit-visible. |

## 2. Tool split — what each side validates

The pilot evolved through two configurations. v1 (commit history) had
Refinery do structural reasoning only; v2 (current) pushes integer
attribute synthesis back into Refinery and reserves EVL for the rules
that need free-form arithmetic.

| Property under test | Refinery (`fmea.problem`) | EVL (`raaml-semantic-constraints.evl`) |
|---|---|---|
| Class hierarchy & abstractness    | ✓ | — |
| Containment cardinality           | ✓ | — |
| Cross-references / multiplicities | ✓ | — |
| Single-tree / acyclicity          | ✓ | partial |
| Integer attribute *presence* (SEV/OCC/DET/RPN, severity, detectability, occurrence, likelihood) | ✓ (synthesised within solver scope) | — |
| Attribute-value *range* (SEV ∈ [1,10] etc.) | — (DSL surface syntax for in-error-body comparison didn't stabilise in v0.3.x) | ✓ |
| Attribute-value *arithmetic* (RPN = SEV·OCC·DET) | — (non-linear in three unknowns; undecidable in general) | ✓ |
| Cross-attribute consistency (FMEAItem.RPN ≡ rpnCalculation.first().RPN) | — | ✓ |

The SoSYM-friendly framing is unchanged from v1: **Refinery synthesises
structurally consistent candidate models; EVL re-validates everything on
those models.** What changed in v2 is *what* Refinery synthesises — now
the integer attributes are populated, so EVL has real values to multiply
and check ranges against. The cross-tool agreement claim is now
substantively stronger than v1.

## 3. EVL → Refinery rule-by-rule mapping

| EVL rule (raaml-semantic-constraints.evl §1) | Refinery encoding | Status |
|---|---|---|
| `RPNCalculation::SEVInRange`         | partial — `int SEV` declared so the attribute is populated; range check stays in EVL | Partial |
| `RPNCalculation::OCCInRange`         | same as SEVInRange | Partial |
| `RPNCalculation::DETInRange`         | same as SEVInRange | Partial |
| `RPNCalculation::RPNMustBeProduct`   | — (non-linear arithmetic; stays in EVL) | Out of scope by design |
| `FMEAItem::FMEAItemRPNConsistency`   | structural-only — `rpnCalculation` declared `[0..1]` to surface the implicit singleton assumption (`.first()` in EVL) | Partial |
| `AbstractFMEAItem.failureMode ≥ 1`   | `[1..*]` on the contains | Faithful |
| `AbstractFMEAItem.finalEffect ≥ 1`   | `[1..*]` on the contains | Faithful |
| `AbstractFMEAItem.cause ≥ 1`         | `[1..*]` on the contains | Faithful |
| `FMEA.fmeaItems ≥ 1`                  | `[1..*]` on the contains | Faithful |

### Multiple inheritance

`core.ecore` declares `AbstractCause extends AbstractEvent, Factor`. Refinery
is single-inheritance, so the pilot keeps `AbstractEvent` as the base
class and drops `Factor` membership for `AbstractCause`. This is a
*modelling* fidelity gap, not a correctness one — the EVL rules in scope
do not depend on `Factor`-typed dispatch. If future rules do, two options:
(i) introduce an explicit `Factor` subclass and require `AbstractCause`
instances to be siblings of it, or (ii) flatten via tagging predicates
once the Refinery dialect's predicate-body syntax is pinned down.

### Pilot-scope concrete cause / effect classes

`AbstractCause` and `AbstractEffect` are abstract in `core.ecore` with no
concrete subclasses *inside* `fmea.ecore` — their concrete subclasses
(e.g. `BasicEvent`, `VehicleLevelEffect`) live in `fta.ecore` and
`hara.ecore` respectively. For an FMEA-only pilot, Refinery cannot
populate `AbstractFMEAItem.cause` / `.finalEffect` containments unless
some concrete subclass exists. The pilot declares two placeholders —
`FmeaCause`, `FmeaEffect` — so generation succeeds. When scaling the
pilot to FTA or HARA, drop these placeholders and import the real
subclasses from those packages instead.

### Predicates and error declarations

Earlier drafts of this file used `error` and `pred` declarations to
surface diagnostics (`fmeaWithoutItems`, `fmeaItemHasMultipleRPN`,
`factor`). All were removed because Refinery's predicate-body syntax in
v0.3.x rejected the dotted-attribute access (`f.fmeaItems(item)`) and the
typed-`exists` form. The structural information they encoded is fully
captured by class declarations + `[1..*]` / `[0..1]` cardinalities; the
diagnostic value was nice-to-have, not essential. If a later experiment
needs an explicit error predicate, port one back in using the
`pred name(args) <-> body.` form documented for your installed version.

## 4. How to run the pilot end-to-end

The pipeline is **`fmea.problem` → Refinery → `.refinery` export → bridge
→ `.xmi` → EVL re-validation**. Each step lives in this folder.

### 4a. Generate models with Refinery

Open the Refinery web IDE (Docker image, default port `8888`), drag
`fmea.problem` into the editor, hit ▶ Generate, then click the export
icon and save as `.refinery`. Place the file under
`validation/refinery/generated/` (the `.refinery` format is preferable
to CSV — it preserves the partial-model facts in a single Datalog-style
text file the bridge consumes directly).

For multiple runs, save as `fmea_001.refinery`, `fmea_002.refinery`, …
The bridge processes one file at a time; the runner loops over them.

### 4b. Bridge `.refinery` → `fmea.ecore` XMI

Two artefacts:

- **`refinery2xmi.eol`** — Epsilon EOL script. Reads a `.refinery` file,
  parses the Datalog facts, looks up each concrete type via the
  `OUT` model's `createInstance(typeName)`, and wires references via
  reflective `eGet` / `eSet`.
- **`run-refinery2xmi.xml`** — ANT runner that registers the ecores,
  declares an empty writable `OUT` model, runs the EOL, and disposes
  (saving to disk).

Run inside a Runtime Eclipse with the RAAML plugin deployed (same
recipe as `validate-all.xml`):

1. Run As → Eclipse Application (your dev workspace).
2. In the Runtime Eclipse, import the `edu.kit.sdq.raaml` project.
3. Right-click `validation/refinery/run-refinery2xmi.xml` → Run As →
   Ant Build…
4. JRE tab → "Run in the same JRE as the workspace".
5. (Optional) Properties tab → override `input` and `output` to point
   at the right `.refinery` and target `.xmi`. Defaults are
   `generated/fmea_001.refinery` and `generated/fmea_001.xmi`.
6. Click Run.

Console output reports the parse/instantiate/wire/attribute counts so
you can sanity-check what landed. Expected on a v2 pilot file with
synthesised integer attributes:

```
Read ~210 lines from …\fmea_001.refinery
Parsed 18 node IDs, 18 type facts, ~62 reference facts, ~12 attribute facts.
Instantiated 12 EObjects (6 skipped).         ← FmeaCause/FmeaEffect skipped
Wired 10 references (~46 filtered, 0 missing).← from/to filtered as noise
Set ~12 attribute values (0 had no matching node, 0 had no matching EAttribute).
```

The attribute-fact count is approximate because Refinery may or may not
populate every declared attribute on every node depending on solver
heuristics; what matters is that *some* are populated and end up in the
XMI as numeric `name` and primitive-typed values.

The 6-node skip is the FmeaCause / FmeaEffect placeholder mismatch
(no concrete subclass exists in `fmea.ecore` alone). To fix, either
extend `meta.uris` in `run-refinery2xmi.xml` to include `fta.ecore` and
`hara.ecore` and update `fmea.problem` to use real concrete causes /
effects, or introduce a small validation-profile ecore.

### 4c. Validate the bridged XMI with EVL

ANT runner is **`run-evl-on-bridged.xml`** in this folder. It loads the
bridged XMI through the bifurcated metamodel URIs (same triplet as the
bridge: `core + fmea + raaml(2)`) and runs the existing
`raaml-semantic-constraints.evl` rules. Default property values point
at `generated/fmea_001.xmi` for the input and
`../../../raaml-picto-studio/raaml-semantic-constraints.evl` for the
EVL file; override with `-Dxmi.file=…` and/or `-Devl.file=…` if you
have either elsewhere.

Run it inside the same Runtime Eclipse you used for `run-refinery2xmi.xml`
(Run As → Ant Build…, "Run in the same JRE as the workspace").
`failonerrors`/`failonwarnings` are set false so the build always
succeeds — we want the *full* EVL report visible in the console, not
a halt at the first violation.

Three outcomes worth recording for the paper:

- **All generated models pass EVL structural checks** → cross-tool
  agreement, headline result for the validation section.
- **Generated models fail attribute-value rules** (e.g. `RPNMustBeProduct`,
  `SEVInRange`) → **expected** — Refinery does not populate numeric
  attributes. This *is* the EVL/Refinery split working as designed;
  record counts to argue the split is doing real work.
- **Generated models fail a structural EVL rule** → real finding. Either
  the rule is encoded correctly and `fmea.problem` is under-constrained
  (fix the encoding), or the EVL rule contradicts the metamodel's own
  multiplicities (fix the EVL). Either way, a paper-citable finding.

### 4d. Mutation testing (orthogonal sanity check)

For each EVL rule in scope, temporarily delete one clause and re-run §4c
on the same model corpus. If the corpus still passes, the clause is
unexercised — either redundant or your generated / external corpus
needs expanding.

### 4e. Caveat — bridge has not yet been executed end-to-end

`refinery2xmi.eol` and `run-refinery2xmi.xml` are written from careful
reading of the `.refinery` format and standard Epsilon API patterns,
but have not been run against your installed Eclipse / Epsilon version.
First-run failures most likely come from:

- ANT task names — the `<epsilon.emf.register>` task may need a
  different qualifier in your Epsilon version (some releases use
  `<epsilon.emf.registerMetaModel>`).
- `OUT.createInstance(typeName)` — confirm the IModel instance method
  is exposed in your Epsilon version; if not, fall back to
  `ePackage.eFactoryInstance.create(eClass)` and explicitly add the
  result to `OUT.resource.contents`.
- The `metamodeluri` comma-separated list — older Epsilon EmfModel
  parsers want a `;`-separated list instead.

If a first run reports something different from the expected counts
above, paste the console output and we'll adjust.

## 5. Inputs to gather before scaling beyond FMEA

- A literature corpus of 5–10 published FMEAs (ISO 26262 Annex B examples,
  AIAG-VDA FMEA Handbook 2019 worked examples, OMG RAAML §FMEA examples).
  Stored as `validation/case-studies/fmea/*.xmi` once instantiated.
- A standard-conformance trace matrix: every metaclass in `fmea.ecore` →
  the OMG RAAML specification section (`formal/2023-06-01`) it implements.
  Annotate the ecore directly via `<eAnnotations source="OMG-RAAML">`.

## 6. Open questions / TODO

- Validate the exact Refinery surface syntax against the installed version
  (the file targets the public refinery.tools dialect; older Refinery /
  VIATRA-Solver releases use slightly different keywords).
- Decide between options 1, 2, 3 for the multiplication constraint.
- Build the case-study corpus (§5).
- Repeat for FTA once the FMEA pilot is stable; the same template applies.

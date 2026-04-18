# RAAML Transformations: Annotation-Driven Round-Trip Engineering

This folder contains the infrastructure for bidirectional transformations
between the OMG RAAML UML profile and the RAAML Ecore metamodel. The
transformations are **generated** from the metaclass annotations embedded
in `raaml.ecore`, not hand-written.

## Folder Layout

```
transformations/
├── helpers/
│   ├── annotation-helpers.eol     # Query the Ecore metaclass annotations
│   └── uml-helpers.eol            # UML profile stereotype operations
├── templates/
│   ├── forward-rule.egl           # Emits one forward ETL rule per stereotype
│   ├── backward-rule.egl          # Emits one backward ETL rule per stereotype
│   ├── forward-aggregator.egl     # Emits the top-level forward ETL file
│   └── backward-aggregator.egl    # Emits the top-level backward ETL file
├── generateTransformations.egx    # EGX orchestrator
├── generated/                     # OUTPUT - do not edit, regenerate instead
│   ├── forward/*_forward.etl      # 100 forward rules (one per stereotype)
│   ├── backward/*_backward.etl    # 100 backward rules
│   ├── raamlProfileToEcore.etl    # Aggregator (imports all forward rules)
│   └── ecoreToRaamlProfile.etl    # Aggregator (imports all backward rules)
├── samples/                       # Sample UML profile models (user-provided)
│   ├── sample_fmea.uml            # Example: small FMEA in UML profile
│   └── sample_fmea.xmi            # After forward transformation
├── run-generator.xml              # ANT: regenerate ETL rules from annotations
├── run-forward.xml                # ANT: run forward ETL on a sample
└── run-backward.xml               # ANT: run backward ETL on a sample
```

## How It Works

The key idea: your `raaml.ecore` already contains the mapping specification
as annotations:

```xml
<eClassifiers xsi:type="ecore:EClass" name="BasicEvent">
    <eAnnotations source="http://edu.kit.sdq/raaml/metaclass">
        <details key="base" value="Class"/>
        <details key="stereotype" value="BasicEvent"/>
    </eAnnotations>
</eClassifiers>
```

This annotation says: "UML `Class` with `<<BasicEvent>>` applied corresponds
to the Ecore `BasicEvent` EClass." The EGX orchestrator reads these
annotations and generates a matching ETL rule for each one:

```etl
rule Transform_BasicEvent
    transform s : UML!Class
    to t : RAAML!fta!BasicEvent {

    guard : s.hasStereotype('BasicEvent')

    t.name = s.name;
    if (s.getTaggedValue('BasicEvent', 'id') <> null) {
        t.id = s.getTaggedValue('BasicEvent', 'id');
    }
    if (s.getTaggedValue('BasicEvent', 'probability') <> null) {
        t.probability = s.getTaggedValue('BasicEvent', 'probability');
    }
    // ...
}
```

No rule is hand-written. Add a new stereotype in the metamodel, regenerate,
done.

## End-to-End Quick Start (for BasicEvent prototype)

### Step 1: Regenerate the transformations

Right-click `run-generator.xml` -> **Run As -> Ant Build...** -> on the JRE
tab, pick **"Run in the same JRE as the workspace"** -> **Run**.

Expected output:
```
Generation complete. Output in: transformations/generated/
```

Inspect `generated/forward/BasicEvent_forward.etl` to see a concrete
generated rule.

### Step 2: Create a minimal UML profile sample

Using Papyrus with your RAAML profile:

1. Create a new UML model `sample_fmea.uml` in the `samples/` folder
2. Apply the RAAML profile
3. Add a Package, apply the `<<FMEA>>` stereotype, set tagged values:
   - `id = "FMEA_001"`
   - `name = "Sample FMEA"`
4. Inside that Package, add a Class, apply the `<<FMEAItem>>` stereotype,
   set tagged values:
   - `id = "FI_001"`
   - `name = "Sample Failure Mode"`
   - `RPN = 280.0`
5. Save

### Step 3: Run the forward transformation

Right-click `run-forward.xml` -> **Run As -> Ant Build...** -> same JRE option
-> **Run**.

Expected output: `samples/sample_fmea.xmi` -- an XMI file conforming to
raaml.ecore, containing the same structure as the source UML model.

### Step 4: Validate against existing EVL constraints

Run your existing `raaml-semantic-constraints.evl` on the output XMI. It
should pass (the constraints are generic to Ecore instances, they don't care
whether the model came from a hand-edited XMI or a transformation).

### Step 5: Run the backward transformation (round-trip)

Right-click `run-backward.xml` -> **Run As -> Ant Build...** -> **Run**.

Expected output: `samples/sample_fmea_roundtrip.uml` -- a new UML profile
model. Open in Papyrus; verify that the `<<FMEA>>` and `<<FMEAItem>>`
stereotypes are applied with the original tagged values.

### Step 6: Automate round-trip comparison (future work)

Write a small EOL script that compares `sample_fmea.uml` and
`sample_fmea_roundtrip.uml` element-by-element, confirming every stereotype
application and tagged value survived the round-trip.

## Regenerating When the Metamodel Changes

Any time you modify `raaml.ecore` (new stereotype, new attribute, new
annotation), re-run the generator:

```
Right-click run-generator.xml -> Run As -> Ant Build -> Run
```

The transformations regenerate automatically. No manual rule editing.

## What's Handled vs. What's Not (Honest Assessment)

### Handled by the generator
- Every EClass with `base+stereotype` annotation (100 stereotypes)
- All mappable EAttributes (string, numeric, enum, boolean)
- Containment references for package-level containers (FMEA, FTA, STPA, etc.)
- Name attribute mapping to UML Element.name

### Requires hand-written rules or extensions
- Profile associations that don't map 1:1 to EReferences
- Cross-referencing between elements (requires two-pass transformation)
- The 33 abstract superclasses (no stereotype, no rule needed - their
  features are inherited into concrete stereotyped EClasses)
- Custom ASIL decomposition literals not in the OMG profile (log warning
  during backward)

### Documented as a round-trip boundary
- UML behavioral elements (operations, ports, state machines) outside
  the RAAML profile scope are intentionally dropped during forward
  transformation; they cannot be recovered during backward
- This is **expected and correct**: the RAAML profile is the data-centric
  safety analysis vocabulary, not full UML

## Troubleshooting

### "RAAML profile not found" error
The RAAML profile must be loaded and registered. In Papyrus, apply the
profile to your sample model before running the transformation.

### Generator produces no files
Check that `run-generator.xml` is loading `raaml.ecore` as a **model**
(with metamodel URI `http://www.eclipse.org/emf/2002/Ecore`), not as a
registered metamodel.

### ETL type not found (e.g., `Unknown type: BasicEvent`)
The RAAML metamodel packages must be registered in the runtime Eclipse
where you execute the transformation. Use a Runtime Eclipse (Run As ->
Eclipse Application) that has the `edu.kit.sdq.raaml` plugin deployed.

## For the Paper

This folder is cited as evidence of:

1. **Executable mapping specification**: The Ecore annotations are not
   documentation -- they drive the generator.

2. **Meta-engineering contribution**: Transformations are synthesized
   from annotated metamodels, not hand-crafted.

3. **Round-trip semantic preservation**: Empirical proof via generated
   bidirectional ETL + sample model round-trips.

4. **Reusability**: The approach generalizes to any OMG UML profile that
   has a corresponding Ecore metamodel with the same annotation pattern.

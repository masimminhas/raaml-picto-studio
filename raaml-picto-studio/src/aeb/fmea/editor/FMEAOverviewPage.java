package aeb.fmea.editor;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class FMEAOverviewPage extends FormPage {

    private EObject      fmeaObject;
    private TableViewer  tableViewer;
    private Composite    detailComposite;
    private EObject      currentItem;
    private FormToolkit  toolkit;

    // ── Feature names exactly matching your XMI/ecore ──────────
    private static final String ITEMS_FEATURE = "fmeaItems";
    private static final String F_ID          = "id";
    private static final String F_NAME        = "name";
    private static final String F_DESC        = "description";
    private static final String F_RPN         = "RPN";
    private static final String F_FAILURE_MODE = "failureMode";
    private static final String F_FINAL_EFFECT = "finalEffect";
    private static final String F_CAUSE        = "cause";
    private static final String F_RPN_CALC     = "rpnCalculation";
    private static final String F_SEV          = "SEV";
    private static final String F_OCC          = "OCC";
    private static final String F_DET          = "DET";
    private static final String F_DETECT       = "detectability";

    // ── Detail panel fields ─────────────────────────────────────
    private Text txtItemId, txtItemName, txtItemDesc, txtItemRPN;
    private Text txtFmId,    txtFmName,    txtFmDesc,    txtFmDetect;
    private Text txtEffId,   txtEffName,   txtEffDesc,   txtEffDetect;
    private Text txtCauseId, txtCauseName, txtCauseDesc, txtCauseDetect;
    private Text txtRpnId,   txtRpnName,   txtRpnDesc;
    private Text txtSev, txtOcc, txtDet, txtRpnCalc;

    public FMEAOverviewPage(FormEditor editor, EObject fmeaObject) {
        super(editor, "overview", "Overview");
        this.fmeaObject = fmeaObject;
    }

    // ─────────────────────────────────────────────────────────────
    // createFormContent
    // ─────────────────────────────────────────────────────────────

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        ScrolledForm form = managedForm.getForm();
        toolkit = managedForm.getToolkit();
        form.setText("FMEA Overview");

        if (fmeaObject == null) {
            toolkit.createLabel(form.getBody(), "ERROR: FMEA model not loaded.");
            return;
        }

        Composite body = form.getBody();
        body.setLayout(new GridLayout(1, false));

        createFMEAHeaderSection(body);
        createItemsTableSection(body);
        createItemDetailSection(body);

        form.reflow(true);
    }

    // ─────────────────────────────────────────────────────────────
    // Section 1 – FMEA Header
    // ────────────────────────────────────────────────────────────��

    private void createFMEAHeaderSection(Composite parent) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED | Section.TWISTIE);
        s.setText("FMEA Information");
        s.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        Composite c = toolkit.createComposite(s);
        c.setLayout(new GridLayout(4, false));
        s.setClient(c);

        makeLabeledField(c, "ID:",          fmeaObject, F_ID,   true,  1);
        makeLabeledField(c, "Name:",        fmeaObject, F_NAME, false, 1);
        makeLabeledField(c, "Description:", fmeaObject, F_DESC, false, 3);
    }

    // ─────────────────────────────────────────────────────────────
    // Section 2 – FMEAItems Table
    // ─────────────────────────────────────────────────────────────

    private void createItemsTableSection(Composite parent) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED);
        s.setText("FMEA Items");
        s.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite c = toolkit.createComposite(s);
        c.setLayout(new GridLayout(2, false));
        s.setClient(c);

        tableViewer = new TableViewer(c,
                SWT.BORDER | SWT.FULL_SELECTION | SWT.SINGLE
                | SWT.H_SCROLL | SWT.V_SCROLL);
        tableViewer.getTable().setHeaderVisible(true);
        tableViewer.getTable().setLinesVisible(true);
        GridData tgd = new GridData(SWT.FILL, SWT.FILL, true, true);
        tgd.heightHint = 180;
        tableViewer.getTable().setLayoutData(tgd);

        addTableColumn("ID",           80,  "id");
        addTableColumn("Name",         220, "name");
        addTableColumn("RPN",          60,  "RPN");
        addTableColumn("Failure Mode", 180, "FM_NAME");
        addTableColumn("Final Effect", 180, "EFF_NAME");
        addTableColumn("Cause",        180, "CAUSE_NAME");
        addTableColumn("SEV",          50,  "SEV_calc");
        addTableColumn("OCC",          50,  "OCC_calc");
        addTableColumn("DET",          50,  "DET_calc");

        tableViewer.setContentProvider(new IStructuredContentProvider() {
            @Override
            public Object[] getElements(Object input) {
                if (input instanceof EObject) {
                    EStructuralFeature f = ((EObject) input)
                            .eClass().getEStructuralFeature(ITEMS_FEATURE);
                    if (f != null) {
                        Object v = ((EObject) input).eGet(f);
                        if (v instanceof List)
                            return ((List<?>) v).toArray();
                    }
                }
                return new Object[0];
            }
        });

        tableViewer.setInput(fmeaObject);

        tableViewer.addSelectionChangedListener(event -> {
            IStructuredSelection sel =
                    (IStructuredSelection) tableViewer.getSelection();
            if (!sel.isEmpty())
                populateDetailPanel((EObject) sel.getFirstElement());
            else
                clearDetailPanel();
        });

        // Buttons
        Composite btn = toolkit.createComposite(c);
        btn.setLayout(new GridLayout(1, false));
        btn.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

        mkBtn(btn, "Add",       () -> doAddItem());
        mkBtn(btn, "Duplicate", () -> doDuplicateItem());
        mkBtn(btn, "Remove",    () -> doRemoveItem());
    }

    // ─────────────────────────────────────────────────────────────
    // Section 3 – Item Detail Panel
    // ─────────────────────────────────────────────────────────────

    private void createItemDetailSection(Composite parent) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED | Section.TWISTIE);
        s.setText("Item Details  (select a row above to edit)");
        s.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        detailComposite = toolkit.createComposite(s);
        detailComposite.setLayout(new GridLayout(1, false));
        s.setClient(detailComposite);

        // ── Item attributes ──────────────────────────────────
        Section itemSec = makeSubSection(detailComposite, "Item Attributes");
        Composite ic = toolkit.createComposite(itemSec);
        ic.setLayout(new GridLayout(4, false));
        itemSec.setClient(ic);

        toolkit.createLabel(ic, "ID:");
        txtItemId  = makeText(ic, SWT.BORDER | SWT.READ_ONLY, 1);
        toolkit.createLabel(ic, "RPN (auto):");
        txtItemRPN = makeText(ic, SWT.BORDER | SWT.READ_ONLY, 1);
        toolkit.createLabel(ic, "Name:");
        txtItemName = makeText(ic, SWT.BORDER, 3);
        toolkit.createLabel(ic, "Description:");
        txtItemDesc = makeMultiText(ic, 3);

        // ── Failure Mode ─────────────────────────���───────────
        Section fmSec = makeSubSection(detailComposite, "Failure Mode");
        Composite fmc = toolkit.createComposite(fmSec);
        fmc.setLayout(new GridLayout(4, false));
        fmSec.setClient(fmc);

        toolkit.createLabel(fmc, "ID:");
        txtFmId     = makeText(fmc, SWT.BORDER, 1);
        toolkit.createLabel(fmc, "Detectability:");
        txtFmDetect = makeText(fmc, SWT.BORDER, 1);
        toolkit.createLabel(fmc, "Name:");
        txtFmName   = makeText(fmc, SWT.BORDER, 3);
        toolkit.createLabel(fmc, "Description:");
        txtFmDesc   = makeMultiText(fmc, 3);

        // ── Final Effect ─────────────────────────────────────
        Section effSec = makeSubSection(detailComposite, "Final Effect");
        Composite effc = toolkit.createComposite(effSec);
        effc.setLayout(new GridLayout(4, false));
        effSec.setClient(effc);

        toolkit.createLabel(effc, "ID:");
        txtEffId     = makeText(effc, SWT.BORDER, 1);
        toolkit.createLabel(effc, "Detectability:");
        txtEffDetect = makeText(effc, SWT.BORDER, 1);
        toolkit.createLabel(effc, "Name:");
        txtEffName   = makeText(effc, SWT.BORDER, 3);
        toolkit.createLabel(effc, "Description:");
        txtEffDesc   = makeMultiText(effc, 3);

        // ── Cause ────────────────────────────────────────────
        Section causeSec = makeSubSection(detailComposite, "Cause");
        Composite causec = toolkit.createComposite(causeSec);
        causec.setLayout(new GridLayout(4, false));
        causeSec.setClient(causec);

        toolkit.createLabel(causec, "ID:");
        txtCauseId     = makeText(causec, SWT.BORDER, 1);
        toolkit.createLabel(causec, "Detectability:");
        txtCauseDetect = makeText(causec, SWT.BORDER, 1);
        toolkit.createLabel(causec, "Name:");
        txtCauseName   = makeText(causec, SWT.BORDER, 3);
        toolkit.createLabel(causec, "Description:");
        txtCauseDesc   = makeMultiText(causec, 3);

        // ── RPN Calculation ──────────────────────────────────
        Section rpnSec = makeSubSection(detailComposite,
                "RPN Calculation  (SEV × OCC × DET)");
        Composite rpnc = toolkit.createComposite(rpnSec);
        rpnc.setLayout(new GridLayout(6, false));
        rpnSec.setClient(rpnc);

        toolkit.createLabel(rpnc, "ID:");
        txtRpnId   = makeText(rpnc, SWT.BORDER, 1);
        toolkit.createLabel(rpnc, "Name:");
        txtRpnName = makeText(rpnc, SWT.BORDER, 3);

        toolkit.createLabel(rpnc, "SEV (1-10):");
        txtSev = makeText(rpnc, SWT.BORDER, 1);
        toolkit.createLabel(rpnc, "OCC (1-10):");
        txtOcc = makeText(rpnc, SWT.BORDER, 1);
        toolkit.createLabel(rpnc, "DET (1-10):");
        txtDet = makeText(rpnc, SWT.BORDER, 1);
        toolkit.createLabel(rpnc, "RPN (result):");
        txtRpnCalc = makeText(rpnc, SWT.BORDER | SWT.READ_ONLY, 1);

        toolkit.createLabel(rpnc, "Description:");
        txtRpnDesc = makeMultiText(rpnc, 5);

        wireSaveListeners();
        wireRpnAutoCalc();
        setDetailEnabled(false);
    }

    // ─────────────────────────────────────────────────────────────
    // Listeners
    // ─────────────────────────────────────────────────────────────

    private void wireSaveListeners() {
        addSaveListener(txtItemName, () -> setStr(currentItem, F_NAME,  txtItemName.getText()));
        addSaveListener(txtItemDesc, () -> setStr(currentItem, F_DESC,  txtItemDesc.getText()));

        addSaveListener(txtFmId,     () -> setChildStr(F_FAILURE_MODE, F_ID,      txtFmId.getText()));
        addSaveListener(txtFmName,   () -> setChildStr(F_FAILURE_MODE, F_NAME,    txtFmName.getText()));
        addSaveListener(txtFmDesc,   () -> setChildStr(F_FAILURE_MODE, F_DESC,    txtFmDesc.getText()));
        addSaveListener(txtFmDetect, () -> setChildDbl(F_FAILURE_MODE, F_DETECT,  txtFmDetect.getText()));

        addSaveListener(txtEffId,     () -> setChildStr(F_FINAL_EFFECT, F_ID,     txtEffId.getText()));
        addSaveListener(txtEffName,   () -> setChildStr(F_FINAL_EFFECT, F_NAME,   txtEffName.getText()));
        addSaveListener(txtEffDesc,   () -> setChildStr(F_FINAL_EFFECT, F_DESC,   txtEffDesc.getText()));
        addSaveListener(txtEffDetect, () -> setChildDbl(F_FINAL_EFFECT, F_DETECT, txtEffDetect.getText()));

        addSaveListener(txtCauseId,     () -> setChildStr(F_CAUSE, F_ID,      txtCauseId.getText()));
        addSaveListener(txtCauseName,   () -> setChildStr(F_CAUSE, F_NAME,    txtCauseName.getText()));
        addSaveListener(txtCauseDesc,   () -> setChildStr(F_CAUSE, F_DESC,    txtCauseDesc.getText()));
        addSaveListener(txtCauseDetect, () -> setChildDbl(F_CAUSE, F_DETECT,  txtCauseDetect.getText()));

        addSaveListener(txtRpnId,   () -> setChildStr(F_RPN_CALC, F_ID,   txtRpnId.getText()));
        addSaveListener(txtRpnName, () -> setChildStr(F_RPN_CALC, F_NAME, txtRpnName.getText()));
        addSaveListener(txtRpnDesc, () -> setChildStr(F_RPN_CALC, F_DESC, txtRpnDesc.getText()));
        addSaveListener(txtSev,     () -> setChildDbl(F_RPN_CALC, F_SEV,  txtSev.getText()));
        addSaveListener(txtOcc,     () -> setChildDbl(F_RPN_CALC, F_OCC,  txtOcc.getText()));
        addSaveListener(txtDet,     () -> setChildDbl(F_RPN_CALC, F_DET,  txtDet.getText()));
    }

    private void wireRpnAutoCalc() {
        org.eclipse.swt.events.ModifyListener ml = e -> {
            try {
                double sev = Double.parseDouble(txtSev.getText().trim());
                double occ = Double.parseDouble(txtOcc.getText().trim());
                double det = Double.parseDouble(txtDet.getText().trim());
                double rpn = sev * occ * det;
                String rpnStr = String.valueOf(rpn);
                txtRpnCalc.setText(rpnStr);
                txtItemRPN.setText(rpnStr);
                if (currentItem != null) {
                    setChildDbl(F_RPN_CALC, F_RPN, rpnStr);
                    setStr(currentItem, F_RPN, rpnStr);
                    tableViewer.update(currentItem, null);
                }
            } catch (NumberFormatException ignored) { }
        };
        txtSev.addModifyListener(ml);
        txtOcc.addModifyListener(ml);
        txtDet.addModifyListener(ml);
    }

    private void addSaveListener(Text field, Runnable setter) {
        if (field == null) return;
        field.addModifyListener(e -> {
            if (currentItem != null) {
                setter.run();
                tableViewer.update(currentItem, null);
                getFMEAEditor().markDirty();
            }
        });
    }

    // ─────────────────────────────────────────────────────────────
    // Populate / Clear Detail Panel
    // ─────────────────────────────────────────────────────────────

    private void populateDetailPanel(EObject item) {
        currentItem = item;
        setDetailEnabled(true);

        safeSet(txtItemId,   getStr(item, F_ID));
        safeSet(txtItemName, getStr(item, F_NAME));
        safeSet(txtItemDesc, getStr(item, F_DESC));
        safeSet(txtItemRPN,  getStr(item, F_RPN));

        EObject fm = getChild(item, F_FAILURE_MODE);
        safeSet(txtFmId,     getStr(fm, F_ID));
        safeSet(txtFmName,   getStr(fm, F_NAME));
        safeSet(txtFmDesc,   getStr(fm, F_DESC));
        safeSet(txtFmDetect, getStr(fm, F_DETECT));

        EObject eff = getChild(item, F_FINAL_EFFECT);
        safeSet(txtEffId,     getStr(eff, F_ID));
        safeSet(txtEffName,   getStr(eff, F_NAME));
        safeSet(txtEffDesc,   getStr(eff, F_DESC));
        safeSet(txtEffDetect, getStr(eff, F_DETECT));

        EObject cause = getChild(item, F_CAUSE);
        safeSet(txtCauseId,     getStr(cause, F_ID));
        safeSet(txtCauseName,   getStr(cause, F_NAME));
        safeSet(txtCauseDesc,   getStr(cause, F_DESC));
        safeSet(txtCauseDetect, getStr(cause, F_DETECT));

        EObject rpn = getChild(item, F_RPN_CALC);
        safeSet(txtRpnId,   getStr(rpn, F_ID));
        safeSet(txtRpnName, getStr(rpn, F_NAME));
        safeSet(txtRpnDesc, getStr(rpn, F_DESC));
        safeSet(txtSev,     getStr(rpn, F_SEV));
        safeSet(txtOcc,     getStr(rpn, F_OCC));
        safeSet(txtDet,     getStr(rpn, F_DET));
        safeSet(txtRpnCalc, getStr(rpn, F_RPN));
    }

    private void clearDetailPanel() {
        currentItem = null;
        Text[] all = {
            txtItemId, txtItemName, txtItemDesc, txtItemRPN,
            txtFmId,    txtFmName,    txtFmDesc,    txtFmDetect,
            txtEffId,   txtEffName,   txtEffDesc,   txtEffDetect,
            txtCauseId, txtCauseName, txtCauseDesc, txtCauseDetect,
            txtRpnId,   txtRpnName,   txtRpnDesc,
            txtSev, txtOcc, txtDet, txtRpnCalc
        };
        for (Text t : all) safeSet(t, "");
        setDetailEnabled(false);
    }

    private void setDetailEnabled(boolean enabled) {
        Text[] editable = {
            txtItemName, txtItemDesc,
            txtFmId,    txtFmName,    txtFmDesc,    txtFmDetect,
            txtEffId,   txtEffName,   txtEffDesc,   txtEffDetect,
            txtCauseId, txtCauseName, txtCauseDesc, txtCauseDetect,
            txtRpnId,   txtRpnName,   txtRpnDesc,
            txtSev, txtOcc, txtDet
        };
        for (Text t : editable) if (t != null) t.setEnabled(enabled);
    }

    // ─────────────────────────────────────────────────────────────
    // Button Actions
    // ─────────────────────────────────────────────────────────────

    @SuppressWarnings("unchecked")
    private void doAddItem() {
        EStructuralFeature feature =
                fmeaObject.eClass().getEStructuralFeature(ITEMS_FEATURE);
        if (feature == null) {
            System.err.println("doAddItem: feature not found: " + ITEMS_FEATURE);
            return;
        }

        EClass itemClass       = (EClass) feature.getEType();
        EClass concreteClass   = resolveConcreteClass(itemClass);
        if (concreteClass == null) {
            System.err.println("doAddItem: no concrete class for: "
                    + itemClass.getName());
            return;
        }

        EObject newItem = concreteClass.getEPackage()
                .getEFactoryInstance().create(concreteClass);

        setStr(newItem, F_ID,   "FI_" + System.currentTimeMillis());
        setStr(newItem, F_NAME, "New FMEA Item");
        setStr(newItem, F_DESC, "");

        doCreateEmptyChild(newItem, F_FAILURE_MODE);
        doCreateEmptyChild(newItem, F_FINAL_EFFECT);
        doCreateEmptyChild(newItem, F_CAUSE);
        doCreateEmptyRpnCalc(newItem);

        ((List<EObject>) fmeaObject.eGet(feature)).add(newItem);

        tableViewer.refresh();
        tableViewer.setSelection(new StructuredSelection(newItem), true);
        populateDetailPanel(newItem);
        getFMEAEditor().markDirty();
    }

    @SuppressWarnings("unchecked")
    private void doDuplicateItem() {
        IStructuredSelection sel =
                (IStructuredSelection) tableViewer.getSelection();
        if (sel.isEmpty()) return;

        EObject selected = (EObject) sel.getFirstElement();
        EStructuralFeature feature =
                fmeaObject.eClass().getEStructuralFeature(ITEMS_FEATURE);
        if (feature == null) return;

        EObject copy = EcoreUtil.copy(selected);
        List<EObject> list = (List<EObject>) fmeaObject.eGet(feature);
        list.add(list.indexOf(selected) + 1, copy);
        tableViewer.refresh();
        tableViewer.setSelection(new StructuredSelection(copy), true);
        populateDetailPanel(copy);
        getFMEAEditor().markDirty();
    }

    @SuppressWarnings("unchecked")
    private void doRemoveItem() {
        IStructuredSelection sel =
                (IStructuredSelection) tableViewer.getSelection();
        if (sel.isEmpty()) return;

        EObject selected = (EObject) sel.getFirstElement();
        EStructuralFeature feature =
                fmeaObject.eClass().getEStructuralFeature(ITEMS_FEATURE);
        if (feature == null) return;

        ((List<EObject>) fmeaObject.eGet(feature)).remove(selected);
        currentItem = null;
        tableViewer.refresh();
        clearDetailPanel();
        getFMEAEditor().markDirty();
    }

    // ─────────────────────────────────────────────────────────────
    // Child Element Creation
    // ─────────────────────────────────────────────────────────────

    @SuppressWarnings("unchecked")
    private void doCreateEmptyChild(EObject parent, String featureName) {
        EStructuralFeature f =
                parent.eClass().getEStructuralFeature(featureName);
        if (f == null) {
            System.err.println("doCreateEmptyChild: feature not found: "
                    + featureName);
            return;
        }
        EClass childClass    = (EClass) f.getEType();
        EClass concreteClass = resolveConcreteClass(childClass);
        if (concreteClass == null) {
            System.err.println("doCreateEmptyChild: no concrete class for: "
                    + childClass.getName() + " (feature: " + featureName + ")");
            return;
        }
        EObject child = concreteClass.getEPackage()
                .getEFactoryInstance().create(concreteClass);
        setStr(child, F_ID,   featureName.toUpperCase() + "_NEW");
        setStr(child, F_NAME, "New " + featureName);
        if (f.isMany())
            ((List<EObject>) parent.eGet(f)).add(child);
        else
            parent.eSet(f, child);
    }

    @SuppressWarnings("unchecked")
    private void doCreateEmptyRpnCalc(EObject parent) {
        EStructuralFeature f =
                parent.eClass().getEStructuralFeature(F_RPN_CALC);
        if (f == null) {
            System.err.println("doCreateEmptyRpnCalc: feature not found: "
                    + F_RPN_CALC);
            return;
        }
        EClass rpnClass      = (EClass) f.getEType();
        EClass concreteClass = resolveConcreteClass(rpnClass);
        if (concreteClass == null) {
            System.err.println("doCreateEmptyRpnCalc: no concrete class for: "
                    + rpnClass.getName());
            return;
        }
        EObject rpn = concreteClass.getEPackage()
                .getEFactoryInstance().create(concreteClass);

        EStructuralFeature sevF = rpn.eClass().getEStructuralFeature(F_SEV);
        EStructuralFeature occF = rpn.eClass().getEStructuralFeature(F_OCC);
        EStructuralFeature detF = rpn.eClass().getEStructuralFeature(F_DET);
        EStructuralFeature rpnF = rpn.eClass().getEStructuralFeature(F_RPN);
        if (sevF != null) rpn.eSet(sevF, 1.0);
        if (occF != null) rpn.eSet(occF, 1.0);
        if (detF != null) rpn.eSet(detF, 1.0);
        if (rpnF != null) rpn.eSet(rpnF, 1.0);

        if (f.isMany())
            ((List<EObject>) parent.eGet(f)).add(rpn);
        else
            parent.eSet(f, rpn);
    }

    // ─────────────────────────────────────────────────────────────
    // Concrete Class Resolution
    // ─────────────────────────────────────────────────────────────

    private EClass resolveConcreteClass(EClass eClass) {
        if (eClass == null) return null;
        if (!eClass.isAbstract() && !eClass.isInterface()) return eClass;
        for (Object entry : EPackage.Registry.INSTANCE.values().toArray()) {
            if (entry instanceof EPackage) {
                EClass found = findConcreteSubclass((EPackage) entry, eClass);
                if (found != null) return found;
            }
        }
        return null;
    }

    private EClass findConcreteSubclass(EPackage pkg, EClass superClass) {
        for (EClassifier c : pkg.getEClassifiers()) {
            if (c instanceof EClass) {
                EClass candidate = (EClass) c;
                if (!candidate.isAbstract()
                        && !candidate.isInterface()
                        && superClass.isSuperTypeOf(candidate)) {
                    return candidate;
                }
            }
        }
        for (EPackage sub : pkg.getESubpackages()) {
            EClass found = findConcreteSubclass(sub, superClass);
            if (found != null) return found;
        }
        return null;
    }

    // ─────────────────────────────────────────────────────────────
    // EMF Helpers
    // ─────────────────────────────────────────────────────────────

    private EObject getChild(EObject parent, String featureName) {
        if (parent == null) return null;
        EStructuralFeature f =
                parent.eClass().getEStructuralFeature(featureName);
        if (f == null) return null;
        Object val = parent.eGet(f);
        if (val instanceof EObject) return (EObject) val;
        if (val instanceof List && !((List<?>) val).isEmpty())
            return (EObject) ((List<?>) val).get(0);
        return null;
    }

    private String getStr(EObject obj, String feat) {
        if (obj == null) return "";
        EStructuralFeature f = obj.eClass().getEStructuralFeature(feat);
        if (f == null) return "";
        Object v = obj.eGet(f);
        return v != null ? v.toString() : "";
    }

    private void setStr(EObject obj, String feat, String val) {
        if (obj == null) return;
        EStructuralFeature f = obj.eClass().getEStructuralFeature(feat);
        if (f != null) obj.eSet(f, val);
    }

    private void setChildStr(String childFeat, String attr, String val) {
        EObject child = getChild(currentItem, childFeat);
        if (child != null) setStr(child, attr, val);
    }

    private void setChildDbl(String childFeat, String attr, String val) {
        EObject child = getChild(currentItem, childFeat);
        if (child == null) return;
        EStructuralFeature f = child.eClass().getEStructuralFeature(attr);
        if (f == null) return;
        try { child.eSet(f, Double.parseDouble(val.trim())); }
        catch (NumberFormatException ignored) { }
    }

    // ─────────────────────────────────────────────────────────────
    // Widget Helpers
    // ─────────────────────────────────────────────────────────────

    /** Safely set text without triggering modify listeners when null/disposed */
    private void safeSet(Text field, String value) {
        if (field == null || field.isDisposed()) return;
        field.setText(value != null ? value : "");
    }

    private Text makeText(Composite parent, int style, int hSpan) {
        Text t = toolkit.createText(parent, "", style);
        GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gd.horizontalSpan = hSpan;
        t.setLayoutData(gd);
        return t;
    }

    private Text makeMultiText(Composite parent, int hSpan) {
        Text t = toolkit.createText(parent, "",
                SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd.horizontalSpan = hSpan;
        gd.heightHint = 45;
        t.setLayoutData(gd);
        return t;
    }

    private Section makeSubSection(Composite parent, String title) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED | Section.TWISTIE);
        s.setText(title);
        s.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        return s;
    }

    private void mkBtn(Composite parent, String label, Runnable action) {
        Button b = toolkit.createButton(parent, label, SWT.PUSH);
        b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        b.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                action.run();
            }
        });
    }

    private void addTableColumn(String title, int width, String key) {
        TableViewerColumn col = new TableViewerColumn(tableViewer, SWT.NONE);
        col.getColumn().setText(title);
        col.getColumn().setWidth(width);
        col.getColumn().setResizable(true);
        col.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (!(element instanceof EObject)) return "";
                EObject item = (EObject) element;
                switch (key) {
                    case "FM_NAME":    return getStr(getChild(item, F_FAILURE_MODE), F_NAME);
                    case "EFF_NAME":   return getStr(getChild(item, F_FINAL_EFFECT), F_NAME);
                    case "CAUSE_NAME": return getStr(getChild(item, F_CAUSE),        F_NAME);
                    case "SEV_calc":   return getStr(getChild(item, F_RPN_CALC),     F_SEV);
                    case "OCC_calc":   return getStr(getChild(item, F_RPN_CALC),     F_OCC);
                    case "DET_calc":   return getStr(getChild(item, F_RPN_CALC),     F_DET);
                    default:           return getStr(item, key);
                }
            }
        });
    }

    private void makeLabeledField(Composite parent, String label,
            EObject obj, String feat, boolean readOnly, int hSpan) {
        toolkit.createLabel(parent, label);
        int style = SWT.BORDER | (readOnly ? SWT.READ_ONLY : SWT.NONE);
        Text t = toolkit.createText(parent, getStr(obj, feat), style);
        GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gd.horizontalSpan = hSpan;
        t.setLayoutData(gd);
        if (!readOnly) {
            t.addModifyListener(e -> {
                setStr(obj, feat, t.getText());
                getFMEAEditor().markDirty();
            });
        }
    }

    // ─────────────────────────────────────────────────────────────
    // Editor Access
    // ─────────────────────────────────────────────────────────────

    FMEAFormEditor getFMEAEditor() {
        return (FMEAFormEditor) getEditor();
    }
}
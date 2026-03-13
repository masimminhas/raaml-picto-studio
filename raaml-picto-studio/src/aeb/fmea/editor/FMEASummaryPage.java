package aeb.fmea.editor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class FMEASummaryPage extends FormPage {

    private EObject fmeaObject;
    private static final String ITEMS_FEATURE = "fmeaItems";

    public FMEASummaryPage(FormEditor editor, EObject fmeaObject) {
        super(editor, "summary", "Summary");
        this.fmeaObject = fmeaObject;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        ScrolledForm form    = managedForm.getForm();
        FormToolkit  toolkit = managedForm.getToolkit();
        form.setText("FMEA Summary");

        if (fmeaObject == null) {
            toolkit.createLabel(form.getBody(), "ERROR: Model not loaded.");
            return;
        }

        Composite body = form.getBody();
        body.setLayout(new GridLayout(1, false));

        createStatsSection(body, toolkit);
        createRpnRankingSection(body, toolkit);
        createFullTableSection(body, toolkit);

        form.reflow(true);
    }

    // ─────────────────────────────────────────────────────────────
    // Statistics
    // ─────────────────────────────────────────────────────────────

    private void createStatsSection(Composite parent, FormToolkit toolkit) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED);
        s.setText("Statistics");
        s.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        Composite c = toolkit.createComposite(s);
        c.setLayout(new GridLayout(4, false));
        s.setClient(c);

        List<?> items = getItems();
        int total = items.size();

        double maxRpn = 0, sumRpn = 0;
        int critical = 0; // RPN > 100
        for (Object o : items) {
            double rpn = getDoubleAttr((EObject) o, "RPN");
            sumRpn += rpn;
            if (rpn > maxRpn) maxRpn = rpn;
            if (rpn > 100) critical++;
        }

        stat(toolkit, c, "FMEA Name:",      getStr(fmeaObject, "name"));
        stat(toolkit, c, "Total Items:",    String.valueOf(total));
        stat(toolkit, c, "Max RPN:",        String.valueOf(maxRpn));
        stat(toolkit, c, "Avg RPN:",        total > 0
                ? String.format("%.1f", sumRpn / total) : "N/A");
        stat(toolkit, c, "Critical (>100):",String.valueOf(critical));
        stat(toolkit, c, "Safe (≤100):",    String.valueOf(total - critical));
    }

    // ─────────────────────────────────────────────────────────────
    // RPN Ranking Table
    // ─────────────────────────────────────────────────────────────

    private void createRpnRankingSection(Composite parent, FormToolkit toolkit) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED);
        s.setText("RPN Ranking  (highest risk first)");
        s.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite c = toolkit.createComposite(s);
        c.setLayout(new GridLayout(1, false));
        s.setClient(c);

        TableViewer tv = makeTableViewer(c);

        addCol(tv, "#",           40,  item -> {
            List<?> all = getItems();
            // sort by RPN desc for display rank
            return String.valueOf(all.indexOf(item) + 1);
        });
        addCol(tv, "ID",          80,  item -> getStr(item, "id"));
        addCol(tv, "Name",        220, item -> getStr(item, "name"));
        addCol(tv, "SEV",         50,  item -> getChildStr(item, "rpnCalculation", "SEV"));
        addCol(tv, "OCC",         50,  item -> getChildStr(item, "rpnCalculation", "OCC"));
        addCol(tv, "DET",         50,  item -> getChildStr(item, "rpnCalculation", "DET"));
        addCol(tv, "RPN",         70,  item -> getStr(item, "RPN"));
        addCol(tv, "Failure Mode",200, item -> getChildStr(item, "failureMode",    "name"));
        addCol(tv, "Final Effect",200, item -> getChildStr(item, "finalEffect",    "name"));
        addCol(tv, "Cause",       200, item -> getChildStr(item, "cause",          "name"));

        tv.setContentProvider(new IStructuredContentProvider() {
            @Override public Object[] getElements(Object input) {
                List<?> list = getItems();
                // Sort by RPN descending
                return list.stream()
                        .sorted((a, b) -> Double.compare(
                                getDoubleAttr((EObject) b, "RPN"),
                                getDoubleAttr((EObject) a, "RPN")))
                        .toArray();
            }
        });
        tv.setInput(fmeaObject);
    }

    // ─────────────────────────────────────────────────────────────
    // Full Detail Table
    // ─────────────────────────────────────────────────────────────

    private void createFullTableSection(Composite parent, FormToolkit toolkit) {
        Section s = toolkit.createSection(parent,
                Section.TITLE_BAR | Section.EXPANDED | Section.TWISTIE);
        s.setText("Full FMEA Table (Read-Only)");
        s.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite c = toolkit.createComposite(s);
        c.setLayout(new GridLayout(1, false));
        s.setClient(c);

        TableViewer tv = makeTableViewer(c);

        addCol(tv, "ID",                 80,  item -> getStr(item, "id"));
        addCol(tv, "Name",               200, item -> getStr(item, "name"));
        addCol(tv, "Failure Mode",       200, item -> getChildStr(item, "failureMode",  "name"));
        addCol(tv, "FM Type",            120, item -> getChildType(item, "failureMode"));
        addCol(tv, "FM Detectability",   80,  item -> getChildStr(item, "failureMode",  "detectability"));
        addCol(tv, "Final Effect",       200, item -> getChildStr(item, "finalEffect",  "name"));
        addCol(tv, "Effect Type",        120, item -> getChildType(item, "finalEffect"));
        addCol(tv, "Effect Detect.",     80,  item -> getChildStr(item, "finalEffect",  "detectability"));
        addCol(tv, "Cause",              200, item -> getChildStr(item, "cause",         "name"));
        addCol(tv, "Cause Type",         120, item -> getChildType(item, "cause"));
        addCol(tv, "Cause Detect.",      80,  item -> getChildStr(item, "cause",         "detectability"));
        addCol(tv, "SEV",                50,  item -> getChildStr(item, "rpnCalculation","SEV"));
        addCol(tv, "OCC",                50,  item -> getChildStr(item, "rpnCalculation","OCC"));
        addCol(tv, "DET",                50,  item -> getChildStr(item, "rpnCalculation","DET"));
        addCol(tv, "RPN",                70,  item -> getStr(item, "RPN"));

        tv.setContentProvider(new IStructuredContentProvider() {
            @Override public Object[] getElements(Object input) {
                return getItems().toArray();
            }
        });
        tv.setInput(fmeaObject);
    }

    // ─────────────────────────────────────────────────────────────
    // Helpers
    // ─────────────────────────────────────────────────────────────

    @FunctionalInterface
    interface CellText { String get(EObject item); }

    private void addCol(TableViewer tv, String title, int width, CellText fn) {
        TableViewerColumn col = new TableViewerColumn(tv, SWT.NONE);
        col.getColumn().setText(title);
        col.getColumn().setWidth(width);
        col.getColumn().setResizable(true);
        col.setLabelProvider(new ColumnLabelProvider() {
            @Override public String getText(Object element) {
                return element instanceof EObject ? fn.get((EObject) element) : "";
            }
        });
    }

    private TableViewer makeTableViewer(Composite parent) {
        TableViewer tv = new TableViewer(parent,
                SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
        tv.getTable().setHeaderVisible(true);
        tv.getTable().setLinesVisible(true);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.heightHint = 200;
        tv.getTable().setLayoutData(gd);
        return tv;
    }

    private void stat(FormToolkit tk, Composite parent,
                       String label, String value) {
        Label l = tk.createLabel(parent, label);
        l.setFont(org.eclipse.jface.resource.JFaceResources.getFontRegistry()
                .getBold(org.eclipse.jface.resource.JFaceResources.DEFAULT_FONT));
        tk.createLabel(parent, value);
    }

    private List<?> getItems() {
        EStructuralFeature f =
                fmeaObject.eClass().getEStructuralFeature(ITEMS_FEATURE);
        if (f != null) {
            Object v = fmeaObject.eGet(f);
            if (v instanceof List) return (List<?>) v;
        }
        return java.util.Collections.emptyList();
    }

    private String getStr(EObject obj, String feat) {
        if (obj == null) return "";
        EStructuralFeature f = obj.eClass().getEStructuralFeature(feat);
        if (f == null) return "";
        Object v = obj.eGet(f);
        return v != null ? v.toString() : "";
    }

    private double getDoubleAttr(EObject obj, String feat) {
        try { return Double.parseDouble(getStr(obj, feat)); }
        catch (NumberFormatException e) { return 0; }
    }

    private EObject getChild(EObject parent, String feat) {
        if (parent == null) return null;
        EStructuralFeature f =
                parent.eClass().getEStructuralFeature(feat);
        if (f == null) return null;
        Object v = parent.eGet(f);
        if (v instanceof EObject) return (EObject) v;
        if (v instanceof List && !((List<?>) v).isEmpty())
            return (EObject) ((List<?>) v).get(0);
        return null;
    }

    private String getChildStr(EObject parent, String childFeat, String attr) {
        return getStr(getChild(parent, childFeat), attr);
    }

    private String getChildType(EObject parent, String childFeat) {
        EObject child = getChild(parent, childFeat);
        return child != null ? child.eClass().getName() : "";
    }
}
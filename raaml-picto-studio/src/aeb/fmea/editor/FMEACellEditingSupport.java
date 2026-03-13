package aeb.fmea.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

public class FMEACellEditingSupport extends EditingSupport {

    private final String featureName;
    private final FMEAOverviewPage page;
    private final TextCellEditor editor;

    public FMEACellEditingSupport(TableViewer viewer,
                                   String featureName,
                                   FMEAOverviewPage page) {
        super(viewer);
        this.featureName = featureName;
        this.page        = page;
        this.editor      = new TextCellEditor(viewer.getTable());
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
        return editor;
    }

    @Override
    protected boolean canEdit(Object element) {
        return true;
    }

    @Override
    protected Object getValue(Object element) {
        if (element instanceof EObject) {
            EObject obj = (EObject) element;
            EStructuralFeature f =
                    obj.eClass().getEStructuralFeature(featureName);
            if (f != null) {
                Object val = obj.eGet(f);
                return val != null ? val.toString() : "";
            }
        }
        return "";
    }

    @Override
    protected void setValue(Object element, Object value) {
        if (element instanceof EObject) {
            EObject obj = (EObject) element;
            EStructuralFeature f =
                    obj.eClass().getEStructuralFeature(featureName);
            if (f != null) {
                obj.eSet(f, value);
                getViewer().update(element, null);
                page.getFMEAEditor().markDirty();  // make this method package-visible
            }
        }
    }
}
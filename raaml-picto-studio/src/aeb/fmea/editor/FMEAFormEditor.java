package aeb.fmea.editor;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
public class FMEAFormEditor extends FormEditor {

    private Resource fmeaResource;
    private EObject fmeaObject;
    private boolean dirty = false;

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        super.init(site, input);
        setPartName("FMEA Editor");
        loadModel(input);
    }

    /**
     * Returns the workspace IFile for this editor input (if available).
     */
    private IFile getIFile(IEditorInput input) {
        if (input instanceof FileEditorInput) {
            return ((FileEditorInput) input).getFile();
        }
        return null;
    }
    private IFile findEcoreFile(IProject project) {
        final IFile[] result = {null};
        try {
            project.accept(new IResourceVisitor() {
                @Override
                public boolean visit(IResource resource) throws CoreException {
                    if (result[0] != null) return false; // already found
                    if (resource instanceof IFile) {
                        IFile f = (IFile) resource;
                        if ("ecore".equals(f.getFileExtension())) {
                            result[0] = f;
                            return false;
                        }
                    }
                    return true; // keep visiting
                }
            });
        } catch (CoreException e) {
            System.err.println("FMEAFormEditor: Error searching for .ecore: "
                    + e.getMessage());
        }
        return result[0];
    }
    
    /**
     * Loads the selected .xmi file into an EMF ResourceSet and resolves the
     * first 'analyses' element (expected to be the FMEA analysis instance).
     */
    private void loadModel(IEditorInput input) {

        IFile file = getIFile(input);
        if (file == null) {
            System.err.println("FMEAFormEditor: Input is not a FileEditorInput.");
            return;
        }

        // Step 1: Locate raaml.ecore in the same project
     // REPLACE WITH THIS:
        IFile ecoreFile = findEcoreFile(file.getProject());
        if (ecoreFile == null) {
            System.err.println("FMEAFormEditor: No .ecore file found anywhere in project: "
                    + file.getProject().getName()
                    + ". Please add raaml.ecore to the project.");
            return;
        }
        System.out.println("FMEAFormEditor: Found ecore at: " + ecoreFile.getFullPath());

        URI ecoreURI = URI.createPlatformResourceURI(
                ecoreFile.getFullPath().toString(), true);
        URI modelURI = URI.createPlatformResourceURI(
                file.getFullPath().toString(), true);

        // Step 2: Build a ResourceSet with all needed factories
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry()
          .getExtensionToFactoryMap()
          .put("ecore", new EcoreResourceFactoryImpl());
        rs.getResourceFactoryRegistry()
          .getExtensionToFactoryMap()
          .put("xmi",   new XMIResourceFactoryImpl());
        rs.getResourceFactoryRegistry()
          .getExtensionToFactoryMap()
          .put("fmea",  new XMIResourceFactoryImpl());

        try {
            // Step 3: Load the ecore metamodel
            Resource ecoreRes = rs.getResource(ecoreURI, true);
            ecoreRes.load(null);

            if (ecoreRes.getContents().isEmpty()) {
                System.err.println("FMEAFormEditor: raaml.ecore is empty!");
                return;
            }

            // Step 4: Register ALL packages into BOTH the global registry
            //         AND the ResourceSet's local package registry
            for (EObject obj : ecoreRes.getContents()) {
                if (obj instanceof EPackage) {
                    registerPackageRecursive((EPackage) obj, rs);
                }
            }

            // Step 5: Verify the known nsURI was actually registered
            String expectedNsURI = "http://edu.kit.sdq/dsis/metamodels/raaml";
            if (EPackage.Registry.INSTANCE.getEPackage(expectedNsURI) == null) {
                System.err.println("FMEAFormEditor: Package with nsURI '"
                        + expectedNsURI + "' was NOT registered! "
                        + "Check that raaml.ecore has this nsURI.");
                return;
            }
            System.out.println("FMEAFormEditor: Package registered OK: " + expectedNsURI);

         // Step 6: Load the model — create resource first, then load
         // This ensures the local RS registry is used, not the global one
         fmeaResource = rs.createResource(modelURI);
         fmeaResource.load(null);

            // Step 7: Report any load errors/warnings
            fmeaResource.getErrors().forEach(e ->
                System.err.println("Model ERROR: " + e.getMessage()
                        + " [line " + e.getLine() + "]"));
            fmeaResource.getWarnings().forEach(w ->
                System.out.println("Model WARNING: " + w.getMessage()));

            if (!fmeaResource.getErrors().isEmpty()) {
                System.err.println("FMEAFormEditor: Model has errors, aborting.");
                return;
            }

            if (fmeaResource.getContents().isEmpty()) {
                System.err.println("FMEAFormEditor: Model resource is empty.");
                return;
            }

            // Step 8: Navigate to the FMEA analysis object
            EObject root = fmeaResource.getContents().get(0);
            System.out.println("FMEAFormEditor: Root class = " + root.eClass().getName());

            EStructuralFeature analysesFeature =
                    root.eClass().getEStructuralFeature("analyses");
            if (analysesFeature == null) {
                System.err.println("FMEAFormEditor: No 'analyses' feature on: "
                        + root.eClass().getName());
                return;
            }

            @SuppressWarnings("unchecked")
            List<EObject> analyses = (List<EObject>) root.eGet(analysesFeature);
            if (analyses == null || analyses.isEmpty()) {
                System.err.println("FMEAFormEditor: 'analyses' list is empty.");
                return;
            }

            fmeaObject = analyses.get(0);
            System.out.println("FMEAFormEditor: FMEA object class = "
                    + fmeaObject.eClass().getName());

        } catch (Exception e) {
            System.err.println("FMEAFormEditor: Load failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private void registerPackageRecursive(EPackage pkg, ResourceSet rs) {
        if (pkg == null) return;
        String nsURI = pkg.getNsURI();
        System.out.println("FMEAFormEditor: Registering nsURI = " + nsURI);

        // Register in GLOBAL registry (used by default XMI loading)
        EPackage.Registry.INSTANCE.put(nsURI, pkg);

        // Register in ResourceSet-LOCAL registry (used by this specific RS)
        rs.getPackageRegistry().put(nsURI, pkg);

        for (EPackage sub : pkg.getESubpackages()) {
            registerPackageRecursive(sub, rs);
        }
    }
    @Override
    protected void addPages() {
        try {
            addPage(new FMEAOverviewPage(this, fmeaObject));
            addPage(new FMEASummaryPage(this, fmeaObject));
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        try {
            if (fmeaResource != null) {
                fmeaResource.save(null);
            }
            dirty = false;
            firePropertyChange(PROP_DIRTY);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doSaveAs() {
        doSave(null);
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    @Override
    public boolean isDirty() {
        return dirty;
    }

    public void markDirty() {
        dirty = true;
        firePropertyChange(PROP_DIRTY);
        autoSaveForPicto();
    }
    private void autoSaveForPicto() {
        if (fmeaResource == null) return;
        try {
            fmeaResource.save(null);
            // Refresh the IFile so Eclipse sees the change
            IFile file = getIFile(getEditorInput());
            if (file != null) {
                file.refreshLocal(IResource.DEPTH_ZERO, null);
            }
        } catch (Exception e) {
            // silent — auto-save is best-effort
        }
    }

    public EObject getFmeaObject() {
        return fmeaObject;
    }

    public Resource getFmeaResource() {
        return fmeaResource;
    }
}
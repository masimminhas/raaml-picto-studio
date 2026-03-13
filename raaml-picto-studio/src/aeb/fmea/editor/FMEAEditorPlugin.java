package aeb.fmea.editor;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class FMEAEditorPlugin extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "aeb.fmea.editor";
    private static FMEAEditorPlugin instance;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        instance = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        instance = null;
        super.stop(context);
    }

    public static FMEAEditorPlugin getInstance() {
        return instance;
    }
}
package raaml.picto.studio.startup;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;

import aeb.fmea.editor.FMEAEditorPlugin;

/**
 * Early-startup hook that shows a one-time welcome popup the first time the
 * workbench starts after the RAAML Picto Studio feature has been installed
 * or updated.
 * <p>
 * Whether the popup has already been shown is tracked in the plugin's
 * {@link IDialogSettings}, which are persisted across workbench restarts, so
 * the popup is only displayed once per installation.
 */
public class WelcomeStartup implements IStartup {

    private static final String SETTINGS_SECTION = "raaml.picto.studio.welcome";
    private static final String KEY_SHOWN = "shown";

    @Override
    public void earlyStartup() {
        FMEAEditorPlugin plugin = FMEAEditorPlugin.getInstance();
        if (plugin == null) {
            return;
        }

        IDialogSettings settings = plugin.getDialogSettings();
        IDialogSettings section = settings.getSection(SETTINGS_SECTION);
        if (section == null) {
            section = settings.addNewSection(SETTINGS_SECTION);
        }

        if (section.getBoolean(KEY_SHOWN)) {
            return;
        }
        section.put(KEY_SHOWN, true);

        Display.getDefault().asyncExec(() -> {
            Display display = Display.getDefault();
            if (display == null || display.isDisposed()) {
                return;
            }
            new WelcomeDialog(display.getActiveShell()).open();
        });
    }
}

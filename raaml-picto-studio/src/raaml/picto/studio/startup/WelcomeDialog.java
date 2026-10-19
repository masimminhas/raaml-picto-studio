package raaml.picto.studio.startup;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;

import aeb.fmea.editor.FMEAEditorPlugin;

/**
 * A simple one-time welcome popup shown the first time the workbench starts
 * after installing or updating the RAAML Picto Studio feature.
 */
public class WelcomeDialog extends Dialog {

    private static final String REPO_URL = "https://github.com/masimminhas/raaml-picto-studio";
    private static final String UPDATE_SITE_URL = "https://masimminhas.github.io/raaml-picto-studio/";

    private Image bannerImage;

    public WelcomeDialog(Shell parentShell) {
        super(parentShell);
        setShellStyle(getShellStyle() | SWT.RESIZE);
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Welcome to RAAML Picto Studio");
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout layout = new GridLayout(1, false);
        layout.marginWidth = 10;
        layout.marginHeight = 10;
        container.setLayout(layout);

        ImageDescriptor descriptor = FMEAEditorPlugin.getInstance() == null ? null
                : ImageDescriptor.createFromURL(
                        FMEAEditorPlugin.getInstance().getBundle().getEntry("icons/welcome_banner.png"));
        if (descriptor != null) {
            bannerImage = descriptor.createImage();
            Label imageLabel = new Label(container, SWT.NONE);
            imageLabel.setImage(bannerImage);
            imageLabel.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, false));
        }

        Label text = new Label(container, SWT.WRAP);
        text.setText(
                "RAAML Picto Studio is a model-driven safety analysis workbench built on Eclipse\n"
                + "Epsilon and Picto, providing live HTML visualizations for ISO 26262 safety\n"
                + "analyses (FMEA, FTA, HARA, STPA, GSN, HAZOP, Requirements).");
        GridData textData = new GridData(SWT.FILL, SWT.TOP, true, false);
        textData.widthHint = 460;
        text.setLayoutData(textData);

        Link link = new Link(container, SWT.NONE);
        link.setText("<a href=\"" + REPO_URL + "\">Source code on GitHub</a>\n"
                + "<a href=\"" + UPDATE_SITE_URL + "\">Update site</a>");
        link.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        link.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Program.launch(e.text);
            }
        });

        return container;
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    @Override
    public boolean close() {
        boolean result = super.close();
        if (bannerImage != null && !bannerImage.isDisposed()) {
            bannerImage.dispose();
        }
        return result;
    }
}

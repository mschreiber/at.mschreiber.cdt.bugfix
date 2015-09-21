package at.mschreiber.cdt.bugfix;

import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class InitializeDebugContext implements IStartup {

	@Override
	public void earlyStartup() {
	       IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	       if (window != null) {
	    	   DebugUITools.getDebugContextManager().getContextService(window);
	       }
	}

}

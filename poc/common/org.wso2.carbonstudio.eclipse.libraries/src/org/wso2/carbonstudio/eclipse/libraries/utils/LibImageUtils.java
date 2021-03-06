package org.wso2.carbonstudio.eclipse.libraries.utils;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.libraries.Activator;
import org.wso2.carbonstudio.eclipse.utils.ui.ImageUtils;

public class LibImageUtils extends ImageUtils {

	private static LibImageUtils INSTANCE;
	
	public ImageDescriptor getJarImage(){
		return getImageDescriptor("jar_obj.gif");
	}
	public static LibImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new LibImageUtils();
		}
		return INSTANCE;
	} 
	
	public Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}

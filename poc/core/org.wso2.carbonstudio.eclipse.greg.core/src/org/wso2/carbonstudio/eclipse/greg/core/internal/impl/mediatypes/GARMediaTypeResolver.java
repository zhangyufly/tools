package org.wso2.carbonstudio.eclipse.greg.core.internal.impl.mediatypes;

import org.wso2.carbonstudio.eclipse.platform.core.mediatype.AbstractFileNameExtensionMediaTypeResolver;

public class GARMediaTypeResolver extends AbstractFileNameExtensionMediaTypeResolver {

	public boolean isMediaType(String fileName) {
		return hasExtension(fileName,"gar");
	}

}

package com.x.bbs.assemble.control.jaxrs.permissioninfo.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionPermissionInfoProcess extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionPermissionInfoProcess( Throwable e, String message ) {
		super( message, e );
	}
}

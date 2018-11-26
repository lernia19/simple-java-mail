package org.simplejavamail.internal.util;

import org.simplejavamail.MailException;

// FIXME rename to ModuleLoaderException
// FIXME move to module package
public class LibraryLoaderException extends MailException {
	// FIXME make methods non-public
	public static final String ERROR_MODULE_MISSING = "%s module not found, make sure it is on the classpath (%s)";
	public static final String ERROR_LOADING_MODULE = "Error loading %s module...";
	
	public LibraryLoaderException(String message) {
		super(message);
	}
	
	public LibraryLoaderException(String message, Throwable cause) {
		super(message, cause);
	}
}

package org.simplejavamail.internal.util;

import org.simplejavamail.MailException;

// FIXME rename to ModuleLoaderException
// FIXME move to module package
public class LibraryLoaderException extends MailException {
	// FIXME make methods non-public
	public static final String ERROR_CLI_MODULE_MISSING = "CLI module not found, make sure it is on the classpath (https://github.com/simple-java-mail/cli-module)";
	public static final String ERROR_LOADING_CLI_MODULE = "Error loading CLI module...";
	
	LibraryLoaderException(String message) {
		super(message);
	}
	
	LibraryLoaderException(String message, Throwable cause) {
		super(message, cause);
	}
}

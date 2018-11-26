package org.simplejavamail.internal.modules;

/**
 * This interface only serves to hide the DKIM implementation behind an easy-to-load-with-reflection class.
 */
public interface CliModule {
	void runCLI(String[] args);
}
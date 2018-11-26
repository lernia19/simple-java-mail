package org.simplejavamail.internal.modules;

import org.simplejavamail.internal.util.LibraryLoaderException;
import org.simplejavamail.internal.util.MiscUtil;
import org.simplejavamail.internal.util.Provider;

import static org.simplejavamail.internal.util.SimpleOptional.ofNullable;

public class ModuleLoader {
	
	private static CliModule m = null;
	
	public static CliModule loadCliModule() {
		return (m = ofNullable(m).orElse(new Provider<CliModule>() {
			@Override
			public CliModule provide() {
				return MiscUtil.loadLibraryClass(
						"org.simplejavamail.internal.module.clisupport.CliModuleImpl",
						LibraryLoaderException.ERROR_CLI_MODULE_MISSING,
						LibraryLoaderException.ERROR_LOADING_CLI_MODULE);
			}
		}));
	}
}
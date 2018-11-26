package org.simplejavamail.internal.modules;

import org.simplejavamail.internal.util.LibraryLoaderException;
import org.simplejavamail.internal.util.Provider;

import javax.annotation.Nonnull;

import static java.lang.String.format;
import static org.simplejavamail.internal.util.MiscUtil.classAvailable;
import static org.simplejavamail.internal.util.SimpleOptional.ofNullable;

public class ModuleLoader {
	
	// FIXME replace with lookup map
	private static DKIMModule DKIM_MODULE = null;
	private static CliModule CLI_MODULE = null;
	private static OutlookModule OUTLOOK_MODULE = null;
	
	public static DKIMModule loadDKIMModule() {
		return (DKIM_MODULE = ofNullable(DKIM_MODULE)
				.orElse(ModuleLoader.<DKIMModule>produceModuleProvider(DKIMModule.MODULE_DESCRIPTOR)));
	}
	
	public static CliModule loadCliModule() {
		return (CLI_MODULE = ofNullable(CLI_MODULE)
				.orElse(ModuleLoader.<CliModule>produceModuleProvider(CliModule.MODULE_DESCRIPTOR)));
	}
	
	public static OutlookModule loadOutlookModule() {
		return (OUTLOOK_MODULE = ofNullable(OUTLOOK_MODULE)
				.orElse(ModuleLoader.<OutlookModule>produceModuleProvider(OutlookModule.MODULE_DESCRIPTOR)));
	}
	
	private static <T> Provider<T> produceModuleProvider(final ModuleDescriptor descr) {
		return new Provider<T>() {
			@Override
			public T provide() {
				return loadLibraryClass(
						descr.getModuleClass(),
						format(LibraryLoaderException.ERROR_MODULE_MISSING, descr.getModuleName(), descr.getModuleHome()),
						format(LibraryLoaderException.ERROR_LOADING_MODULE, descr.getModuleName()));
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T loadLibraryClass(@Nonnull String apiClassToLoad,
										  @Nonnull String libraryNotFoundMessage,
										  @Nonnull String otherExceptions) {
		if (!classAvailable(apiClassToLoad)) {
			throw new LibraryLoaderException(libraryNotFoundMessage);
		}
		
		try {
			return (T) Class.forName(apiClassToLoad).newInstance();
		} catch (Exception | NoClassDefFoundError e) {
			throw new LibraryLoaderException(otherExceptions, e);
		}
	}
}
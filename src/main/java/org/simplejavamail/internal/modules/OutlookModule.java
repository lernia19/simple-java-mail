package org.simplejavamail.internal.modules;

public interface OutlookModule {
	
	ModuleDescriptor MODULE_DESCRIPTOR = new ModuleDescriptor(
			"Outlook",
			"org.simplejavamail.internal.module.clisupport.OutlookModuleImpl",
			"https://github.com/simple-java-mail/outlook-module"
	);
}
package org.simplejavamail.internal.modules;

public interface CliModule {
	
	ModuleDescriptor MODULE_DESCRIPTOR = new ModuleDescriptor(
			"CLI",
			"org.simplejavamail.internal.module.clisupport.CliModuleImpl",
			"https://github.com/simple-java-mail/cli-module"
	);
	
	void runCLI(String[] args);
	
}
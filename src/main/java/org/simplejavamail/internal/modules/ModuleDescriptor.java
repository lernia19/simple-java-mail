package org.simplejavamail.internal.modules;

public class ModuleDescriptor {
	private final String moduleName;
	private final String moduleClass;
	private final String moduleHome;
	
	public ModuleDescriptor(String moduleName, String moduleClass, String moduleHome) {
		this.moduleName = moduleName;
		this.moduleClass = moduleClass;
		this.moduleHome = moduleHome;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public String getModuleClass() {
		return moduleClass;
	}
	
	public String getModuleHome() {
		return moduleHome;
	}
}

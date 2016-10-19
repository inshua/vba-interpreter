package org.siphon.visualbasic.runtime;

import org.siphon.visualbasic.ModuleDecl;

public class JavaModuleInstance extends ModuleInstance {

	private final Object instance;

	public Object getInstance() {
		return instance;
	}

	public JavaModuleInstance(ModuleDecl module, Object instance) {
		super(module);
		this.instance = instance;
		
	}

}

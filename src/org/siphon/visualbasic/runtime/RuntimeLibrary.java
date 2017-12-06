package org.siphon.visualbasic.runtime;

import java.util.HashMap;
import java.util.Map;

import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.VarDecl;

public class RuntimeLibrary {

	public Map<String, ModuleInstance> modules = new HashMap<>();
	
	public final Map<VarDecl, VbVariable> variables = new HashMap<>();

	private final Library library;

	public RuntimeLibrary(Library lib) {
		this.library = lib;
	}

	public Library getLibrary() {
		return library;
	}

}

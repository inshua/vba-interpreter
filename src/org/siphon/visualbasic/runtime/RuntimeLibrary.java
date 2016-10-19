package org.siphon.visualbasic.runtime;

import java.util.HashMap;
import java.util.Map;

import org.siphon.visualbasic.Library;

public class RuntimeLibrary {

	public Map<String, ModuleInstance> modules = new HashMap<>();
	private final Library library;

	public RuntimeLibrary(Library lib) {
		this.library = lib;
	}

	public Library getLibrary() {
		return library;
	}

}

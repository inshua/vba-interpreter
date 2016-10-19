package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleType;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.RuntimeLibrary;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbValue;

public class LoadLibraryStatement extends Statement {

	private Library lib;

	public LoadLibraryStatement(Library lib) {
		super(null);
		this.lib = lib;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) {
		RuntimeLibrary runtimeLib = new RuntimeLibrary(lib);
		frame.libs.put(lib.name.toUpperCase(), runtimeLib);
		
		for(ModuleDecl moduleDecl : lib.modules.values()){
			if(moduleDecl.moduleType ==  ModuleType.Module){
				ModuleInstance module = new ModuleInstance(moduleDecl);		// 只有module需要加载，类模块通过 NewStatement 装载（创建对象）
				runtimeLib.modules.put(moduleDecl.upperCaseName(), module);
			}
		}
		return null;
	}

}

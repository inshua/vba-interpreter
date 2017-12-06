package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.FormModuleDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.ModuleType;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.RuntimeLibrary;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVariable;

public class LoadLibraryStatement extends Statement {

	private Library lib;

	public LoadLibraryStatement(Library lib) {
		super(null);
		this.lib = lib;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		RuntimeLibrary runtimeLib = new RuntimeLibrary(lib);
		frame.libs.put(lib.name.toUpperCase(), runtimeLib);
		
		for(ModuleDecl moduleDecl : lib.modules.values()){
			if(moduleDecl.moduleType ==  ModuleType.Module){
				ModuleInstance instance = new ModuleInstance(moduleDecl);		// 只有module需要加载，类模块通过 NewStatement 装载（创建对象）
				runtimeLib.modules.put(moduleDecl.upperCaseName(), instance);
			} else if(moduleDecl.moduleType == ModuleType.Form) {
				FormModuleDecl fmdcl = (FormModuleDecl) moduleDecl;
				ModuleInstance instance = new ModuleInstance(moduleDecl);				
				VbValue value = instance.asVbValue();
				VbVariable var = fmdcl.getVarDecl().createVar();
				var.setReadonly(true);
				var.value = value;
				instance.initializeClass(interpreter, frame);
				runtimeLib.variables.put(fmdcl.getVarDecl(), var);
			}
		}
		return null;
	}

}

package org.siphon.visualbasic.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.MeDecl;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.VbDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.framework.vba.VBALibrary;
import org.siphon.visualbasic.runtime.statements.GotoStatement;

public class CallFrame {

	public final Map<String, RuntimeLibrary> libs;

	public final Map<VarDecl, VbVariable> local = new HashMap<>();

	public final ModuleInstance module;

	public MethodDecl method;

	public int nextStatement = 0;

	public Stack<Integer> gosubResumeStack = new Stack<>(); // gosub 用的 return 退回点

	public VbValue withObject;

	public GotoStatement errorHandler;

	public final ErrObject error = new ErrObject();

	public GotoStatement prevErrorHandler;

	public int statementIndex = 0;

	public CallFrame(Map<String, RuntimeLibrary> global, ModuleInstance moduleInstance, MethodDecl method) {
		this.libs = global;
		this.module = moduleInstance;
		this.method = method;
	}

	public VbVariable locateVbVariable(VarDecl varDecl, ModuleInstance moduleInstance) {
		if(varDecl instanceof MeDecl){
			return VbVariable.ME;
		}
		
		if (varDecl.methodDecl == null || varDecl.isStatic) {
			if (varDecl.module == this.module.getModuleDecl()) {
				return this.module.variables.get(varDecl);
			} else {
				if (moduleInstance == null) {
					String libName = varDecl.module.library.name.toUpperCase();
					RuntimeLibrary lib = (RuntimeLibrary) libs.get(libName);
					moduleInstance = lib.modules.get(varDecl.module.name.toUpperCase());
				}
				return moduleInstance.variables.get(varDecl);
			}
		} else {
			if(varDecl.isImplicit){
				if(local.containsKey(varDecl) == false){
					local.put(varDecl, varDecl.createVar());
				}
			}
			return local.get(varDecl);
		}
	}
	
	public VbVariable locateVbVariable(VarDecl varDecl) {
		return this.locateVbVariable(varDecl, null);
	}

	public VbValue getFunctionResult() {
		return local.get(method.result).value;
	}

	public ModuleInstance locateRuntimeModule(ModuleMemberDecl decl) {
		RuntimeLibrary runtimeLib = (RuntimeLibrary) libs.get(decl.library.upperCaseName());
		return runtimeLib.modules.get(decl.module.upperCaseName());
	}

	public MethodDecl locateVbMethod(VbDecl decl) {
		return (MethodDecl) decl;
	}

	@Override
	public String toString() {
		return String.format("Call Frame @(%s) \r\n%s", method.name, StringUtils.join(local.values(), "\r\n"));
	}

	public Statement getCurrentStatement() {
		return this.method.statements.get(this.statementIndex);
	}

	public Map<VarDecl, VbVariable> getVariables(){
		return MapUtils.unmodifiableMap(this.local);
	}
}

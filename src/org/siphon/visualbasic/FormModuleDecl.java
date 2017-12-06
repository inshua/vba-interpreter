package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.compile.CompileException;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.ImplementorClassModuleDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.vb.Form;
import org.siphon.visualbasic.runtime.statements.AssignStatement;
import org.siphon.visualbasic.runtime.statements.EvalAssignableStatement;
import org.siphon.visualbasic.runtime.statements.NewStatement;

import vba.VbaParser.EventStmtContext;
import vba.VbaParser.ImplementsStmtContext;

public class FormModuleDecl extends ClassModuleDecl {

	private final ControlDef controlDef;
	
	private VarDecl varDecl;

	public FormModuleDecl(Library library, Compiler compiler, ControlDef controlDef) {
		super(library, compiler);
		this.controlDef = controlDef;
		this.moduleType = ModuleType.Form;
		
		for(ControlDef child : controlDef.getChildren()) {
			VbVarType type = child.getType();			
			VarDecl control = new VarDecl(this.library, this);
			control.visibility = Visibility.PRIVATE;
			control.varType = type;
			control.name = child.getName();
			control.withEvents = true;
			control.withNew = true;
			this.addMember(control);
		}
	}
	

	protected void addTheBaseObjDecl() {
		VarDecl c = new VarDecl(this.library, this);
		c.name = "Form";
		c.withEvents = true;
		c.visibility = Visibility.PRIVATE;	// TODO HIDDEN
		c.withNew = true;
		
		JavaClassModuleDecl formClass = (JavaClassModuleDecl) compiler.getVbLib().modules.get("FORM");
		ClassTypeDecl classTypeDecl = (ClassTypeDecl) compiler.getVbLib().types.get("FORM");
		c.varType = new VbVarType(VbVarType.vbObject, classTypeDecl, null, null);

		this.addMember(c);

		this.baseObject = c;
		
		this.implementClasses.add(classTypeDecl);
		for(VbDecl m : formClass.members.values()) {			
			this.addMember(m);
		}
	}

	public ControlDef getControlDef() {
		return controlDef;
	}


	public VarDecl getVarDecl() {
		return varDecl;
	}


	public void setVarDecl(VarDecl varDecl) {
		this.varDecl = varDecl;
	}


}

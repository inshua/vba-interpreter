package org.siphon.visualbasic.runtime.framework.vba;

import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.compile.JavaModuleDecl;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;


public class VBALibrary extends Library {

	private final VbVarType errorVarType;

	public VBALibrary(Compiler compiler) {
		super("VBA");

		JavaClassModuleDecl errClass = new JavaClassModuleDecl(this, compiler, ErrObject.class);
		this.addModule(errClass);
		this.errorVarType = new VbVarType(VbVarType.vbObject, this.types.get("ERROBJECT"), null, null);
		
		this.addModule(new JavaModuleDecl(this, compiler, Math.class));
		this.addModule(new JavaModuleDecl(this, compiler, DateTime.class));
		this.addModule(new JavaModuleDecl(this, compiler, Strings.class));
		this.addModule(new JavaModuleDecl(this, compiler, Interaction.class));
		this.addModule(new JavaModuleDecl(this, compiler, Information.class));

		this.addModule(new JavaClassModuleDecl(this, compiler, Collection.class));
	}

	public VbVarType getErrorVarType() {
		return errorVarType;
	}


	
}

package org.siphon.visualbasic.runtime.framework.vba;

import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.compile.JavaModuleDecl;
import org.siphon.visualbasic.runtime.ErrObject;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;


public class VBALibrary extends Library {

	private final VbVarType errorVarType;

	public VBALibrary() {
		super("VBA");
		
		this.addModule(new JavaModuleDecl(this, Math.class));
		this.addModule(new JavaModuleDecl(this, DateTime.class));
		this.addModule(new JavaModuleDecl(this, Strings.class));
		this.addModule(new JavaModuleDecl(this, Interaction.class));

		JavaClassModuleDecl errClass = new JavaClassModuleDecl(this, ErrObject.class);
		this.addModule(errClass);
		
		this.errorVarType = new VbVarType(VbVarType.vbObject, this.types.get("ERROBJECT"), null, null);

		this.addModule(new JavaClassModuleDecl(this, Collection.class));
	}

	public VbVarType getErrorVarType() {
		return errorVarType;
	}


	
}

package org.siphon.visualbasic.runtime.framework.vb;

import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.framework.vba.Collection;

public class VBLibrary extends Library{
	
	public VBLibrary(Compiler compiler) {
		super("VB");
		
		JavaClassModuleDecl formDecl = new JavaClassModuleDecl(this, compiler, Form.class);
		this.addModule(formDecl);
	}
	

}

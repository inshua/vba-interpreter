package org.siphon.visualbasic.runtime.framework.stdole;

import org.siphon.visualbasic.Library;
import org.siphon.visualbasic.compile.Compiler;
import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.framework.vba.Collection;

public class StdOleLibrary extends Library{
	
	public StdOleLibrary(Compiler compiler) {
		super("stdole");
		
		this.addModule(new JavaClassModuleDecl(this, compiler, StdFont.class));
	}
	

}

package org.siphon.visualbasic.runtime;

import org.siphon.visualbasic.ArgumentMode;
import org.siphon.visualbasic.VarDecl;

public class ArgumentDecl extends VarDecl {

	public ArgumentDecl() {
		super(null, null);
	}
	
	public boolean optional;
	public ArgumentMode mode;
	public boolean isParamArray;
	public VbValue defaultValue;
}

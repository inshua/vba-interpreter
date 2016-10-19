package org.siphon.visualbasic.compile;

import org.siphon.visualbasic.runtime.VbVarType;

public class VbFixedStringType extends VbVarType {

	public final long length;

	public VbFixedStringType(long length) {
		super(VbVarType.vbString);
		
		this.length = length;
	}

}

package org.siphon.visualbasic.runtime.framework.vba;

import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;

public class Strings {

	@VbMethod
	public static VbValue Mid(
			@VbParam(name = "String")
			VbValue string, 
			@VbParam(name = "Start", type = TypeEnum.vbLong)
			VbValue start, 
			@VbParam(name = "Length", optional = true)
			VbValue length){
		
		String s = (String) string.toJava();
		
		Long from = (Long) start.toJava() - 1;
		String result = null;
		if(length.isMissing()){
			result = s.substring(from.intValue());
		} else {
			result = s.substring(from.intValue(), from.intValue() + ((Number)length.toJava()).intValue());
		}
		
		return new VbValue(VbVarType.VbVariant, new VbValue(VbVarType.VbString, result));
	} 
}

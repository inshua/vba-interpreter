package org.siphon.visualbasic.runtime.framework.vba;

import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class Math {

	@VbMethod
	public static Double Sqr(Double Number){
		return java.lang.Math.sqrt(Number);
	}
	
	@VbMethod
	public static VbValue Abs(VbValue Number){
		if(Comparision.compare(Number, new VbValue(VbVarType.VbInteger, 0)) == -1){
			return MathExpr.neg(Number);
		} else {
			return Number;
		}
	}
}

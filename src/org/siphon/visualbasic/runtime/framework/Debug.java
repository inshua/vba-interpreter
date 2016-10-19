package org.siphon.visualbasic.runtime.framework;

import org.siphon.visualbasic.runtime.VbValue;

public class Debug {

	@VbMethod
	public void Print(VbValue object){
		if(object instanceof VbValue){
			if(object.isNull()){
				System.out.println("Null");
			} else {
				System.out.println(VbValue.CStr((VbValue) object).value);
			}
		} else {
			System.out.println(object);
		}
	}
	
	@VbMethod
	public void Trace(VbValue object){
		System.out.println(object);
	}
}

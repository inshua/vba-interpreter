package org.siphon.visualbasic.runtime.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.siphon.visualbasic.ArgumentMode;
import org.siphon.visualbasic.runtime.VbVarType;

@Target(value = ElementType.PARAMETER)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface VbParam {
	VbVarType.TypeEnum type() default VbVarType.TypeEnum.vbVariant;
	boolean paramArray() default false;
	boolean optional() default false;
	String defaultString() default "";
	int defaultInt() default 0;
	long defaultLong() default 0;
	double defaultDouble() default 0;
	float defaultFloat() default 0;
	ArgumentMode mode() default ArgumentMode.ByRef;
	boolean defaultBoolean() default false;
	String name();
}

package org.siphon.visualbasic.runtime.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface VbMethod {
	public boolean isDefault() default false;
	public boolean isIterator() default false;
	public boolean isDictionary() default false;
	/**
	 * accept Interpreter and Frame as first 2 arguments
	 * @return
	 */
	public boolean withIntepreter() default false;
	public String value() default "";
}

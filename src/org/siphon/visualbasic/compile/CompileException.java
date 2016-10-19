package org.siphon.visualbasic.compile;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.siphon.visualbasic.SourceLocation;

public class CompileException extends Exception {
	
	public static final String AMBIGUOUS_LIBRARY = "ambiguous library for library name %s";
	protected static final String SYNTAX_ERROR = "%s: syntax error: %s";
	public static final String AMBIGUOUS_IDENTIFIER = "%s: ambiguous identifier: %s";
	public static final String AMBIGUOUS_MODULE = "ambiguous module %s";
	public static final String LABEL_NOT_DEFINED = "%s: label not defined: %s";
	public static final String SHOULD_BE = "%s: %s should be %s";
	public static final String AMBIGUOUS_LABEL = "%s: ambiguous label: %s";
	public static final String ARRAY_OR_PROCEDURE_REQUIRED = "%s: array or procedure required: %s";
	public static final String COLLECTION_REQUIRED = "%s: collection required: %s";
	public static final String RANK_ERROR = "%s: rank error: %s";
	public static final String UNKOWN_TYPE = "%s: unknown type: %s";
	public static final String CANNOT_MODIFY_CONST = "%s: const cannot assign: %s";
	public static final String UNKOWN_VALUE = "%s: unknown value: %s";
	public static final String UNKNOWN_MEMBER = "%s: unknown member: %s";
	public static final String CANNOT_BE_FIXED_LENGTH_STRING = "%s: cannot be fixed length string: %s";
	public static final String NOT_MEMBER_TYPE = "%s: will never has member %s";
	public static final String FUNCTION_CANNOT_ASSIGN = "%s: %s is function/sub, cannot assign value";
	public static final String IS_NOT_CLASS = "%s: %s is not a class";
	public static final String IS_KEYWORD = "%s: %s is a keyword";
	public static final String UNSUPPORT_FEATURE = "%s: unspported feature: %s";
	public static final String PROPERTY_NOT_MATCH = "%s: property decl not match: %s";
	public static final String MUST_IN_CLASSMODULE = "%s: must put in class module: %s";
	public static final String ARGUMENT_COUNT_MISMATCH = "%s: arguments count mismatch: %s";
	public static final String ARGUMENT_TYPE_MISMATCH = "%s: argument type mismatch: %s";
	public static final String OVERFLOW = "%s: value overflow: %s";
	public static final String TYPE_MISMATCH = "%s: type mismatch: %s";
	public static final String DEFAULT_MEMBER_REQUIRED = "%s: default member required: %s";
	public static final String TYPE_HINT_MISMATCH = "%s: type hint not match to type clause: %s";
	public static final String IMPLEMENT_NOT_MATCH = "%s: implement '%s' not match for '%s'";
	public static String IMPLEMENT_NOT_FOUND = "%s: '%s' not implement for '%s'";
	private SourceLocation sourceLocation;
	
	public SourceLocation getSourceLocation() {
		return sourceLocation;
	}

	public CompileException(SourceLocation sourceLocation, String message, Object... words){
		super(String.format(message, processWords(sourceLocation, words)));
		
		this.sourceLocation = sourceLocation;
	}

	private static Object[] processWords(Object start, Object[] words) {
		Object[] arr = new Object[words.length+1];
		arr[0] = start;
		for (int i = 0; i < words.length; i++) {
			Object w = words[i];
			if(w instanceof ParserRuleContext){
				arr[i+1] = ((ParserRuleContext) w).getText();
			} else if(w instanceof Token){
				arr[i+1] = ((Token) w).getText();
			} else {
				arr[i+1] = w;
			}
		}
		return arr;
	}
	
}

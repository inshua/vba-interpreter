package org.siphon.visualbasic.runtime;

import java.util.Arrays;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.framework.VbMethod;

// 为 VBRuntimeException 提供一个包装，方便与VB适配
public class ErrObject{

	private static final long serialVersionUID = 1L;

	public ErrObject(long number) {
		this.number = number;
	}

	public void Clear(){
		this.number = 0;
		this.description = null;
		this.helpContext = 0;
		this.helpFile = null;
		this.lastDllError = 0;
		this.source = null;
		this.statementIndex = 0;
		this.handled = true;
	}
	
	private String description;
	
	private long helpContext;
	
	private String helpFile;
	
	private long lastDllError;
	
	private long number;
	
	private String source;
	
	private boolean handled;
	
	private int statementIndex;

	private SourceLocation sourceLocation;

	private VbRuntimeException vbRuntimeException;

	public void Raise(long Number) throws VbRuntimeException{	// 由 interpreter 捕获，生成 VbRuntimeException，再转为 ErrObject
		throw new VbRuntimeException((int)Number, SourceLocation.ByInterpreter);
	}
	
	public ErrObject(){
	}
	
	@VbMethod
	public String getDescription() {
		return description;
	}
	
	@VbMethod
	public void setDescription(String description) {
		this.description = description;
	}

	public long getHelpContext() {
		return helpContext;
	}

	public void setHelpContext(long helpContext) {
		this.helpContext = helpContext;
	}

	public String getHelpFile() {
		return helpFile;
	}

	public void setHelpFile(String helpFile) {
		this.helpFile = helpFile;
	}

	public long getLastDllError() {
		return lastDllError;
	}

	public void setLastDllError(long lastDllError) {
		this.lastDllError = lastDllError;
	}

	@VbMethod(isDefault = true)
	public long getNumber() {
		return number;
	}

	@VbMethod
	public void setNumber(long number) {
		this.number = number;
	}

	@VbMethod
	public String getSource() {
		return source;
	}

	@VbMethod
	public void setSource(String source) {
		this.source = source;
	}

	boolean isHandled() {
		return handled;
	}

	public void setHandled(boolean handled) {
		this.handled = handled;
	}

	public int getStatementIndex() {
		return statementIndex;
	}

	void setStatementIndex(int statementIndex) {
		this.statementIndex = statementIndex;
	}

	public SourceLocation getSourceLocation() {
		return sourceLocation;
	}

	public boolean hasError() {
		return this.number != 0 && this.handled == false;
	}

	public void wrap(VbRuntimeException e, CallFrame frame, SourceLocation sourceLocation) {
		this.number = e.code;
		this.description = e.getMessage();
		this.sourceLocation = sourceLocation;
		if(this.sourceLocation != null) this.source = this.sourceLocation.toString();
		this.statementIndex = frame.statementIndex;
		this.vbRuntimeException = e;
	}
	

	public VbRuntimeException getException() {
		return this.vbRuntimeException;
	}

}

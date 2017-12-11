/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;

public class IsStatement extends BinaryStatement {

	public IsStatement(SourceLocation sourceLocation, Statement v1, Statement v2) {
		super(sourceLocation, v1, v2);
	}


	@Override
	protected VbValue eval(VbValue value1, VbValue value2, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		if(value1.varType.vbType == VbVarType.vbVariant){
			value1 = (VbValue) value1.value;
		}
		if(value2.varType.vbType == VbVarType.vbVariant){
			value2 = (VbValue) value2.value;
		}
		
		if(value1.varType.vbType != VbVarType.vbObject)
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, this.v1.getSourceLocation());
		
		if(value2.varType.vbType != VbVarType.vbObject)
			throw new VbRuntimeException(VbRuntimeException.类型不匹配, this.v2.getSourceLocation());
		
		if(value1.value == value2.value){
			return new VbValue(VbVarType.VbBoolean, -1);
		} else {
			return new VbValue(VbVarType.VbBoolean, 0);
		}
	}

}

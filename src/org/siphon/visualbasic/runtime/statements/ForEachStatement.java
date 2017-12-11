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

import java.util.AbstractList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.iterators.ArrayIterator;
import org.apache.commons.collections.iterators.EnumerationIterator;
import org.apache.commons.lang3.ArrayUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.ClassTypeDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.MethodDecl;
import org.siphon.visualbasic.ModuleMemberDecl;
import org.siphon.visualbasic.PropertyDecl;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.compile.ValueStatementDesc;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;
import org.siphon.visualbasic.runtime.interaction.JavaArrayIterator;
import org.siphon.visualbasic.runtime.interaction.VbValueIterator;

public class ForEachStatement extends Statement {

	private VarDecl varDecl;
	private Statement collection;
	protected Iterator<VbValue> iterator;

	public ForEachStatement(SourceLocation sourceLocation, VarDecl var, Statement collection) {
		super(sourceLocation);
		this.varDecl = var;
		this.collection = collection;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		return null;
	}

	public Statement initStatement(SourceLocation sourceLocation) {
		return new Statement(sourceLocation) {

			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				VbValue col = collection.eval(interpreter, frame);
				if (col.varType.vbType == VbVarType.vbVariant) {
					col = (VbValue) col.value;
				}
				if (col.varType.vbType == VbVarType.vbArray) {
					VbArray arr = (VbArray) col;
					iterator = arr.iterator();
				} else if (col.varType.isJavaObject()) {
					if (col.value.getClass().isArray()) {
						iterator = new JavaArrayIterator(col.value);
					} else if (col.value instanceof Iterable) {
						iterator = new VbValueIterator(((Iterable) col.value).iterator());
					} else if (col.value instanceof Enumeration) {
						iterator = new VbValueIterator(new EnumerationIterator((Enumeration) col.value));
					} else if (col.value instanceof Map) {
						Map map = (Map) col.value;
						iterator = new VbValueIterator(map.values().iterator());
					}
				}
				if (iterator == null && col.isObject()) {
					ClassModuleDecl c = col.varType.getClassModuleDecl();
					ModuleMemberDecl it = (c != null ? c.getIteratorMember() : null);
					if (it == null) {
						throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
					}
					MethodDecl itMethod = null;
					if (it instanceof PropertyDecl) {
						PropertyDecl p = (PropertyDecl) it;
						if (p.get == null || p.get.arguments.size() > 0) {
							throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation);
						}
						itMethod = p.get;
					} else if (it instanceof MethodDecl) {
						itMethod = (MethodDecl) it;
						if (itMethod.arguments.size() > 0) {
							throw new VbRuntimeException(VbRuntimeException.无效的过程调用, sourceLocation);
						}
					}

					try {
						VbValue itr = interpreter.callMethod((ModuleInstance) col.value, itMethod);
						if (itr != null) {
							if (itr.value instanceof JavaModuleInstance) {
								JavaModuleInstance inst = (JavaModuleInstance) itr.value;
								Object obj = inst.getInstance();
								if (obj instanceof Iterator) {
									iterator = (Iterator) obj;
								}
							} else if (itr.value instanceof Iterator) {
								iterator = (Iterator<VbValue>) itr.value;
							}
						}
						if (iterator == null) {
							throw new VbRuntimeException(VbRuntimeException.类型不匹配, sourceLocation);
						}
					} catch (ArgumentException e) {
						// no arguments
					}
				}
				return null;
			}

			@Override
			public String toString() {
				return "For Each Iterator At " + varDecl;
			}
		};
	}

	public Statement advanceNext(SourceLocation sourceLocation) {
		return new Statement(sourceLocation) {

			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				VbVariable variable = frame.locateVbVariable(varDecl);
				variable.assign(iterator.next(), interpreter, frame, sourceLocation);
				return null;
			}

			@Override
			public String toString() {
				return "ForEach.Next";
			}
		};
	}

	public Statement hasNext(SourceLocation sourceLocation) {
		return new Statement(sourceLocation) {

			@Override
			public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
				return VbValue.fromJava(iterator.hasNext());
			}

			@Override
			public String toString() {
				return "ForEach.hasNext";
			}
		};
	}

}

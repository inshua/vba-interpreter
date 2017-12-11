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
package org.siphon.visualbasic.runtime;

import java.util.ArrayList;
import java.util.List;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ClassModuleDecl;
import org.siphon.visualbasic.EventDecl;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.ModuleDecl;
import org.siphon.visualbasic.compile.JavaEventDecl;
import org.siphon.visualbasic.runtime.framework.vb.Control;

public class JavaModuleInstance extends ModuleInstance {

	private final Object instance;

	public Object getInstance() {
		return instance;
	}

	public JavaModuleInstance(ModuleDecl module, Object instance) {
		super(module);
		this.instance = instance;

		if (module instanceof ClassModuleDecl) {
			ClassModuleDecl cmdcl = (ClassModuleDecl) module;
			mapJavaEvents(cmdcl);
		}
		
		if(instance instanceof VbBoundObject) {
			((VbBoundObject) instance).setVbModuleInstance(this);
		}
	}

	private void mapJavaEvents(ClassModuleDecl cmdcl) {
		for (String event : cmdcl.events.keySet()) {
			JavaEventDecl decl = (JavaEventDecl) cmdcl.events.get(event);

			final VbEventHandler handler = new VbEventHandler() {
				@Override
				public void handle(Interpreter interpreter, CallFrame callFrame,Object... arguments) throws VbRuntimeException, ArgumentException {
					JavaModuleInstance inst = JavaModuleInstance.this;
					List<VbValue> args = new ArrayList<>();
					if(inst.instance instanceof Control) {
						Control control = (Control)inst.instance;
						if(control.getIndex() != null) {	// 控件数组成员
							args.add(VbValue.fromJava(control.getIndex()));
						}
					}
					for (int i = 0; i < arguments.length; i++) {
						args.add(VbValue.fromJava(arguments[i]));
					}
					inst.raiseEvent(decl, args, interpreter, callFrame);
				}
			};
			try {
				if (decl.javaField.getType().isAssignableFrom(VbEventHandler.class)) {
					decl.javaField.set(this.instance, handler);
				} else {
					List<VbEventHandler> handlers = (List<VbEventHandler>) decl.javaField.get(this.instance);
					handlers.add(handler);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				
			}

		}
	}

}

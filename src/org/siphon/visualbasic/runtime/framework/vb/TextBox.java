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
package org.siphon.visualbasic.runtime.framework.vb;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ControlDef;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.stdole.StdFont;

public class TextBox extends Control {

	JTextComponent textComponent;
	
	@Override
	public void load(Form form, String name, ControlDef controlDef, Control container, Interpreter interpreter) throws VbRuntimeException, ArgumentException {
		super.load(form, name, controlDef, container, interpreter);
		
		Map<String, VbValue> attrs = controlDef.getAttributes();
		this.setText((String) attrs.get("Text").toJava());
		
		if(attrs.containsKey("Alignment")) {
			this.setAlignment(((Number)attrs.get("Alignment").toJava()).intValue());
		}
		
	}

	@VbMethod
	private void setAlignment(Integer alignment) {
		if(textComponent instanceof JTextField) {
			JTextField tf = ((JTextField) textComponent);
			switch(alignment) {
			case 0:
				tf.setHorizontalAlignment(JTextField.LEFT);
				break;
			case 1:
				tf.setHorizontalAlignment(JTextField.RIGHT);
				break;
			case 2:
				tf.setHorizontalAlignment(JTextField.CENTER);
				break;
			}
		}
	}
	
	@VbMethod
	private Integer getAlignment() {
		if(textComponent instanceof JTextField) {
			JTextField tf = ((JTextField) textComponent);
			switch(tf.getHorizontalAlignment()) {
			case JTextField.LEFT:
				return 0;
			case JTextField.RIGHT:
				return 1;
			case JTextField.CENTER:
				return 2;
			}
		}
		return 0;
	}

	@VbMethod(isDefault=true)
	public String getText() throws VbRuntimeException, ArgumentException {
		return textComponent.getText();
	}
	
	@VbMethod(isDefault=true)
	public void setText(String text) throws VbRuntimeException, ArgumentException {
		textComponent.setText(text);
	}

	@Override
	protected Component createComponent() {
		return this.textComponent = new JTextField();
	}

}

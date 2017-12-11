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

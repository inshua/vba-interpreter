package org.siphon.visualbasic.runtime.framework.vb;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.stdole.StdFont;

public class TextBox extends Control {

	JTextComponent textComponent;
	
	private StdFont font = new StdFont();
	
	public TextBox() {
		font.addOnchangeEventListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if(textComponent != null) {
					textComponent.setFont(font.toJavaFont());
				}
			}
		});
	}
	
	@VbMethod("Property Get Font() As StdFont")
	public StdFont getFont() {
		return this.font;
	}
	
	public void load(Form form, Interpreter interpreter) {
		this.form = form;
		this.component = textComponent = new JTextField();
		form.frame.add(textComponent);
	}

	@VbMethod(isDefault=true)
	public String getText() throws VbRuntimeException, ArgumentException {
		return textComponent.getText();
	}
	
	@VbMethod(isDefault=true)
	public void setText(String text) throws VbRuntimeException, ArgumentException {
		textComponent.setText(text);
	}

}

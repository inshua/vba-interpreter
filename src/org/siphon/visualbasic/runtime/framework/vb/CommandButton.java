package org.siphon.visualbasic.runtime.framework.vb;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ControlDef;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbEventHandler;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbEvent;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class CommandButton extends Control{

	@VbEvent("Event Click()")
	public VbEventHandler onclick = null;

	JButton button;
	
	@Override
	public void load(Form form, String name, ControlDef controlDef, Control container, Interpreter interpreter) throws VbRuntimeException, ArgumentException {
		super.load(form, name, controlDef, container, interpreter);
		
		Map<String, VbValue> attrs = controlDef.getAttributes();
		this.setCaption((String) attrs.get("Caption").toJava());
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(onclick != null) {
					try {
						onclick.handle(interpreter, null);
					} catch (VbRuntimeException e1) {
						e1.printStackTrace();
					} catch (ArgumentException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}

	@VbMethod
	public String getCaption() throws VbRuntimeException, ArgumentException {
		return button.getText();
	}
	
	@VbMethod
	public void setCaption(String caption) throws VbRuntimeException, ArgumentException {
		button.setText(caption);
	}

	@Override
	protected Component createComponent() {
		return button = new JButton();
	}

}

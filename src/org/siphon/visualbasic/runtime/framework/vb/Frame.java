package org.siphon.visualbasic.runtime.framework.vb;

import java.awt.Component;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ControlDef;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class Frame extends Control {

	private JPanel panel;
	private String caption = "";

	@Override
	public void load(Form form, String name, ControlDef controlDef, Control container, Interpreter interpreter)
			throws VbRuntimeException, ArgumentException {
		super.load(form, name, controlDef, container, interpreter);
		
		Map<String, VbValue> attrs = controlDef.getAttributes();
		this.setCaption((String) attrs.get("Caption").toJava());
	}
	
	@Override
	protected Component createComponent() {
		panel = new JPanel();
		panel.setLayout(null);
		return panel;
	}

	@VbMethod
	public String getCaption() throws VbRuntimeException, ArgumentException {
		return this.caption;
	}
	
	@VbMethod
	public void setCaption(String caption) throws VbRuntimeException, ArgumentException {
		this.caption = caption;
		panel.setBorder(BorderFactory.createTitledBorder(caption));
	}

}

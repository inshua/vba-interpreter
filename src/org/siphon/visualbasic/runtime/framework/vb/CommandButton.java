package org.siphon.visualbasic.runtime.framework.vb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbEventHandler;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.framework.VbEvent;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class CommandButton {

	@VbEvent("Event Click()")
	public VbEventHandler onclick = null;

	JButton button;
	private Form form;

	public void load(Form form, Interpreter interpreter) {
		this.form = form;
		button = new JButton();
		form.frame.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(onclick != null) {
					try {
						onclick.handle(interpreter, interpreter.getCurrentFrame());
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
	public Integer getTop() {
		return form.fromPixel(button.getY(), 1);
	}

	@VbMethod
	public void setTop(Integer top) {
		button.setLocation(button.getX(), form.toPixel(top, 1));
	}

	@VbMethod
	public Integer getLeft() {
		return form.fromPixel(button.getX(), 1);
	}

	@VbMethod
	public void setLeft(Integer left) {
		button.setLocation(form.toPixel(left, 1), button.getX());
	}

	@VbMethod
	public Integer getWidth() {
		return form.fromPixel(button.getWidth(), 1);
	}

	@VbMethod
	public void setHeight(Integer height) {
		button.setSize(button.getWidth(), form.toPixel(height, 1));
	}

	@VbMethod
	public Integer getHeight() {
		return form.fromPixel(button.getHeight(), 1);
	}

	@VbMethod
	public void setWidth(Integer width) {
		button.setSize(form.toPixel(width, 1), button.getHeight());
	}
	
	@VbMethod
	public String getCaption() throws VbRuntimeException, ArgumentException {
		return button.getText();
	}
	
	@VbMethod
	public void setCaption(String caption) throws VbRuntimeException, ArgumentException {
		button.setText(caption);
	}

}

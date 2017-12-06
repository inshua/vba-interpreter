package org.siphon.visualbasic.runtime.framework.vb;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class TextBox {

	JTextComponent textComponent;
	private Form form;

	public void load(Form form) {
		this.form = form;
		textComponent = new JTextField();
		form.frame.add(textComponent);
	}

	@VbMethod
	public Integer getTop() {
		return form.fromPixel(textComponent.getY(), 1);
	}

	@VbMethod
	public void setTop(Integer top) {
		textComponent.setLocation(textComponent.getX(), form.toPixel(top, 1));
	}

	@VbMethod
	public Integer getLeft() {
		return form.fromPixel(textComponent.getX(), 1);
	}

	@VbMethod
	public void setLeft(Integer left) {
		textComponent.setLocation(form.toPixel(left, 1), textComponent.getX());
	}

	@VbMethod
	public Integer getWidth() {
		return form.fromPixel(textComponent.getWidth(), 1);
	}

	@VbMethod
	public void setHeight(Integer height) {
		textComponent.setSize(textComponent.getWidth(), form.toPixel(height, 1));
	}

	@VbMethod
	public Integer getHeight() {
		return form.fromPixel(textComponent.getHeight(), 1);
	}

	@VbMethod
	public void setWidth(Integer width) {
		textComponent.setSize(form.toPixel(width, 1), textComponent.getHeight());
	}
}

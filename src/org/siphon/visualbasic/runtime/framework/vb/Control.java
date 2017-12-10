package org.siphon.visualbasic.runtime.framework.vb;

import javax.swing.JComponent;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.VbBoundObject;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class Control extends VbBoundObject {

	protected JComponent component;
	
	protected String name = "";
	
	protected Form form;
	
	protected Integer index = null;		// 控件数组索引  
	
	protected String tag = "";
	
	@VbMethod
	public Integer getIndex() {
		return index;
	}

	@VbMethod
	public void setIndex(Integer index) {
		this.index = index;
	}

	public void load(Form form, String name, Interpreter interpreter) {
		
	}
	
	@VbMethod
	public Integer getTop() {
		return form.fromPixel(component.getY(), 1);
	}

	@VbMethod
	public void setTop(Integer top) {
		component.setLocation(component.getX(), form.toPixel(top, 1));
	}

	@VbMethod
	public Integer getLeft() {
		return form.fromPixel(component.getX(), 1);
	}

	@VbMethod
	public void setLeft(Integer left) {
		component.setLocation(form.toPixel(left, 1), component.getX());
	}

	@VbMethod
	public Integer getWidth() {
		return form.fromPixel(component.getWidth(), 1);
	}

	@VbMethod
	public void setHeight(Integer height) {
		component.setSize(component.getWidth(), form.toPixel(height, 1));
	}

	@VbMethod
	public Integer getHeight() {
		return form.fromPixel(component.getHeight(), 1);
	}

	@VbMethod
	public void setWidth(Integer width) {
		component.setSize(form.toPixel(width, 1), component.getHeight());
	}

	@VbMethod
	public String getTag() {
		return tag;
	}

	@VbMethod
	public void setTag(String tag) {
		this.tag = tag;
	}

	@VbMethod
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

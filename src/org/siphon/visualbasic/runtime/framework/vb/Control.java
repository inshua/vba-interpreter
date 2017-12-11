package org.siphon.visualbasic.runtime.framework.vb;

import java.awt.Component;
import java.awt.Container;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.ControlDef;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.VbBoundObject;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.stdole.StdFont;

public abstract class Control extends VbBoundObject {

	protected Component component;
	
	protected String name = "";
	
	protected Form form;
	
	protected Integer index = null;		// 控件数组索引  
	
	protected String tag = "";
	
	protected Control container = null;
	
	private StdFont font = new StdFont();
	
	public boolean isLoaded() {return this.component != null; }
	
	@VbMethod
	public Integer getIndex() {
		return index;
	}

	@VbMethod
	public void setIndex(Integer index) {
		this.index = index;
	}

	public void load(Form form, String name, ControlDef controlDef, Control container, Interpreter interpreter) throws VbRuntimeException, ArgumentException {
		this.form = form;
		this.name = name;
		this.container = container;
		this.component = this.createComponent();
		if(this.container != null) {
			((Container)container.component).add(this.component);
		}
		
		Map<String, VbValue> attrs = controlDef.getAttributes();
		setSize(attrs);
		setLocation(attrs);
		if(attrs.containsKey("Index")) {
			this.index = ((Number)attrs.get("Index").toJava()).intValue();
		}
		
		if(attrs.containsKey("Tag")) this.tag = (String) attrs.get("Tag").toJava(); 
		
		ControlDef fontDef = controlDef.getComplexAttributes().get("Font");
		if(fontDef != null) this.setFont(fontDef.getAttributes(), interpreter);
		font.addOnchangeEventListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if(component != null) {
					component.setFont(font.toJavaFont());
				}
			}
		});
	}

	private void setLocation(Map<String, VbValue> attrs) {
		if(attrs.containsKey("Top") && attrs.containsKey("Left")) {
			Number top = (Number) attrs.get("Top").toJava();
			Number left =  (Number) attrs.get("Left").toJava();
			int t = form.toPixel(top.intValue(), 1);
			int l = form.toPixel(left.intValue(), 1);
			this.component.setLocation(l, t);
		}
	}

	private void setSize(Map<String, VbValue> attrs) {
		if(attrs.containsKey("Width") && attrs.containsKey("Height")) {
			Number width = (Number) attrs.get("Width").toJava();
			Number height = (Number) attrs.get("Height").toJava();
			
			int w = form.toPixel(width.intValue(), 1);
			int h = form.toPixel(height.intValue(), 1);
			this.component.setSize(w, h);
		}
	}
	
	private void setFont(Map<String, VbValue> attributes, Interpreter interpreter) throws VbRuntimeException, ArgumentException {
		String name = (String) attributes.get("Name").toJava();
		Number size = (Number) attributes.get("Size").toJava();
		Number charset = (Number) attributes.get("Charset").toJava();
		Number weigth = (Number) attributes .get("Weight").toJava();
		Number underline = (Number) attributes.get("Underline").toJava();
		Number italic = (Number) attributes.get("Italic").toJava();
		Number strikethrough = (Number) attributes.get("Strikethrough").toJava();
        
		font.setName(interpreter, interpreter.getCurrentFrame(), name);
		font.setSize(interpreter, interpreter.getCurrentFrame(), size.doubleValue());
		font.setCharset(interpreter, interpreter.getCurrentFrame(), charset.intValue());
		font.setWeight(interpreter, interpreter.getCurrentFrame(), weigth.intValue());
		font.setUnderline(interpreter, interpreter.getCurrentFrame(), !underline.equals(0));
		font.setItalic(interpreter, interpreter.getCurrentFrame(), !italic.equals(0));
		font.setStrikethrough(interpreter, interpreter.getCurrentFrame(), !strikethrough.equals(0));
	}

	
	protected abstract Component createComponent();
	
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
	
	@VbMethod("Property Get Font() As StdFont")
	public StdFont getFont() {
		return this.font;
	}
	
	
}

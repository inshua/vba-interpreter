package org.siphon.visualbasic.runtime.framework.stdole;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbBindObject;
import org.siphon.visualbasic.runtime.VbEventHandler;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.framework.VbEvent;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class StdFont extends VbBindObject{
	
	@VbEvent("Event FontChanged(PropertyName As String)")
	public VbEventHandler fontChanged = null;
	
	private List<PropertyChangeListener> onchanged = new ArrayList<>();
	
	public void addOnchangeEventListener(PropertyChangeListener listener) {
		this.onchanged.add(listener);
	}
	
	private Boolean bold = false;
	
	private void raiseChange(Interpreter interpreter, CallFrame callFrame, String property, Object oldValue, Object newValue) throws VbRuntimeException, ArgumentException {
		for(PropertyChangeListener lstn : onchanged) {
			lstn.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
		}
		if(fontChanged != null) 
			fontChanged.handle(interpreter, callFrame, property);
	}

	@VbMethod
	public Boolean getBold() {
		return bold;
	}
	
	@VbMethod(withIntepreter=true)
	public void setBold(Interpreter interpreter, CallFrame callFrame, Boolean bold) throws VbRuntimeException, ArgumentException {
		Boolean changed = bold != this.bold;
		if(changed) {
			Boolean old = this.bold;
			this.bold = bold;
			this.raiseChange(interpreter, callFrame, "Bold", old, bold);
		}
	}
	
	@VbMethod
	public Integer getCharset() {
		return charset;
	}
	
	@VbMethod(withIntepreter=true)
	public void setCharset(Interpreter interpreter, CallFrame callFrame, Integer charset) throws VbRuntimeException, ArgumentException {
		Boolean changed = charset != this.charset;
		if(changed) {
			Integer old = this.charset;
			this.charset = charset;
			this.raiseChange(interpreter, callFrame, "Charset", old, charset);
		}
	}
	
	@VbMethod
	public String getName() {
		return name;
	}
	
	@VbMethod(withIntepreter=true)
	public void setName(Interpreter interpreter, CallFrame callFrame, String name) throws VbRuntimeException, ArgumentException {
		Boolean changed = name != this.name;
		if(changed) {
			String old = this.name;
			this.name = name;
			this.raiseChange(interpreter, callFrame, "Name", old, name);
		}
	}
	
	@VbMethod
	public Double getSize() {
		return size;
	}
	
	@VbMethod(withIntepreter=true)
	public void setSize(Interpreter interpreter, CallFrame callFrame, Double size) throws VbRuntimeException, ArgumentException {
		Boolean changed = size != this.size;
		if(changed) {
			Double old = this.size;
			this.size = size;
			this.raiseChange(interpreter, callFrame, "Size", old, size);
		}
	}
	
	@VbMethod
	public Boolean getStrikethrough() {
		return strikethrough;
	}
	
	@VbMethod(withIntepreter=true)
	public void setStrikethrough(Interpreter interpreter, CallFrame callFrame, Boolean strikethrough) throws VbRuntimeException, ArgumentException {
		Boolean changed = strikethrough != this.strikethrough;
		if(changed) {
			Boolean old = this.strikethrough;
			this.strikethrough = strikethrough;
			this.raiseChange(interpreter, callFrame, "Strikethrough", old, this.strikethrough);
		}
	}
	
	@VbMethod
	public Boolean getItalic() {
		return italic;
	}
	
	@VbMethod(withIntepreter=true)
	public void setItalic(Interpreter interpreter, CallFrame callFrame, Boolean italic) throws VbRuntimeException, ArgumentException {
		Boolean changed = italic != this.italic;
		if(changed) {
			Boolean old = this.italic;
			this.italic = italic;
			this.raiseChange(interpreter, callFrame, "Italic", old, italic);
		}
	}

	
	@VbMethod
	public Boolean getUnderline() {
		return underline;
	}
	
	@VbMethod(withIntepreter=true)
	public void setUnderline(Interpreter interpreter, CallFrame callFrame, Boolean underline) throws VbRuntimeException, ArgumentException {
		Boolean changed = underline != this.underline;
		if(changed) {
			Boolean old = this.underline;
			this.underline = underline;
			this.raiseChange(interpreter, callFrame, "Underline", old, underline);
		}
	}
	
	@VbMethod
	public Integer getWeight() {
		return weight;
	}
	
	@VbMethod(withIntepreter=true)
	public void setWeight(Interpreter interpreter, CallFrame callFrame, Integer weight) throws VbRuntimeException, ArgumentException {
		// https://msdn.microsoft.com/en-us/library/aa445770(v=vs.60).aspx
		if(weight > 400 && weight < 551) {
			this.setWeight(interpreter, callFrame, 400);
			return;
		}
		if(weight > 550 && weight != 700) {
			this.setWeight(interpreter, callFrame, 700);
			return;
		}
		
		Boolean changed = weight != this.weight;		
		if(changed) {
			Integer old = this.weight;
			this.weight = weight;
			this.raiseChange(interpreter, callFrame, "Weight", old, weight);
			
			if(weight == 400) {
				this.setBold(interpreter, callFrame, false);
			} else if(weight == 700) {
				this.setBold(interpreter, callFrame, true);
			}			
		}
	}
	private Integer charset = 0;
	private String name;
	private Double size = 0.0;
	private Boolean strikethrough = false;
	private Boolean underline = false;
	private Integer weight = 400;
	private Boolean italic = false;

	public Font toJavaFont() {
		int style = 0;
		if(this.bold) style |= Font.BOLD;
		if(this.italic) style |= Font.ITALIC;
		
		Map<TextAttribute, Object> fontAttributes = new HashMap<>();
		// fontAttributes.put(TextAttribute.WEIGHT, this.weight);
		if(this.underline) {
			fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		}
		if(this.strikethrough) {
			fontAttributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
		}
		// int weight = (int) (this.weight / 1440.0 * 72);	// twip -> inch -> pt
		return new Font(this.name, style, this.size.intValue())
				.deriveFont(fontAttributes);
	}
	
	
}

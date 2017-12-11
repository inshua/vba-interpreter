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
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.siphon.visualbasic.ArgumentException;
import org.siphon.visualbasic.Callback;
import org.siphon.visualbasic.ControlDef;
import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.VbEventHandler;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbEvent;
import org.siphon.visualbasic.runtime.framework.VbMethod;

// 类似 TheClass
public class Form extends Control {
	
	@VbEvent("Event Load()")
	public VbEventHandler onload = null;
	
	private Integer scaleMode = 1;	// 1-Twip
	
	JFrame frame = null;

	private Callback initFormCallback;

	private Integer scaleHeight;

	private Integer scaleWidth;
	
	private Integer startUpPosition = 0; // Manual
	
	@Override
	public void load(Form form, String name, ControlDef controlDef, Control container, Interpreter interpreter) throws VbRuntimeException, ArgumentException {
		super.load(null, name, controlDef, container, interpreter);
		
		Map<String, VbValue> attrs = controlDef.getAttributes();
		this.setCaption((String) attrs.get("Caption").toJava());
		this.setStartUpPosition(((Number)attrs.get("StartUpPosition").toJava()).intValue());
		
		this.setWidth(((Number)attrs.get("ClientWidth").toJava()).intValue());
		this.setHeight(((Number)attrs.get("ClientHeight").toJava()).intValue());
		this.setTop(((Number)attrs.get("ClientTop").toJava()).intValue());
		this.setLeft(((Number)attrs.get("ClientLeft").toJava()).intValue());
		
		if(attrs.containsKey("ScaleMode")) 
			this.setScaleMode(((Number)attrs.get("ScaleMode").toJava()).intValue());
		
		if(attrs.containsKey("ScaleHeight"))
			this.setScaleHeight(((Number)attrs.get("ScaleHeight").toJava()).intValue());
		
		if(attrs.containsKey("ScaleWidth"))
			this.setScaleWidth(((Number)attrs.get("ScaleWidth").toJava()).intValue());
		
		this.initFormCallback.run();
		
		if(onload != null) onload.handle(interpreter, interpreter.getCurrentFrame());		
	}
	

	@Override
	protected Component createComponent() {
		frame = new JFrame();

		frame.pack();
		frame.setLayout(null);
		return frame;
	}

	
	@VbMethod
	public void setHeight(Integer clientHeight) {
		clientHeight = toPixel(clientHeight, 1);
		
		Insets insets = frame.getInsets();
		frame.setSize(frame.getWidth(), clientHeight + insets.top + insets.bottom);
	}
	
	@VbMethod
	public void setWidth(Integer clientWidth) {
		clientWidth = toPixel(clientWidth, 1);
		Insets insets = frame.getInsets();
		frame.setSize(clientWidth + insets.left + insets.right, frame.getHeight());
	}
	
	public int toPixel(int length, int scaleMode) {
		int pixelPerInch = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
		switch(scaleMode) {
		case 2: // Point
			// 1 inch = 72 pt
			return (int) (length * pixelPerInch / 72.0); 
		case 3: // Pixel
			return length;
		case 4: // Character
			throw new RuntimeException("unsupport scale mode 'charactor'");
		case 5: // Inch
			return (int) (length *1.0 * pixelPerInch);
		case 6: // Millimeter
			// 1 inch = 25.4 mm
			return (int) (length * pixelPerInch / 24.5);
		case 7: // Centimeter
			// 1 inch = 2.54 cm
			return (int) (length * pixelPerInch / 2.45);
		case 0:	// User
			// TODO 用户定义Unit，从 ScaleHeight / Height 得到比例
		case 1:	// Twip
		default :
			//twip = inch 1/1440
			return (int)(length / 1440.0 * pixelPerInch);
		}
	}
	
	public int fromPixel(int pixel, int scaleMode) {
		int pixelPerInch = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
		switch(scaleMode) {
		case 2: // Point
			// 1 inch = 72 pt
			return (int) (pixel / pixelPerInch * 72.0); 
		case 3: // Pixel
			return pixel;
		case 4: // Character
			throw new RuntimeException("unsupport scale mode 'charactor'");
		case 5: // Inch
			return (int) (pixel * 1.0 / pixelPerInch);
		case 6: // Millimeter
			// 1 inch = 25.4 mm
			return (int) (pixel * 24.5 / pixelPerInch);
		case 7: // Centimeter
			// 1 inch = 2.54 cm
			return (int) (pixel * 2.45 / pixelPerInch);
		case 0:	// User
			// TODO 
		case 1:	// Twip
		default :
			//twip = inch 1/1440
			return (int)(pixel * 1440.0 / pixelPerInch);
		}
	}

	@VbMethod
	public Integer getHeight() {
		Insets insets = frame.getInsets();
		return fromPixel(frame.getHeight() - insets.top - insets.bottom, 1);
	}
	
	@VbMethod
	public Integer getWidth() {
		Insets insets = frame.getInsets();
		return fromPixel(frame.getWidth() - insets.left - insets.right, 1);
	}

	@VbMethod
	public String getCaption() throws VbRuntimeException, ArgumentException {
		return frame.getTitle();
	}
	
	@VbMethod
	public void setCaption( String caption) throws VbRuntimeException, ArgumentException {
		frame.setTitle(caption);
	}

	@VbMethod(value = "Sub Show()")
	public void show() throws VbRuntimeException, ArgumentException {
		frame.setVisible(true);
	}

	@VbMethod
	public Integer getScaleMode() {
		return scaleMode;
	}

	@VbMethod
	public void setScaleMode(Integer scaleMode) {
		this.scaleMode = scaleMode;
	}

	public void setInitForm(Callback initFormCallback) {
		this.initFormCallback = initFormCallback;
	}

	@VbMethod
	public Integer getScaleHeight() {
		return this.scaleHeight;
	}
	
	@VbMethod
	public Integer getScaleWidth() {
		return this.scaleWidth;
	}
	
	@VbMethod
	public void setScaleHeight(Integer scaleHeight) {
		this.scaleHeight = scaleHeight;
	}
	
	@VbMethod
	public void setScaleWidth(Integer scaleWidth) {
		this.scaleWidth = scaleWidth;
	}

	@VbMethod
	public Integer getLeft() {
		Point location = this.frame.getLocation();
		Insets insets = frame.getInsets();
		return this.fromPixel(location.x - insets.left, 1);
	}
	
	@VbMethod
	public Integer getClientTop() {
		Point location = this.frame.getLocation();
		Insets insets = frame.getInsets();
		return this.fromPixel(location.y - insets.top , 1);
	}
	
	@VbMethod
	public void setLeft(Integer clientLeft) {
		clientLeft = toPixel(clientLeft, 1);
		Insets insets = frame.getInsets();
		frame.setLocation(clientLeft - insets.left, frame.getY());
	}
	
	@VbMethod
	public void setTop(Integer clientTop) {
		clientTop = toPixel(clientTop, 1);
		Insets insets = frame.getInsets();
		frame.setLocation(frame.getX(), clientTop - insets.top);
	}
	
	@VbMethod
	public Integer getStartUpPosition() {
		return startUpPosition;
	}

	@VbMethod
	public void setStartUpPosition(Integer startUpPosition) {
		this.startUpPosition = startUpPosition;
		switch(startUpPosition) {
		case 0: // manul
		case 1: // center of owner
		case 2: // center of screen
			Dimension sz = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			frame.setLocation((sz.width - frame.getWidth()) / 2, 
					(sz.height - frame.getHeight()) / 2);
			break;
		case 3:	// default
			frame.setLocationByPlatform(true);
		}
	}

}

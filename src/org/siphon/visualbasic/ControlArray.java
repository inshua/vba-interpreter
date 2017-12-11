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
package org.siphon.visualbasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.siphon.visualbasic.compile.JavaClassModuleDecl;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.JavaModuleInstance;
import org.siphon.visualbasic.runtime.ModuleInstance;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.vb.Control;

// 控件数组
public class ControlArray {

	private List<VbValue> elements = new ArrayList<>();
	
	
	@VbMethod
	public Integer LBound(){
		int r = 0;
		for(VbValue el : elements){
			JavaModuleInstance mi = (JavaModuleInstance) el.getInstance();
			Control control = (Control) mi.getInstance();
			if(r > control.getIndex()) r = control.getIndex();
		}
		return r;
	}
	
	@VbMethod
	public Integer UBound(){
		int r = 0;
		for(VbValue el : elements){
			JavaModuleInstance mi = (JavaModuleInstance) el.getInstance();
			Control control = (Control) mi.getInstance();
			if(r < control.getIndex()) r = control.getIndex();
		}
		return r;
	}
	
	@VbMethod
	public Integer Count(){
		return elements.size();
	}
	
	// 编译 Form/UserControl 时, 控件数组的 Item 按相应控件类型偏分出 returnType
	@VbMethod(value = "Function Item(index As Integer) As Object", isDefault = true)
	public VbValue item(Integer index) throws VbRuntimeException{
		for(VbValue el : elements){
			JavaModuleInstance mi = (JavaModuleInstance) el.getInstance();
			Control control = (Control) mi.getInstance();
			if(control.getIndex() == index) 
				return el;
		}
		throw new VbRuntimeException(VbRuntimeException.控件数组元素不存在);
	}
	
	@VbMethod(isIterator=true)
	public Object iterator(){
		return elements.iterator();
	}

	public void add(VbValue controlInst) {
		this.elements.add(controlInst);
	}
}

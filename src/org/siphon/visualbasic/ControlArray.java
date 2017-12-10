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

	private List<JavaModuleInstance> elements = new ArrayList<>();
	
	
	@VbMethod
	public Integer LBound(){
		int r = 0;
		for(JavaModuleInstance el : elements){
			Control control = (Control) el.getInstance();
			if(r > control.getIndex()) r = control.getIndex();
		}
		return r;
	}
	
	@VbMethod
	public Integer UBound(){
		int r = 0;
		for(JavaModuleInstance el : elements){
			Control control = (Control) el.getInstance();
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
		for(JavaModuleInstance el : elements){
			Control control = (Control) el.getInstance();
			if(control.getIndex() == index) 
				return el.asVbValue();
		}
		throw new VbRuntimeException(VbRuntimeException.控件数组元素不存在);
	}
	
	@VbMethod(isIterator=true)
	public Object iterator(){
		return elements.iterator();
	}

	public void add(JavaModuleInstance controlInst) {
		this.elements.add(controlInst);
	}
}

package org.siphon.visualbasic.runtime.framework.vba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVarType.TypeEnum;
import org.siphon.visualbasic.runtime.framework.VbMethod;
import org.siphon.visualbasic.runtime.framework.VbParam;

public class Collection {
	
	private List<VbValue> list = new ArrayList<>();

	private Map<String, Integer> map = new HashMap<>(); // map of position in list
	
	
	@VbMethod
	public void Add(
			@VbParam(name = "Item", type = TypeEnum.vbVariant)
			VbValue Item, 
			
			@VbParam(name = "Key", type = TypeEnum.vbVariant, optional = true)
			VbValue Key, 
			
			@VbParam(name = "Before", type = TypeEnum.vbVariant, optional = true)
			VbValue Before, 
			
			@VbParam(name = "After", type = TypeEnum.vbVariant, optional = true)
			VbValue After) throws VbRuntimeException{
		
		if(!Before.isMissing() && !After.isMissing()){
			throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
		}
		
		int pos = -1;
		if(!Before.isMissing()){
			if(Before.isString()){
				String beforeKey = (String) VbValue.cast(Before, VbVarType.vbString).value;
				beforeKey = beforeKey.toUpperCase();
				if(!map.containsKey(beforeKey)){
					throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
				}
				pos = map.get(beforeKey);
			} else if(Before.value instanceof Number){
				pos = (Integer)VbValue.CInt(Before).value;
			}
		}
		if(!After.isMissing()){
			if(After.isString()){
				String afterKey = (String) VbValue.cast(After, VbVarType.vbString).value;
				afterKey = afterKey.toUpperCase();
				if(!map.containsKey(afterKey)){
					throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
				}
				pos = map.get(afterKey) - 1;
			} else {
				pos = (Integer)VbValue.CInt(Before).value - 1;
			}
		}
		String key = null;
		if(!Key.isMissing()){
			if(Key.isString()){
				key = (String) VbValue.cast(Key, VbVarType.vbString).value;
				key = key.toUpperCase();
				if(map.containsKey(key)){
					throw new VbRuntimeException(VbRuntimeException.此键已经与集合对象中的某元素相关);
				}
			} else {
				throw new VbRuntimeException(VbRuntimeException.类型不匹配);
			}
		}
		
		if(pos == -1){
			list.add(Item);
			pos = list.size() - 1;
		} else {
			for(String k : map.keySet()){
				Integer v = map.get(k);
				if(v >= pos){
					map.put(k, v + 1);
				}
			}
			list.add(pos, Item);
		}
		
		if(key != null) map.put(key, pos);
	}
	
	@VbMethod(isDefault = true, isDictionary = true)
	public VbValue Item(
			@VbParam(name = "Index", type=TypeEnum.vbVariant)
			VbValue Index) throws VbRuntimeException{
		
		int index = -1;
		if(Index.value instanceof Number){
			index = (Integer) VbValue.CInt(Index).value;
			if(index < 0 || index >= list.size()){
				throw new VbRuntimeException(VbRuntimeException.下标越界);
			}
		} else if(Index.isString()){
			String key = (String) VbValue.CStr(Index).value;
			key = key.toUpperCase();
			if(map.containsKey(key) == false){
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
			}
			index = map.get(key);
		} else {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配);
		}
		
		return list.get(index);
	}
	
	@VbMethod
	public void Remove(
			@VbParam(name = "Index", type=TypeEnum.vbVariant)
			VbValue Index) throws VbRuntimeException{
		int index = -1;
		if(Index.value instanceof Number){
			index = (Integer) VbValue.CInt(Index).value;
			if(index < 0 || index >= list.size()){
				throw new VbRuntimeException(VbRuntimeException.下标越界);
			}
		} else if(Index.isString()){
			String key = (String) VbValue.CStr(Index).value;
			key = key.toUpperCase();
			if(map.containsKey(key) == false){
				throw new VbRuntimeException(VbRuntimeException.无效的过程调用);
			}
			index = map.get(key);
		} else {
			throw new VbRuntimeException(VbRuntimeException.类型不匹配);
		}
		
		list.remove(index);
		
		for(String k : map.keySet()){
			Integer v = map.get(k);
			if(v > index){
				map.put(k, v - 1);
			}
		}
	}
	
	@VbMethod
	public Integer Count(){
		return list.size();
	}
	
	@VbMethod(isIterator = true)
	public Object _NewEnum(){
		return list.iterator();
	}
}

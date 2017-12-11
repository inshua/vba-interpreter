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
package org.siphon.visualbasic.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;

import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.runtime.ArrayDef.Rank;

public class VbArray extends VbValue {


	private ArrayDef arrayDef;
	public ArrayDef getArrayDef() {
		return arrayDef;
	}

	private List<VbValue> values;
	
	private boolean controlArray;		// 是否为控件数组
	// TODO 控件数组应单独实现为一种数据类型
	
	public boolean isControlArray() {
		return controlArray;
	}

	public List<VbValue> toList(){
		return Collections.unmodifiableList(values);
	}

	public VbArray(VbVarType varType) {
		super(varType, new ArrayList<VbValue>());
		
		this.arrayDef = varType.arrayDef;
		
		this.values = (List<VbValue>)this.value;
		
		if(arrayDef.ranks != null && arrayDef.ranks.length > 0){		// 动态数组声明时没有长度
			int length = 1;
			for(Rank rank : arrayDef.ranks){
				length *= rank.length();
			}
			for(int i=0; i<length; i++){
				values.add(this.arrayDef.baseType.crateDefaultValue());
			}
		}
	}
	
	public boolean isInited(){
		return arrayDef.ranks != null && arrayDef.ranks.length > 0;
	}
	
	public Iterator<VbValue> iterator(){
		return values.iterator();
	}
	
	public void redim(Rank[] ranks, boolean preserve, SourceLocation sourceLocation) throws VbRuntimeException{
		List<VbValue> newValues = new ArrayList<>();
		
		if(ranks != null && ranks.length > 0){		// 动态数组声明时没有长度
			int length = 1;
			for(Rank rank : ranks){
				length *= rank.length();
			}
			for(int i=0; i<length; i++){
				newValues.add(preserve ? null : this.arrayDef.baseType.crateDefaultValue());
			}
		}
		
		if(preserve){
			Integer[] indexes = new Integer[ranks.length];
			for(int i = 0; i < ranks.length; i++){
				Rank oldRank = this.arrayDef.ranks[i];
				Rank newRank = ranks[i];
				for(int j = Math.max(oldRank.lBound, newRank.lBound) ; j <= Math.min(oldRank.rBound, newRank.rBound); j ++){
					indexes[i] = j; 

					if(i == ranks.length -1){
						int idx = this.findIndex(indexes, sourceLocation);
						newValues.set(idx, this.get(indexes, sourceLocation));
					}
				}
			}
			for(int i=0;i<newValues.size(); i++){
				if(newValues.get(i) == null){
					newValues.set(i, this.arrayDef.baseType.crateDefaultValue());
				}
			}
		}
		this.arrayDef = this.arrayDef.baseType.toArrayType(ranks).arrayDef;
		this.values = newValues;
	}

	public VbValue get(Integer[] indexes, SourceLocation sourceLocation) throws VbRuntimeException{
		int index = findIndex(indexes, sourceLocation);
		VbValue result = this.values.get(index);
		if(result == null){
			this.values.set(index, result = arrayDef.baseType.crateDefaultValue());
		}
		return result;
	}
	
	public void set(Integer[] indexes, VbValue value, SourceLocation sourceLocation) throws VbRuntimeException{
		int index = findIndex(indexes, sourceLocation);
		this.values.set(index, value);
	}

	private int findIndex(Integer[] indexes, SourceLocation sourceLocation) throws VbRuntimeException {
		if(indexes.length != arrayDef.ranks.length){
			throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation);
		}
		int index = 0;
		int rankSize = 1;
		for(int i=arrayDef.ranks.length -1; i >=0; i--){
			int d = indexes[i];
			Rank rank = arrayDef.ranks[i];
			if(d < rank.lBound || d > rank.rBound) throw new VbRuntimeException(VbRuntimeException.下标越界, sourceLocation);
			index += (d - rank.lBound) * rankSize;
			rankSize *= rank.length();
		}
		return index;
	}
	
	@Override
	public String toString() {
		if(this.values.size() <= 20){			
			return this.values.toString();
		} else {
			String s = "[";
			int i = 0;
			for(VbValue v : this.values){
				if(i < 20){
					s += v + ", ";
				}
				i ++;
			}
			s += "...]";
			return s;
		}
	}
	
	public static VbArray create(VbVarType baseType, int lBound, int uBound){
		ArrayDef paramArrayDef = new ArrayDef(baseType,
				new ArrayDef.Rank[] { new ArrayDef.Rank(lBound, uBound) });
		VbVarType arrType = new VbVarType(VbVarType.vbArray, null, paramArrayDef, null);
		return new VbArray(arrType);
	}

	public void setControlArray(boolean controlArray) {
		this.controlArray = controlArray;
	}
}

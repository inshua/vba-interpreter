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
package org.siphon.visualbasic.runtime.statements;

import org.siphon.visualbasic.Interpreter;
import org.siphon.visualbasic.SourceLocation;
import org.siphon.visualbasic.VarDecl;
import org.siphon.visualbasic.runtime.ArrayDef.Rank;
import org.siphon.visualbasic.runtime.ArrayDef.RankAsStatement;
import org.siphon.visualbasic.runtime.ArrayDef;
import org.siphon.visualbasic.runtime.CallFrame;
import org.siphon.visualbasic.runtime.Statement;
import org.siphon.visualbasic.runtime.VbArray;
import org.siphon.visualbasic.runtime.VbRuntimeException;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.VbVariable;

public class RedimStatement extends Statement {

	private VarDecl varDecl;
	private RankAsStatement[] ranks;
	private VbVarType type;
	private boolean preserve;

	public RedimStatement(SourceLocation sourceLocation, VarDecl varDecl, RankAsStatement[] ranks, boolean preserve, VbVarType type) {
		super(sourceLocation);
		this.varDecl = varDecl;
		this.ranks = ranks;
		this.preserve = preserve;
		this.type = type;
	}

	@Override
	public VbValue eval(Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		Rank[] rks = toArrayRanks(ranks, interpreter, frame);
		VbVariable var = frame.locateVbVariable(varDecl);
		VbVarType t = type;
		if(type == null) t= VbVarType.VbVariant;
		if(var.varType.vbType == VbVarType.vbVariant){
			if(type == null){
				if(var.value != null && var.value.varType.vbType == VbVarType.vbArray){
					type = var.value.varType.arrayDef.baseType;
				}
			}
			
			if(var.value == null || var.value.varType.vbType != VbVarType.vbArray){
				var.value = new VbArray(t.toArrayType(rks));
			} else if(var.value.varType.vbType == VbVarType.vbArray){
				if(type != null){
					var.value = new VbArray(t.toArrayType(rks));
				} else {
					VbArray arr = (VbArray)var.value;
					arr.redim(rks, preserve, sourceLocation);
				}
			}
		} else {
			VbArray arr = (VbArray)var.value;
			if(preserve && arr.isInited()){
				Rank[] oldRanks = arr.getArrayDef().ranks;
				if(oldRanks.length != rks.length){
					throw new VbRuntimeException(VbRuntimeException.下标越界, this.sourceLocation);
				} else {
					for(int i=0; i<rks.length -1; i++){
						if(oldRanks[i].rBound != rks[i].rBound || oldRanks[i].lBound != rks[i].lBound){
							throw new VbRuntimeException(VbRuntimeException.下标越界, this.sourceLocation);
						}
					}
				}
			}
			arr.redim(rks, preserve, sourceLocation);
		}
		return null;
	}

	private ArrayDef.Rank[] toArrayRanks(RankAsStatement[] rankStatements, Interpreter interpreter, CallFrame frame) throws VbRuntimeException {
		Rank[] result = new Rank[rankStatements.length];
		for(int i=0; i<rankStatements.length; i++){
			VbValue l = rankStatements[i].lBound.eval(interpreter, frame);
			VbValue r = rankStatements[i].rBound.eval(interpreter, frame);
			result[i] = new Rank((Integer)VbValue.cast(l, VbVarType.vbInteger).value, (Integer)VbValue.cast(r, VbVarType.vbInteger).value);
		}
		return result;
	}

}

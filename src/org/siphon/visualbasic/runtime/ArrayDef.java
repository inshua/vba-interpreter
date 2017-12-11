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

import org.apache.commons.lang3.StringUtils;

public class ArrayDef {

	public static class Rank{
		public final int lBound;
		
		public final int rBound;
		
		public Rank(int lBound, int rBound){
			this.lBound = lBound;
			this.rBound = rBound;
		}
		
		public int length(){return this.rBound - this.lBound + 1; }
		
		@Override
		public String toString() {
			return lBound + " To " + rBound;
		}
	}
	
	public static class RankAsStatement{
		public final Statement lBound;
		
		public final Statement rBound;
		
		public RankAsStatement(Statement lBound, Statement rBound){
			this.lBound = lBound;
			this.rBound = rBound;
		}
		
		@Override
		public String toString() {
			return lBound + " To " + rBound;
		}
	}
	
	public final Rank[] ranks;
	
	public final VbVarType baseType;
	
	public ArrayDef(VbVarType vbVarType, Rank[] ranks){
		this.ranks = ranks;
		this.baseType = vbVarType;
	}
	
	public boolean isDynmaic(){
		return this.ranks == null;
	}
	
	@Override
	public String toString() {
		String s = "array of " + baseType;
		if(ranks != null){
			s += " " + StringUtils.join(ranks, ',');
		}
		return s;
	}
}

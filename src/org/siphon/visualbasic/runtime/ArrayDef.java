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

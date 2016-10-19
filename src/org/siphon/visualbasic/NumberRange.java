package org.siphon.visualbasic;

public class NumberRange {

	private final Number minValue;
	public Number getMinValue() {
		return minValue;
	}

	public Number getMaxValue() {
		return maxValue;
	}

	private final Number maxValue;

	public NumberRange(Number minValue, Number maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	public void checkRange(Number number){
		double d = number.doubleValue();
		if(Double.isInfinite(d)) return ;	// 到时应报除以0
		if(d < this.getMinValue().doubleValue() 
				|| d > this.getMaxValue().doubleValue()){
			throw new OverflowException();
		}
	}
	
	public boolean isIn(Number number){
		double d = number.doubleValue();
		if(Double.isInfinite(d)) return true;	// 到时应报除以0
		if(d < this.getMinValue().doubleValue() 
				|| d > this.getMaxValue().doubleValue()){
			return false;
		} 
		return true;
	}


}

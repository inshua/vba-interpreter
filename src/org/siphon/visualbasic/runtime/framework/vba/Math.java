package org.siphon.visualbasic.runtime.framework.vba;

import java.util.Random;

import org.siphon.visualbasic.runtime.Comparision;
import org.siphon.visualbasic.runtime.MathExpr;
import org.siphon.visualbasic.runtime.VbValue;
import org.siphon.visualbasic.runtime.VbVarType;
import org.siphon.visualbasic.runtime.framework.VbMethod;

public class Math {

	// TODO 应以 Interpreter 为宿主而不是线程
	private static ThreadLocal<Random> random = new ThreadLocal<Random>();
	
	private static ThreadLocal<Double> prevRandom = new ThreadLocal<Double>();
	
	@VbMethod
	public static Double Sqr(Double Number){
		return java.lang.Math.sqrt(Number);
	}
	
	@VbMethod
	public static VbValue Abs(VbValue Number){
		if(Comparision.compare(Number, new VbValue(VbVarType.VbInteger, 0)) == -1){
			return MathExpr.neg(Number);
		} else {
			return Number;
		}
	}
	
	@VbMethod("Function Rnd(Optional Number) As Single")
	public static float rnd(VbValue Number){
		Random r = random.get();
		if(r == null){
			random.set(r = new Random(System.currentTimeMillis()));
		} 
		if(Number.isMissing()){
			return updateRandom(r.nextFloat());
		} else {
			int c = Comparision.compare(Number, new VbValue(VbVarType.VbInteger, 0));
			if(c == 0){
				if(prevRandom.get() == null){
					return updateRandom(r.nextFloat());
				} else {
					return prevRandom.get().floatValue();
				}
			} else if(c > 0){
				return updateRandom(r.nextFloat());
			} else {//if(c < 0)
				r = new Random((Long)VbValue.CLng(Number).value);
				return updateRandom(r.nextFloat());
			}
		}
	}
	
	private static float updateRandom(float nextFloat) {
		prevRandom.set(new Double(nextFloat));
		return nextFloat;
	}

	@VbMethod("Function Randomize(Optional Number) As Single")
	public static void randomize(VbValue seed){
		if(seed.isMissing()){
			random.set(new Random());
		} else {
			random.set(new Random((Long)(VbValue.CLng(seed).value)));
		}
	}
}

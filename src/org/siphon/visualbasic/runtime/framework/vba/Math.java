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
	
	@VbMethod("Function Atn(Number As Double) As Double")
	public static double atn(double number){
		return java.lang.Math.atan(number);
	}
	
	@VbMethod("Function Cos(Number As Double) As Double")
	public static double cos(double number){
		return java.lang.Math.cos(number);
	}
	
	@VbMethod("Function Exp(Number As Double) As Double")
	public static double exp(double number){
		return java.lang.Math.exp(number);
	}
	
	@VbMethod("Function Log(Number As Double) As Double")
	public static double log(double number){
		return java.lang.Math.log(number);
	}
	
	@VbMethod("Function Round(Number As Double, Optional NumDigitsAfterDecimal As Long) As Double")
	public static double Round(double number, VbValue NumDigitsAfterDecimal){
		if(NumDigitsAfterDecimal.isMissing() == false){
			int n = ((Long)(NumDigitsAfterDecimal.value)).intValue();
			int t = (int) java.lang.Math.pow(10, n);
			number *= t;
			return java.lang.Math.round(number) / t;
		} else {
			return java.lang.Math.round(number);
		}
	}
	
	@VbMethod("Function Sgn(Number)")
	public static double sgn(VbValue number){
		return Comparision.compare(number, new VbValue(VbVarType.VbInteger, 0));
	}
	
	@VbMethod("Function Sin(Number As Double) As Double")
	public static double sin(double number){
		return java.lang.Math.sin(number);
	}
	
	@VbMethod("Function Tan(Number As Double) As Double")
	public static double tan(double number){
		return java.lang.Math.tan(number);
	}
	
}

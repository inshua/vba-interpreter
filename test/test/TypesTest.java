package test;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class TypesTest {

	public void test1(Sprite sprite){
		sprite.move("test1");
	}
	
	public void test2(Sprite sprite){
		sprite.move("test2 as sprite");
	}
	
	public void test2(Dragon sprite){
		sprite.move("test2 as dragon");
	}
	
	public void test2(Object sprite){
		System.out.println(sprite + " as object");
	}
	
	public void test3(int[] a, String b, boolean c, Date d){
		System.out.println("a: " + ArrayUtils.toString(a));
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
	
	public void test4(List<Integer> a, double b, Double c){
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
	
	public void test5(String a, Object... arr){
		System.out.println("a: " + a);
		System.out.println("arr: " + StringUtils.join(arr, ","));
	}
	
	public int test6(int a, int b){
		return a + b;
	}
}

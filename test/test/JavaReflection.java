package test;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.reflect.TypeUtils;

public class JavaReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		int[] a = new int[20];
		Class clazz = a.getClass();
//		System.out.println(clazz.newInstance());
		System.out.println(clazz.isArray());
		System.out.println(TypeUtils.getArrayComponentType(clazz));
		System.out.println(clazz);
		Object arr = Array.newInstance(clazz.getComponentType(), 20);
		System.out.println(arr);
		
		
		List<Integer> d = new ArrayList<>();
		clazz = d.getClass();
		System.out.println(d.getClass().getGenericSuperclass());
		System.out.println(d.getClass().getGenericInterfaces()[0]);
		ParameterizedType t = (ParameterizedType) clazz.getGenericSuperclass();
		System.out.println(t.getActualTypeArguments()[0]);
	}
}

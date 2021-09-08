package p10exception.p02quiz;

import java.io.Serializable;

public class Example6 {
	public static void main(String[] args) {
		//ClassCastException
		String str = "java";
		method(str);
		
		int[] arr = {1, 2};
		method(arr);
		
	}
	public static void method(Object o) {
		String s = (String) o;
		Serializable se = (Serializable) o;
		Comparable<String> com = (Comparable<String>) o;
		CharSequence c = (CharSequence) o;
	}
	
}

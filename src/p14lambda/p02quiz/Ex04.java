package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;



public class Ex04 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6);
		
		method(list, num -> System.out.println(num));
		method(list, num -> System.out.println("item : " +num));
		method(list, num -> System.out.println("item : " +(2*num)));
	}
	
	public static void method(List<Integer> list, MyInterface4 c) {
		for (int item : list) {
			c.method(item);
		}
	}
}

interface MyInterface4 {
	void method(int num);
}
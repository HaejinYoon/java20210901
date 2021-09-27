package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Number> arr1 = new ArrayList<>();
		arr1.add(300);
		arr1.add(3.14);
		
		List<Integer> list1 = Arrays.asList(9,10, 11);
		List<Double> list2 = Arrays.asList(3.3, 4.4, 5.5);
		
		arr1.addAll(list1);
		arr1.addAll(list2);
		
		System.out.println(arr1);
	}
}

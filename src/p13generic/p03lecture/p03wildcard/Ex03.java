package p13generic.p03lecture.p03wildcard;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3,4,5,6,7,10);
		List<Double> list2 = Arrays.asList(3.14, 6.12, 7.89, 10.1);
		
		double avg1 = avg1(list1);
		double avg2 = avg2(list2);
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		double avg3 = avg(list1);
		double avg4 = avg(list2);
		
		System.out.println(avg3);
		System.out.println(avg4);
	}
	
	public static double avg(List<? extends Number> list) {
		double sum=0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum / list.size();
	}
	
	public static double avg1(List<Integer> list) {
		double sum=0;
		
		for(Integer item : list) {
			sum += item;
		}
		
		return sum/list.size();
	}
	
	public static double avg2(List<Double> list) {
		double sum=0;
		
		for(Double item : list) {
			sum += item;
		}
		
		return sum/list.size();
	}
	
}

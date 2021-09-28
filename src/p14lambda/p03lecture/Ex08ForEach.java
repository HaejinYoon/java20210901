package p14lambda.p03lecture;

import java.util.Arrays;
import java.util.List;

public class Ex08ForEach {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3, 4, 5, 6);
		
		for(Integer e : list1) {
			System.out.println(e);
		}
		
		list1.forEach(i -> System.out.println(i));
	}
}

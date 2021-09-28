package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		
		System.out.println(arr1);
		
		// ArrayList.removeIf()
		arr1.removeIf(i -> i%2==0);
		
		//코드 원형과 생략과정은 java teacher에
		
		System.out.println(arr1); // [3, 5]
	}
}

package p08interface.p02quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example2AnonymousClass {
	public static void main(String[] args) {
		String[] arr = {"java", "bootstrap", "react", "vue", "angular", "jstl", "spring"};
		//z->a 출력되도록 하세요
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o2, String o1) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(Arrays.toString(arr));
		
	}
}

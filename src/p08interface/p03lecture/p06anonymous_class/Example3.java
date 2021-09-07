package p08interface.p03lecture.p06anonymous_class;

import java.util.Arrays;
import java.util.Comparator;

public class Example3 {
	public static void main(String[] args) {
		String[] arr = {"java", "spring", "html", "css", "js", "jsp", "Servlet"};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}

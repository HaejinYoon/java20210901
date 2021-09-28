package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "abc", "amond", "spring"));
		
		// List removeif 활용
		// a로 시작하는 것만 남도록
		
		list.removeIf(s -> s.charAt(0)!='a');
		
		System.out.println(list); // [apple, abc, amond]
	}
}

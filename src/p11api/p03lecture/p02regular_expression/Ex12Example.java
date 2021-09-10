package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex12Example {
	public static void main(String[] args) {
		//전화번호 010-####-####
		
		String p1 ="010-\\d{4}-\\d{4}";
		System.out.println(Pattern.matches(p1, "010-8888-1234"));
		
		String p2 = "01\\d-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(p2, "011-222-1234"));
		System.out.println(Pattern.matches(p2, "010-4222-1234"));
		
		String p3 = "01\\d-{0,1}\\d{3,4}-{0,1}\\d{4}";
		System.out.println(Pattern.matches(p3, "0111231234"));
		System.out.println(Pattern.matches(p3, "011-123-1234"));
		System.out.println(Pattern.matches(p3, "01099991234"));
		System.out.println(Pattern.matches(p3, "010-8888-1234"));
	}
}

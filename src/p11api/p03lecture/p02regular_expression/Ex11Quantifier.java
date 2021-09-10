package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex11Quantifier {
	public static void main(String[] args) {
		String p1 = "a{0,1}";
		String p2 = "a?"; // ?:0또는 1개
		
		System.out.println(Pattern.matches(p1, ""));
		System.out.println(Pattern.matches(p1, "a"));
		
		System.out.println(Pattern.matches(p2, ""));
		System.out.println(Pattern.matches(p2, "a"));
		
		System.out.println("===============");
		
		String p3 = "\\d{6}-?\\d{7}";
		
		System.out.println(Pattern.matches(p3, "550101-1000000"));
		System.out.println(Pattern.matches(p3, "5501011000000"));
	}
}

package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex09Quantifier {
	public static void main(String[] args) {
		//중괄호로 
		String p1 = "a{3}";
		System.out.println(Pattern.matches(p1, "aaa"));
		System.out.println(Pattern.matches(p1, "a"));
		
		System.out.println("==================");
		
		String p2 = "a{1,3}";
		
		System.out.println(Pattern.matches(p2, "aaa"));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		
		String p3 = "a{2,}";
		System.out.println(Pattern.matches(p3, "aaa"));
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aa"));
	}
}

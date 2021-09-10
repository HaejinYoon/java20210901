package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex05Characters {
	public static void main(String[] args) {
		String p1 = "[^a]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, " "));
		
		String p2 = "[^a-z]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "A"));
		System.out.println(Pattern.matches(p2, "1"));
		
		String p3 = "[a-z^c]";
		System.out.println(Pattern.matches(p3, "c"));
		
		String p4 = "[a-bd-z]";
		System.out.println(Pattern.matches(p4, "c"));
		
		String p5 = "[a-z&&[^c]]";
		System.out.println(Pattern.matches(p5, "c"));
	}
}

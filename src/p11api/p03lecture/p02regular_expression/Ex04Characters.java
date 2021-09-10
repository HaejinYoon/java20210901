package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex04Characters {
	public static void main(String[] args) {
		String p1 = "[abcd]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		System.out.println(Pattern.matches(p1, "d"));
		
		String p2 = "[a-d]";
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "c"));
		System.out.println(Pattern.matches(p2, "d"));
		
		String p3 = "[0-9]";
		
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "1"));
		System.out.println(Pattern.matches(p3, "9"));
		
		String p4 = "[A-Z]";
		
		System.out.println(Pattern.matches(p4, "A"));
		
		String p5 = "[a-zA-Z]";
		
		System.out.println(Pattern.matches(p5, "A"));
	}
}

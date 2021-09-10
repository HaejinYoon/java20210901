package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex08Series {
	public static void main(String[] args) {
		String p1 = "java";
		System.out.println(Pattern.matches(p1, "java"));
		
		String p2 = "a[0-9]";
		System.out.println(Pattern.matches(p2, "a0"));
		System.out.println(Pattern.matches(p2, "a9"));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "a33"));
		
		System.out.println("=============");
		
		String p3 = "[a-zA-Z]\\w\\w";
		System.out.println(Pattern.matches(p3, "a93"));
		System.out.println(Pattern.matches(p3, "z_A"));
	}
}

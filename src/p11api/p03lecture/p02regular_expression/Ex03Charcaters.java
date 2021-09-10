package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex03Charcaters {
	public static void main(String[] args) {
		String p1 = "[abc]";
		//a,b,c를 패턴으로 하고싶을때
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		
		System.out.println(Pattern.matches(p1, "d"));
		System.out.println(Pattern.matches(p1, "e"));
		System.out.println(Pattern.matches(p1, "f"));
		
		System.out.println("===================================");
		
		String p2 = "[azAZ]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "A"));
		System.out.println(Pattern.matches(p2, "z"));
		System.out.println(Pattern.matches(p2, "Z"));
		
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "B"));
		
		System.out.println("===================================");
		
		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		System.out.println(Pattern.matches(p3, "b"));
	}
}
package p11api.p03lecture.p01string;

public class Ex06IndexOf {
	public static void main(String[] args) {
		String s1 = "java와 javascript는 java도 oop고 javascript도 oop이다";
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		
		System.out.println(s1.indexOf("java", 5));
		System.out.println(s1.indexOf("java", 10));
	}
}

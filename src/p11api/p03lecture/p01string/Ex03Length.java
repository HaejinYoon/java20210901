package p11api.p03lecture.p01string;

public class Ex03Length {
	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1.length());
		
		String s2 = "spring";
		System.out.println(s2.length());
		
		String s3 = " java";
		System.out.println(s3.length());
		
		String s4 = "                            ";
		System.out.println(s4.length());
		
		String s5 = "세종대왕";
		System.out.println(s5.length());
		
		String s6 = "java가 제일 쉬웠어요";
		System.out.println(s6.length());
		
		String s7 = "j\ta"; // \\t : tab
		System.out.println(s7);
		System.out.println(s7.length());
		
		String s8 = "j\na"; // \n: new line
		System.out.println(s8);
		System.out.println(s8.length());
	}
}

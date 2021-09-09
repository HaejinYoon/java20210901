package p11api.p03lecture.p01string;

public class Ex04IndexOf {
	public static void main(String[] args) {
		String s1 = "spring";
		//index      012345
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf("ring"));
		
		System.out.println(s1.indexOf("sp"));
		System.out.println(s1.indexOf("ps"));//못찾으면 -1
		
		String s2 = "java보다 javascript가 더 쉬웠어요.";
		System.out.println(s2.length());
	}
}

package p06class.p03lecture.p01static;

public class StaticEx06Member {

	// 스태틱(클래스) 멤버(메소드,필드)에서는 
	// 인스턴스 멤버(메소드,필드) 접근 불가
	public int val1;
	public static int val2;
	
	public void method1() {
		System.out.println(val1);
		System.out.println(val2);
	}
	
	
	public static void method2() {
		//System.out.println(val1); //x
		System.out.println(val2);
	}
}




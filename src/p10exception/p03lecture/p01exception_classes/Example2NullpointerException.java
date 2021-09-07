package p10exception.p03lecture.p01exception_classes;

public class Example2NullpointerException {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Object o1 = null;
		method(o1);
		
		System.out.println("프로그램 정상 종료");
	}
	
	public static void method(Object o) {
		o.hashCode();
	}
}

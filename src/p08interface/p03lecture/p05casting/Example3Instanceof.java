package p08interface.p03lecture.p05casting;

public class Example3Instanceof {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str = "java";
		method(str);
		
		int[] arr = {1, 1};
		method(arr);
		
		System.out.println("프로그램 종료");
	}
	
	public static void method(Object o) {
		System.out.println(o instanceof String);
		
		if (o instanceof String) {
			String s = (String) o;
			System.out.println("String으로 변환 가능");
		} else {
			System.out.println("String으로 변환 불가능");
		}
		
		//String s = (String) o;
	}
}

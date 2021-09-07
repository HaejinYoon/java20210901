package p08interface.p03lecture.p05casting;

import java.io.Serializable;

public class Example2 {

	public static void main(String[] args) {
		String str = "java";
		method(str);
		System.out.println("프로그램 정상 종료");
	
		int[] arr = {1, 2};
		method(arr);
	
	}

	public static void method(Object o) {
		//하위 타입으로 강제 형변환
		String s = (String) o;
		Serializable se = (Serializable) o;
		Comparable<String> com = (Comparable<String>) o;
		CharSequence c = (CharSequence) o;
	}
}

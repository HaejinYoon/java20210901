package p08interface.p03lecture.p05casting;

import java.io.Serializable;

public class Example1 {
	public static void main(String[] args) {
		//상위 타입으로 자동 형변환
		String str = "java";
		Object o = str;
		Serializable s = str;
		CharSequence c = str;
		Comparable<String> com = str;
	}
}

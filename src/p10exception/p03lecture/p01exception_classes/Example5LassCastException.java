package p10exception.p03lecture.p01exception_classes;

public class Example5LassCastException {
	public static void main(String[] args) {
		//강제 형변환 할 때
		String str = "java";
		method(str);
	}
	
	public static void method(Object o) {
		Number n = (Number) o;
	}
}

//실행 f11 -> debug
// ctrl + f11 -> run

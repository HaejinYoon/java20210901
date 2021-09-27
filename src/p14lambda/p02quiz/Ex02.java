package p14lambda.p02quiz;

public class Ex02 {
	public static void main(String[] args) {
		MyInterface2 o1 = () -> System.out.println("hello");
		MyInterface2 o2 = () -> System.out.println("java");
		
		o1.method(); //hello
		o2.method(); //java
		
		// 출력
		// hello
		// java
	}
}

interface MyInterface2 {
	void method();
}

package p14lambda.p03lecture;

public class Ex03OneStatement {
	public static void main(String[] args) {
		MyInterface3 o1 = () -> {
			for (int i=1;i<=5;i++) {
				System.out.println(i);
			}
		};
		o1.method();
		
		MyInterface3 o2 = () -> {
			System.out.println("실행문2");
		};
		o2.method();
		
		// 명령문이 하나이면 중괄호 생략 가능
		
		MyInterface3 o3 = () -> System.out.println("실행문3");
		o3.method();
		
		
	}
}

interface MyInterface3 {
	void method();
}
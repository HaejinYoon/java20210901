package p14lambda.p03lecture;

public class Ex02Anonymous {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {
			@Override
			public void method1() {
				System.out.println("실행코드1");
			}
		};
		
		// lambda
		MyInterface2 o2 = ()/*parameters....*/ ->/*lambda 기호*/ {
			System.out.println("실행코드2");
		};
		
		o1.method1();
		o2.method1();
	}
}

interface MyInterface2 {
	public void method1(); // 추상 메소드가 단 하나
}
package p14lambda.p03lecture;

public class Ex07OneParameter {
	public static void main(String[] args) {
		MyInterface7 o1 = (int a) -> System.out.println("hello");
		
		o1.method(3);
		
		MyInterface7 o2 = (int a) -> System.out.println(a);
		o2.method(7);
		o2.method(8);
		
		MyInterface7 o3 = (a) -> System.out.println(a);
		o3.method(9);
		
		MyInterface7 o4 = a->System.out.println(a); // 파라미터가 1개인 경우만 () 생략가능
		o4.method(11);
		
	}
}

interface MyInterface7 {
	void method(int a);
}
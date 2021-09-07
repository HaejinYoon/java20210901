package p08interface.p03lecture.p07anonymous_class_abstract_class;

public class Example2 {
	public static void main(String[] args) {
		MyAbstractClass2 o1 = new MyAbstractClass2() {
			@Override
			public void method2() {
				System.out.println("추상 메소드 재정의");
				
			}
		};
		o1.method1();
		o1.method2();
	}
}

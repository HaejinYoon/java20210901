package p08interface.p03lecture.p02default_method;

public class Example1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sit();
		d1.roll();
		
		Cat c1 = new Cat();
		c1.sit();
		c1.roll();
		
	}
	
	
	
	
//		추상 클래스 				 vs 	인터페이스
//		4가지 접근 지정자 사용가능			public 메소드만 가능
//		인스턴스 필드 사용 가능				스태틱 파이널 필드만 가능
//		하나만 상속 가능					여러 인터페이스 구현 가능
//		
}

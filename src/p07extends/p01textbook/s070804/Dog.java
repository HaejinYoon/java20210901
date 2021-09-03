package p07extends.p01textbook.s070804;

public class Dog extends Animal{
	public void sound() {
		//상위 클래스가 추상 메소드를 가지고 있다면 하위 클래스가 실체 클래스일 때 꼭 추상 메소드를 재정의해야함
		System.out.println("멍멍");
	}
}

package p08interface.p03lecture.p01abstract_method;

public class Malamute extends KindaDog implements Pet, SledDog {
	public void bark() {
		System.out.println("멍멍");
	}
	public void sit() {
		System.out.println("자리에 맍습니다.");
	}
	
	@Override
	public void pull() {
		// TODO Auto-generated method stub
		System.out.println("썰매를 끕니다.");
	}
}

package p08interface.p03lecture.p01abstract_method;

public class Wolf extends KindaDog implements SledDog {
	public void bark() {
		System.out.println("월월");
	}
	
	public void pull() {
		System.out.println("늑대가 썰매를 끕니다.");
	}

}

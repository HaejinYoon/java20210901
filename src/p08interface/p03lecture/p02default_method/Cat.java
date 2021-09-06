package p08interface.p03lecture.p02default_method;

public class Cat implements Pet {

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("무시합니다");
	}
	
	public void roll() {
		System.out.println("또 무시합니다.");
	}
	
	
}

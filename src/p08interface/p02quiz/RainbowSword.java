package p08interface.p02quiz;

public class RainbowSword implements Sword{

	@Override
	public void setSword() {
		// TODO Auto-generated method stub
		System.out.println("무지개검을 장착합니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("공격합니다");
	}

	@Override
	public void Swing() {
		// TODO Auto-generated method stub
		System.out.println("무지개공격");
	}

}

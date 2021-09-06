package p08interface.p02quiz;

public class Example {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FireSword());
		
		System.out.println("공격합니다.");
		hero.attack();//불공격
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack();//무지개공격
		
	}

}

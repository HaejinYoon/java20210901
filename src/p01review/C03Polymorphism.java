package p01review;

public class C03Polymorphism {
	
	public static void main(String[] args) {
		Gun g1 = new Gun();
		
		Hero hero = new Hero();
		hero.setGun(g1);
		
		System.out.println("-공격합니다.");
		hero.attack();
		
		System.out.println("-불총을 습득했다");
		hero.setGun(new FireGun());
		
		System.out.println("-다시 공격합니다.");
		hero.attack();
	}
}

class Hero {
	private Gun gun;

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		gun.fire();
	}
	
}
class Gun {
	public void fire() {
		System.out.println("총을 쏩니다.");
	}
}

class FireGun extends Gun {
	@Override
	public void fire() {
		System.out.println("불을 쏩니다.");
	}
}

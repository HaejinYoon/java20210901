package p07extends.p03lecture.p01casting;

public class CatExample {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.walk();
		
		Cat c1 = (Cat)a1; //casting - 강제형변환
		c1.punch();
		c1.walk();
	}
}

package p07extends.p03lecture.p01casting;

public class InstanceOfExample2 {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		System.out.println(a1 instanceof Animal);//true
		System.out.println(a1 instanceof Dog);//false
		System.out.println(a1 instanceof Cat);//false
		
		System.out.println(c1 instanceof Cat);//true
		System.out.println(c1 instanceof Animal);//true
		//System.out.println(c1 instanceof Dog);//compile error
		
		System.out.println(d1 instanceof Dog);//true
		System.out.println(d1 instanceof Animal);//true
		//System.out.println(d1 instanceof Cat);//compile error
	}

}

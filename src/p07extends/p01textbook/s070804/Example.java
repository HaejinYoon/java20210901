package p07extends.p01textbook.s070804;

public class Example {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.sound();
		a2.sound();
		
		animalSound(new Cat());
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

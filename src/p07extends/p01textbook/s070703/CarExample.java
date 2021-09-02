package p07extends.p01textbook.s070703;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.tires[0] =new HankookTire();
		car.tires[0] = new KumhoTire();
		
		car.run();
	}
}

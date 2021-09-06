package p08interface.p01textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		yourCar.run();
	}
}

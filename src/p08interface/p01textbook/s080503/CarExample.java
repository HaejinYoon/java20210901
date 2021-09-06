package p08interface.p01textbook.s080503;

import p08interface.p01textbook.s080502.KumhoTire;
import p08interface.p01textbook.s080502.Tire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}

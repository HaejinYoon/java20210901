package p08interface.p01textbook.s080506;

import p08interface.p01textbook.s080505.Bus;
import p08interface.p01textbook.s080505.Vehicle;

public class Example {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v1 = new Bus();
		
		driver.drive(v1);
		
		Vehicle v2 = new Taxi();
		
		driver.drive(v2);

	}

}

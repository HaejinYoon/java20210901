package p08interface.p01textbook.s080506;

import p08interface.p01textbook.s080505.Bus;
import p08interface.p01textbook.s080505.Vehicle;

public class Driver {

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus= (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
	
}

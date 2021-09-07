package p08interface.p01textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
	}
}

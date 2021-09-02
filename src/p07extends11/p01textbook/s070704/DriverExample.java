package p07extends.p01textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle v1 = new Vehicle();
		Bus v2 = new Bus();
		Taxi v3 = new Taxi();
		
		driver.drive(v1);
		driver.drive(v2);
		driver.drive(v3); //택시가 달립니다.
	}
}

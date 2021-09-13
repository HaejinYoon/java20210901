package p11api.p03lecture.p03object.p02hashcode;

public class Ex01 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}

class Car {
	
}

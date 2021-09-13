package p11api.p03lecture.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex04Set {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<>();
		
		set.add(new Car("model3", 2021));
		System.out.println(set.size());
		
		set.add(new Car("avante", 2000));
		System.out.println(set.size());
		
		set.add(new Car("model3", 2021));
		System.out.println(set.size());
	}
}

class Car {
	private String model;
	private int year;
	
	Car(String model, int year){
		this.model=model;
		this.year=year;
				
	}

	@Override
	public int hashCode() {
		return model.hashCode()*77 - year*31;
	}

	@Override
	public boolean equals(Object obj) {
		Car o =(Car) obj;
		return model.equals(o.model) && year == o.year;
	}
	
	
}
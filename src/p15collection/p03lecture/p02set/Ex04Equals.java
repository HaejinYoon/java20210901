package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04Equals {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		set1.add("java");
		set1.add("java");
		set1.add(new String("java"));
		set1.add(new String("java"));
		
		System.out.println(set1.size());
		
		System.out.println("=======================");
		
		Set<Car> set2 = new HashSet<>();
		
		set2.add(new Car("sonata",888));
		set2.add(new Car("avante",999));
		set2.add(new Car("volvo",777));
		set2.add(new Car("volvo",777));
		
		System.out.println(set2.size());
		
		for( Car car : set2) {
			System.out.println(car);
		}
	}
}

class Car {
	private String model;
	private int number;
	
	public Car(String model, int number) {
		super();
		this.model = model;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
	
	
}
package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) {
		List<Car> list = Arrays.asList(new Car("tesla", 5000), new Car("kia", 3000), new Car("volvo", 2000), new Car("fiat", 4000));
		
		//list.sort
		//가격 순으로 정렬
		
		list.sort((m1, m2)-> m1.getPrice()-m2.getPrice());
		
		list.forEach(o -> System.out.println(o.getModel()+":"+o.getPrice()));
		
		
	}
}

class Car {
	private String model;
	private int price;
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
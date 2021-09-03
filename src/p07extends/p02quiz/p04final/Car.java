package p07extends.p02quiz.p04final;
//문자열 model 필드를 갖는 Car클래스를 만들어보세요.
//단, model 필드는 final
//(instance)field == member variable == instance variable
//필드, 멤버변수, 객체변수, 인스턴스 변수
//(static) field, static variable
//스태틱 필드, 스태틱 변수, 정적 필드, 정적 변수
//parameter, argument
//파라미터, 아규먼트, 매개변수, 매개값, 인수, 인자, 매개인수



public class Car {
	final private String model;
	
	public Car() {
		this.model = "BMW";
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	public String getCar() {
		return model;
	}

}

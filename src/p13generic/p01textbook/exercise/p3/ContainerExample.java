package p13generic.p01textbook.exercise.p3;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}

class Container<T, S> {
	private T t;
	private S s;
	
	
	public T getKey() {
		return t;
	}
	
	public S getValue() {
		return s;
	}
	public void set(T t, S s) {
		this.t=t;
		this.s=s;
	}
	
	
}
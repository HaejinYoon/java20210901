package p13generic.p03lecture.p02generic;

public class Ex01 {
	public static void main(String[] args) {
		Box<String> b1;
		Box<Integer> b2;
		
		b1 = new Box<String>();
		b2 = new Box<Integer>();
		
//		b1.setItem(33);  
//		b2.setItem("java");
		
		b1.setItem("java");
		b2.setItem(333);
		
		String s = b1.getItem();
		Integer a = b2.getItem();
		
		System.out.println(s);
		System.out.println(a.intValue());
	}
}

class Box<T> { //클래스가 정의될 때 T는 따로 정해지짖 않음, 객체를 만들때 명시(main에 Box<String>으로
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
}

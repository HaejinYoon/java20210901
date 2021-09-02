package p07extends;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); 
		// 자바는 안됨
		child.method3();
	}
}

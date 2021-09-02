package p07extends.p01textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		
		//child 변수 선언, 적절한 값 할당
		
		Child child = (Child) parent;
		
		
		child.method3();
		
		
		
	}
}

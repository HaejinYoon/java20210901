package p14lambda.p03lecture;

public class Ex04Return {
	public static void main(String[] args) {
		MyInterface4 o1 = new MyInterface4() {
			@Override
			public int method() {
				// TODO Auto-generated method stub
				return 1;
			}
		};
		System.out.println(o1.method());
		
		MyInterface4 o2 = () -> { return 2; };
		System.out.println(o2.method());
		
		MyInterface4 o3= () -> 3; // 중괄호 뿐만 아니라 return 키워드까지 생략가능
		System.out.println(o3.method());
	}
}

interface MyInterface4 {
	int method();
}
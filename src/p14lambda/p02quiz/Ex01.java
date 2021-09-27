package p14lambda.p02quiz;

public class Ex01 {
	public static void main(String[] args) {
		MyInterface1 o1;
		
		o1 = () -> {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		};
		
		o1.method();
		
		//실행결과
		//1 ~ 5까지 출력
	}
}

interface MyInterface1 {
	public void method();
}

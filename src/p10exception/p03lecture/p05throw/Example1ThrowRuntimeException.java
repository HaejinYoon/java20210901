package p10exception.p03lecture.p05throw;

public class Example1ThrowRuntimeException {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		//RuntimeException을 상속받은 Exception은 try/catch를 사용해도 되고 안해도 됨
		
		NullPointerException e = new NullPointerException();
		
		throw e;
		
		//System.out.println("프로그램 종료");
	}
}

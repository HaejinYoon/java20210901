package p10exception.p03lecture.p02try_catch;

public class Example1TryCatch {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int[] arr = {7, 2, 1};
		
		System.out.println(arr[0]);
		
		try { //exception이 발생할 수 있는 코드 블럭
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 객체가 잡혔을 때 실행되는 블럭
			System.out.println("어레이인덱스아웃오브 바운즈익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
		
	}
}

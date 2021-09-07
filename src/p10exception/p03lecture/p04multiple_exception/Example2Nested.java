package p10exception.p03lecture.p04multiple_exception;

public class Example2Nested {
	public static void main(String[] args) {
		String[] arr1 = {"java", "html"};
		
		try {
			System.out.println(arr1[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 오버");
		} finally {
			System.out.println("꼭 실행해야하는 코드");
			
			try {
				System.out.println(arr1[3]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("파이널리 블럭 안쪽의 캐치블럭");
			}
		}
		System.out.println("프로그램 종료");
	}
}

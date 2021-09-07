package p10exception.p03lecture.p01exception_classes;

public class Example3ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr = {3,1,6};
		
		for (int i = 0; i<= arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("프로그램 종료");
	}
}

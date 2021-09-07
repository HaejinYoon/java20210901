package p10exception.p03lecture.p03finally;

public class Example2 {
	public static void main(String[] args) {
		int[] arr = {3, 3, 0};
		
		
		try {
			for (int n : arr) {
				if (n==0) {
					System.out.println("n이 0이어서 종료");
					return;
				}
			}				
		} finally {
				System.out.println("무조건 실행");
		}
		System.out.println("프로그램 종료");
	}
}

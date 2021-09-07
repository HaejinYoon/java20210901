package p10exception.p03lecture.p03finally;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		try {
			String[] arr = {"java", "python", "c"};
			System.out.println(arr[3]);
			
			
			
			System.out.println("try block terminated");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
			
			System.out.println("Exception block terminated");
		} finally {//return이 되어도 실행이 된다.
			System.out.println("Must be run code");
		}
		System.out.println("Program Terminated");
		
	}
}

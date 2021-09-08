package p10exception.p03lecture.p04multiple_exception;

public class Example5Multiple {
	public static void main(String[] args) {
		String[] arr = {"1", "a"};
		
		try {
			int i = Integer.parseInt(arr[1]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("익셉션 발생");
		}
	}
}

package p10exception.p03lecture.p02try_catch;

public class Example3TryCatchScope {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		
		String str = "1aa00";
		int n=0;
		try {
			n = Integer.parseInt(str);
		}
		catch (NumberFormatException e){
			System.out.println("넘버포멧익셉션 발생");
		}
		System.out.println(n*2);
		
		
		System.out.println("프로그램 종료");

	}

}

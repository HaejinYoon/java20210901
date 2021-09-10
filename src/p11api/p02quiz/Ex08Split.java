package p11api.p02quiz;

import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력문자열 :");
			String input = scanner.nextLine();
			
			System.out.print("구분자 :");
			String dm = scanner.nextLine();
			
			String[] arr = input.split(dm);
			
			for( String item : arr) {
				System.out.println(item);
			}
			
		}
		// 코드 작성
		
		
		
		scanner.close();
	}
}

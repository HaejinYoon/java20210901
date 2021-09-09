package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	public static void main(String[] args) {
		//scanner
		//loop
		//입력받은 문자열이 몇 글자 인지 출력하는 코드
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("입력: ");
			String str = scanner.nextLine();
			if(str.equals("quit")) {
				break;
			}
			System.out.println(str.length()+"글자입니다.");
		}
		scanner.close();
	}
}

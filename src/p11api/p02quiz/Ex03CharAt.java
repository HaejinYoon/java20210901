package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {
		//입력 : apple, 가운데 글자는 p
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.print("입력 : ");
			String str = scanner.next();
			if(str.equals("q")) break;
			int i = str.length()/2;
			System.out.println("가운데 글자 :"+str.charAt(i));
		}
		scanner.close();
	}
}

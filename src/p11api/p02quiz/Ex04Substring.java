package p11api.p02quiz;

import java.util.Scanner;

public class Ex04Substring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력 : ");
			String str = scanner.nextLine();
			if(str.equals("q")) break;
			
			int len = str.length()/2;
			
			String str1 = str.substring(0, len);
			String str2 = str.substring(len,str.length());
			System.out.println("앞절반 : " + str1);
			System.out.println("뒤절반 : " + str2);			
		}
		scanner.close();
	}
}

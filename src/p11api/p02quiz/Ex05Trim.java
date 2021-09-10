package p11api.p02quiz;

import java.util.Scanner;

public class Ex05Trim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = scanner.nextLine();
		
		System.out.println(str.trim());
		
		
		
		
		scanner.close();
	}
}

package p11api.p02quiz;

import java.util.Scanner;

public class Ex06Replace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = scanner.nextLine();
		
		System.out.println((str.trim()).replace(" ", ""));
		
		
		
		
		scanner.close();
	}
}

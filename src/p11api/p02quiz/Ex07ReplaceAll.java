package p11api.p02quiz;

import java.util.Scanner;

public class Ex07ReplaceAll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력 :");
		String str = scanner.nextLine();
		
		String r = str.replaceAll("\s+", " ").trim();
		
		System.out.println(r);
		
		scanner.close();
	}
}

package p10exception.p02quiz;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("첫번 째 수 입력 :");
			String str1 = scanner.next();
			
			System.out.print("두번 째 수 입력 :");
			String str2 = scanner.next();
			
			int n1 = 0;
			int n2 = 0;
			try {
				n1 = Integer.parseInt(str1);
				n2 = Integer.parseInt(str2);
			} catch (Exception e) {
				System.out.println("!!숫자를 입력하세요!!");
				e.printStackTrace();
			}
			
			
			System.out.println("더한 결과는 :"+(n1+n2)+"\n");
		}
		scanner.close();
	}
}

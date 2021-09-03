package p06class.p01textbook.exercise.p20;

import java.util.Scanner;

public class BankApplication {
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				creatAccount();
			} else if(selectNo==2) {
				accountList();
			} else if(selectNo==3) {
				deposit();
			} else if(selectNo==4) {
				withdraw();
			} else if(selectNo==5) {
				run = false;
			}	
		}
		System.out.println("프로그램 종료");
	}

	private static void creatAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		scanner.next();
		
	}
	
	private static void accountList() {
		
	}
	
	private static void deposit() {
		
	}
	
	private static void withdraw() {
		
	}
	
	private static Account findAccount(String ano) {
		
		return null;
	}
	
}

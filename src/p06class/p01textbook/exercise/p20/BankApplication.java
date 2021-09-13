package p06class.p01textbook.exercise.p20;

import java.util.Arrays;
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
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		Account a1 = new Account(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i]=a1;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}	
		}
	}
	
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for (int i = 0; i<accountArray.length;i++) {
			if(accountArray[i] != null)System.out.println(accountArray[i]);
			
			/*Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.println(account.getBalance());
				*/
			
		}
	}
	
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		Account fAcc = findAccount(ano);
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		fAcc.setBalance(fAcc.getBalance()+balance);
		//		for(int i=0; i<accountArray.length; i++) {
//			Account account = accountArray[i];
//			if(acc.getAno() == account.getAno()) {
//				System.out.print("예금액: ");
//				account.setBalance(account.getBalance()+scanner.nextInt());
//				break;
//			}
//		}
		System.out.println("예금에 성공하였습니다.");
		
	}
	
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		Account fAcc = findAccount(ano);
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		fAcc.setBalance(fAcc.getBalance()-balance);
		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(ano.contentEquals(account.getAno())) {
				return account;
			}
		}
		return null;
	}
	
}

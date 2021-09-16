package p15collection.p02quiz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import p06class.p01textbook.exercise.p20.Account;

public class BankApplication {
//		private static Account[] accountArray = new Account[100];
		private static ArrayList<Account> accountArray = new ArrayList<>();
		private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제 | 6.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택> ");
			
			
			try {
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
					removeAccount();
				} else if(selectNo==6) {
					run = false;
				} else {
					System.out.println("1~6사이 번호만 입력해 주세요.");
				}
			} catch (Exception e) {
				System.out.println("1~6사이 숫자만 입력해 주세요.");
				
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void removeAccount() {
		System.out.println("------------");
		System.out.println("|계좌삭제  |");
		System.out.println("------------");	
		
		System.out.println("삭제할 계좌변호를 입력하세요.");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		for(int i=0; i<accountArray.size(); i++) {
			Account account = accountArray.get(i);
			if(ano.contentEquals(account.getAno())) {
				accountArray.remove(i);
			}
		}
		System.out.println("계좌가 정상적으로 삭제되었습니다.");
		
	}

	private static void creatAccount() {
		
		System.out.println("------------");
		System.out.println("|계좌생성  |");
		System.out.println("------------");
		
		boolean run = true;
		while(run) {
			System.out.print("계좌번호: ");
			String ano=scanner.next(); 
			if(Pattern.matches("[0-9]{4}-[0-9]{4}", ano)) {
				if(findAccountDup(ano)) {
					System.out.print("계좌주: ");
					String owner = scanner.next();
					
					System.out.print("초기입금액: ");
					int balance = scanner.nextInt();
					
					Account a1 = new Account(ano, owner, balance);
					accountArray.add(a1);
					System.out.println("계좌가 생성되었습니다.");
					run=false;
				} 
				break;
			}else {
				System.out.println("계좌번호 형식은 \"1111-1111\" 입니다.");
			}
		}
	}
	
	private static void accountList() {
		System.out.println("------------");
		System.out.println("|계좌목록  |");
		System.out.println("------------");
		
		System.out.println("계좌번호   |   계좌주   |   계좌잔액");
		for (int i = 0; i<accountArray.size();i++) {
			if(accountArray.get(i) != null)
				System.out.println(accountArray.get(i));
		
		}
	}
	
	private static void deposit() {
		System.out.println("------------");
		System.out.println("|예금      |");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		Account fAcc = findAccount(ano);
		
		System.out.println("현재 잔액은 "+fAcc.getBalance()+"원 입니다.");
		
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
		System.out.println("잔액은 "+fAcc.getBalance()+"원 입니다.");
	}
	
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("|출금      |");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		Account fAcc = findAccount(ano);
		
		System.out.println("현재 잔액은 "+fAcc.getBalance()+"원 입니다.");
		
		while(true) {
			System.out.print("출금액: ");
			int balance = scanner.nextInt();
			if(fAcc.getBalance()-balance<0) {
				System.out.println("출금한도를 초과하였습니다.");
				System.out.println("금액을 다시 입력해주세요.");
			} else {
				fAcc.setBalance(fAcc.getBalance()-balance);
				System.out.println("계좌에서 "+balance+"원 만큼 인출되었습니다.");
				System.out.println("잔액은 "+fAcc.getBalance()+"원 입니다.");
				break;
			}
		}
		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0; i<accountArray.size(); i++) {
			Account account = accountArray.get(i);
			if(ano.equals(account.getAno())) {
				return account;
			}
		}
		System.out.println("찾는 계좌가 없습니다.");
		return null;
	}
	
	private static boolean findAccountDup(String ano) {
		for(int i=0;i<accountArray.size();i++) {
			Account account = accountArray.get(i);
			if(ano.equals(account.getAno())) {
				System.out.println("중복된 계좌번호입니다.");
				return false;
			}
		}
		return true;
	}
	
}

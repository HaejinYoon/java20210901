package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;




public class BankApplication {
		
		private static Map<String, Account> accountMap = new HashMap<>();
		private static Scanner scanner = new Scanner(System.in);
		private static Set<String> ano = accountMap.keySet();
	
	public static void main(String[] args) {
		
		boolean run = true;
		ed:while(run) {
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
				break ed;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void creatAccount() {
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------------------------------------------");
		
		boolean run=true;
		while(run) {
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			if(Pattern.matches("[0-9]{4}-[0-9]{4}", ano)) {
				if(findAccountDup(ano)) {
					System.out.print("계좌주: ");
					String owner = scanner.next();
					
					System.out.print("초기입금액: ");
					int balance;
					try {
						 balance = scanner.nextInt();
						
					} catch (Exception e) {
						
					}
					Account a1 = new Account(owner, balance);
		
					accountMap.put(ano, a1);
					System.out.println("계좌가 정상적으로 생성되었습니다.");
					run=false;
				}
			}else {
				System.out.println("계좌번호 형식은 \"1111-1111\" 입니다\n");
			}
		}
	}
	
	private static void accountList() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("---------------------------------------------------------------");
		
		for(String i : ano) {
			System.out.println(i+"\t"+accountMap.get(i));
		}
	}
	
	private static void deposit() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("예금");
		System.out.println("---------------------------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		Account fAcc = findAccount(ano);
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		fAcc.setBalance(fAcc.getBalance()+balance);
		System.out.println("예금에 성공하였습니다.");
		
	}
	
	private static void withdraw() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		accountMap.get(ano);
		Account fAcc = findAccount(ano);
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		fAcc.setBalance(fAcc.getBalance()-balance);
		
	}
	
	private static void removeAccount() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("|계좌삭제  |");
		System.out.println("---------------------------------------------------------------");	
		
		System.out.println("삭제할 계좌변호를 입력하세요.");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		if(accountMap.containsKey(ano)) {
			accountMap.remove(ano);
		}
		System.out.println("계좌가 정상적으로 삭제되었습니다.");
		
	}
	
	private static Account findAccount(String ano) {
		if(accountMap.containsKey(ano)) {
			return accountMap.get(ano);	
		}
		return null;
	}
	
	private static boolean findAccountDup(String ano) {
		if(accountMap.containsKey(ano)) {
			System.out.println("이미 존재하는 계좌번호입니다.");
			return false;
		}
		return true;
	}
	
}

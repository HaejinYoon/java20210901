package p06class.p01textbook.exercise.p19;

public class Account {
	private int balance;
	private final static int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;


	
	public int setBalance(int balance) {
		if(balance<=MAX_BALANCE && balance>=MIN_BALANCE) {
			this.balance = balance;
			return balance;			
		}
		return this.balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
}
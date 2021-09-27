package p15collection.p02quiz.p03map;

public class Account {

	private String owner;
	private int balance;
	
	public Account() {
	
	}
	
	public Account(String owner, int balance) {
		this.owner=owner;
		this.balance=balance;
	}
		
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public String toString() {
		return "\t"+this.owner+"님 \t\t"+this.balance+"원";
	}
}

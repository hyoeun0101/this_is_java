package verify.exam19;

public class Account {
	private int balance=0;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance<0 || balance>1000000) {
			return;
		}else {
			this.balance += balance;
		}
	}
	

}

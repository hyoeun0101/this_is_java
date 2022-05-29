package sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() {}

	public long getBalance() {
		return balance;
	}

	public void deposite(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException{
		//예외 발생
		if(balance < money){
			throw new BalanceInsufficientException();
		}
		balance -= money;

	}
}

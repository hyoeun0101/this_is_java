package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposite(10000);
		System.out.println("예금액: "+account.getBalance());
	
		try {
			account.withdraw(30000);
			System.out.println("예금액: "+account.getBalance());

		} catch (BalanceInsufficientException e) {
			     String message = e.getMessage();
			     System.out.println(message);
			     System.out.println();
			     e.printStackTrace();
		}
	}
}

package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception{
	
	//기본 생성자
	public BalanceInsufficientException() {}
	
	//예외 발생 원인 메세지담은 생성자
	public BalanceInsufficientException(String message) {
		super(message);
	}
	

}

package sec06.exam04_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObj = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObj);
		ThreadB threadB = new ThreadB(sharedObj);
		
		threadA.start();
		threadB.start();

	}
}

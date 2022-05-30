package sec03.exam01_priority;

public class ProrityExample {

	public static void main(String[] args) {
		//스레드 10개 실행. 이름은 Thread1~10
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread-"+i);
			//10번째 스레드에게 가장 높은 우선순위 주기
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}


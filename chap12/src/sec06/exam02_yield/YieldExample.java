package sec06.exam02_yield;


public class YieldExample {
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		//3초 후 ThreadA의 work = false
		//ThreadA.yield() 실행. -> 실행대기 상태.
		//그러면 ThreadB만 실행
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work = false;
		
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work=true;
		
		//thA.stop(); 메서드 사용하지 않고
		//stop 필드 사용하기
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.stop = true;
		thB.stop=true;
		
	}
}

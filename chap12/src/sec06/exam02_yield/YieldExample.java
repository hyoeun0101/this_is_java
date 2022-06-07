package sec06.exam02_yield;


public class YieldExample {
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work = false;
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work=true;
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.stop = true;
		thB.stop=true;
		
	}
}

package sec06.exam02_yield;


public class YieldExample {
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		//3�� �� ThreadA�� work = false
		//ThreadA.yield() ����. -> ������ ����.
		//�׷��� ThreadB�� ����
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work = false;
		
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.work=true;
		
		//thA.stop(); �޼��� ������� �ʰ�
		//stop �ʵ� ����ϱ�
		try {Thread.sleep(3000);} 
		catch (InterruptedException e) {}
		thA.stop = true;
		thB.stop=true;
		
	}
}

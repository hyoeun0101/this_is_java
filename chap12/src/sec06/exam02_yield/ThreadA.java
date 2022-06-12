package sec06.exam02_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		//무의미한 반복
		while(!stop) {
			if(work) {
				System.out.println("ThreadAAAAA 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}

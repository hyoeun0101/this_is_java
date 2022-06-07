package sec05.exam01_state;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) {}
		
		//실행 대기 상태
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		for(long i=0;i<1000000000;i++) {}
		
	}
	
}

package sec06.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		
		//how1
//		try {
//		while(true) {
//			System.out.println("���� ��");
//			Thread.sleep(1);
//		}
//		}catch(InterruptedException e) {}
//		System.out.println("���� ����");
		
		//how2
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("���� ����");
	}

}

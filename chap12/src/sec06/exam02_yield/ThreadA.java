package sec06.exam02_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		//���ǹ��� �ݺ�
		while(!stop) {
			if(work) {
				System.out.println("ThreadAAAAA �۾� ����");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}

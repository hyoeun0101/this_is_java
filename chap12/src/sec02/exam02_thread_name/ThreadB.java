package sec02.exam02_thread_name;

public class ThreadB extends Thread{
	public ThreadB(){
		setName("Thread-B");
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}

}

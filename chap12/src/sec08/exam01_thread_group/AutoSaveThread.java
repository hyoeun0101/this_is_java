package sec08.exam01_thread_group;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용 저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				break;
			}
			save();
		}
	}

}

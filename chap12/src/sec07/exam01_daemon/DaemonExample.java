package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoThread = new AutoSaveThread();
		autoThread.setDaemon(true);
		autoThread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("���� ������ ����");
	}
}

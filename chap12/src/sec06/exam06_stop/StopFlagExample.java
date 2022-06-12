package sec06.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 p = new PrintThread1();

		p.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		p.setStop(true);

	}
}


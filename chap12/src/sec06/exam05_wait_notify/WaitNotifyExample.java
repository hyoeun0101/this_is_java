package sec06.exam05_wait_notify;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox d = new DataBox();

		ProducerThread p = new ProducerThread(d);
		ConsumerThread c = new ConsumerThread(d);

		p.start();
		c.start();
	}
}

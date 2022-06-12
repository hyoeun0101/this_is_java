package sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	public synchronized String getData() {
		//data가 없다면 일시정지
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}

		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: "+returnValue);
		data = null;
		notify();

		return returnValue;
	}

	public synchronized void setData(String data) {
		//소비자스레드가 읽으면 data==null 이므로
		//소비자 스레드가 아직 읽지 않았으면 일시정지
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}		
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: "+data);
		notify();
	}

}

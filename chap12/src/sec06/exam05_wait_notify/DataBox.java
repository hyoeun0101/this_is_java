package sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	public synchronized String getData() {
		//data�� ���ٸ� �Ͻ�����
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}

		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������: "+returnValue);
		data = null;
		notify();

		return returnValue;
	}

	public synchronized void setData(String data) {
		//�Һ��ڽ����尡 ������ data==null �̹Ƿ�
		//�Һ��� �����尡 ���� ���� �ʾ����� �Ͻ�����
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}		
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: "+data);
		notify();
	}

}

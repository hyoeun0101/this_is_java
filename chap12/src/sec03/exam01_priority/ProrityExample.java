package sec03.exam01_priority;

public class ProrityExample {

	public static void main(String[] args) {
		//������ 10�� ����. �̸��� Thread1~10
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread-"+i);
			//10��° �����忡�� ���� ���� �켱���� �ֱ�
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}


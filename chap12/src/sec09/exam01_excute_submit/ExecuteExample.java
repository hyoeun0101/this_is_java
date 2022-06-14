package sec09.exam01_excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) {
		//�ִ� ������ ������ 2�� ������Ǯ ����
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//������ ������ ���� �߻� ��Ű��
		for(int i=0;i<10;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//������ �� ����, �۾� ������ �̸�
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)es;
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: "+ poolSize
							+ "]  �۾� ������ �̸�: "+threadName
							);
					//***���� �߻�***
					int value = Integer.parseInt("��");
				}
			};
			
//			es.execute(runnable);
			es.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
		}
		es.shutdown();
	}
}

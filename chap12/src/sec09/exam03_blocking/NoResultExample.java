package sec09.exam03_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
	
	System.out.println("[�۾� ó�� ��û]");
	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			int sum =0;
			for(int i=1;i<=10;i++) {
				sum+=i;
			}
			System.out.println("[ó�� ���]"+sum);
		}
	};
	Future future = es.submit(runnable);
	
	try {
		future.get();
		System.out.println("[�۾� ó�� �Ϸ�]");
	}catch(Exception e) {
		System.out.println("���� �߻�: "+e.getMessage());

	}
	es.shutdown();
	}

}

package sec09.exam01_excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) {
		//최대 스레드 개수가 2인 스레드풀 생성
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//스레드 실행중 예외 발생 시키기
		for(int i=0;i<10;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//스레드 총 개수, 작업 스레드 이름
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)es;
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: "+ poolSize
							+ "]  작업 스레드 이름: "+threadName
							);
					//***예외 발생***
					int value = Integer.parseInt("삼");
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

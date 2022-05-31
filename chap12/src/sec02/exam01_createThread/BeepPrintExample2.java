package sec02.exam01_createThread;

import java.awt.Toolkit;

public class BeepPrintExample2{

	//JVM이 생성한 메인 스레드에 의해서 자동으로 실행
	public static void main(String[] args) {
		//how
		//		Runnable beepTask = new BeepTask();
		//		Thread thread = new Thread(beepTask);
		//		thread.start();

		//		//how2
		//		Thread thread = new Thread(new Runnable() {
		//
		//			@Override
		//			public void run() {
		//				//비프옴을 5번 반복해서 소리
		//				Toolkit toolkit =Toolkit.getDefaultToolkit();
		//				for(int i=0;i<5;i++) {
		//					toolkit.beep();
		//					try {Thread.sleep(1000);}
		//					catch(Exception e) {}
		//				}
		//			}
		//
		//		});
		//		thread.start();

		//how3
		Thread thread = new Thread(()->{
			//비프옴을 5번 반복해서 소리
			Toolkit toolkit =Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(1000);}
				catch(Exception e) {}
			}
		});
		thread.start();


		//띵 문자열을 5번 출력
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}

}

package sec02.exam01_createThread;

import java.awt.Toolkit;
//Thread클래스로부터 직접 생성하기-> Runnable을 매개값으로 갖는 생성자 호출
public class BeepPrintExample2{

	//JVM이 생성한 메인 스레드에 의해서 자동으로 실행
	public static void main(String[] args) {
		//how1
		//		Runnable beepTask = new BeepTask();
		//스레드 객체 생성
		//		Thread thread = new Thread(beepTask);
		//run()메소드 호출
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

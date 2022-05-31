package sec02.exam01_createThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		//비프옴을 5번 반복해서 소리
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
	}


}

package sec02.exam01_createThread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�������� 5�� �ݺ��ؼ� �Ҹ�
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
	}

}

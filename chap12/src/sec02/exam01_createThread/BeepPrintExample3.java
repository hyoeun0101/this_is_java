package sec02.exam01_createThread;

import java.awt.Toolkit;
//Thread ���� Ŭ�����κ��� �����ϱ�
public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//how1
//		Thread thread = new BeepThread();
//		thread.start();
		
		//how2
		Thread thread = new Thread() {
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

		};
		thread.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}

}

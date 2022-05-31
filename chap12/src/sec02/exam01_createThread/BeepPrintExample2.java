package sec02.exam01_createThread;

import java.awt.Toolkit;

public class BeepPrintExample2{

	//JVM�� ������ ���� �����忡 ���ؼ� �ڵ����� ����
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
		//				//�������� 5�� �ݺ��ؼ� �Ҹ�
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
			//�������� 5�� �ݺ��ؼ� �Ҹ�
			Toolkit toolkit =Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(1000);}
				catch(Exception e) {}
			}
		});
		thread.start();


		//�� ���ڿ��� 5�� ���
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}

}

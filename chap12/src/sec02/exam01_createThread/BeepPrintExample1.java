package sec02.exam01_createThread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	
	//JVM�� ������ ���� �����忡 ���ؼ� �ڵ����� ����
	public static void main(String[] args) {
		//�������� 5�� �ݺ��ؼ� �Ҹ�
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
		//�� ���ڿ��� 5�� ���
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		
		//���� ������� ���������� �����Ѵ�.
	}

}

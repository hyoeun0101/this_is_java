package sec05.exam02_button_click_event;

import sec05.exam02_button_click_event.Button.OnClickListener;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//�ʵ� ���� - �͸� ���� ��ü ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		btn1.setOnClickListener(listener);
		
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
}

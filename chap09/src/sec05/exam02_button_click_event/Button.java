package sec05.exam02_button_click_event;

public class Button {
	//�������̽� Ÿ�� �ʵ� ����
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}

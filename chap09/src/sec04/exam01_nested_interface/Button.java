package sec04.exam01_nested_interface;

public class Button {
	//field
	OnClickListener listener;
	
	//setter
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//�ܺο��� ������� �ʰ� 
	//nested interface
	interface OnClickListener{
		void onClick();
	}
}

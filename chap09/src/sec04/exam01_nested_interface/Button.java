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
	
	//외부에서 사용하지 않고 
	//nested interface
	interface OnClickListener{
		void onClick();
	}
}

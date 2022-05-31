package sec05.exam02_button_click_event;

import sec05.exam02_button_click_event.Button.OnClickListener;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//필드 대입 - 익명 구현 객체 생성
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		btn1.setOnClickListener(listener);
		
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}

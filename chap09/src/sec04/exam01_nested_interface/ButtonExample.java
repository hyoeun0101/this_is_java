package sec04.exam01_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.SetOnClickListener(new CallListener());
		btn.touch();
		btn.SetOnClickListener(new MessageListener());
		btn.touch();
		
		btn.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
	}

}

package sec04.exam01_nested_interface;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지를 전송합니다.");
	}

}

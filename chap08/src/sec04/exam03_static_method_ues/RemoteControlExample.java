package sec04.exam03_static_method_ues;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Tv();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		//���� �޼ҵ�� �������̽��� �ٷ� ȣ���Ѵ�.
		RemoteControl.changeBattery();
	}

}

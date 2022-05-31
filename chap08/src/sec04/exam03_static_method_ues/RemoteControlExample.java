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
		//정적 메소드는 인터페이스로 바로 호출한다.
		RemoteControl.changeBattery();
	}

}

package sec04.exam02_abstract_method_ues;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Tv();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		//오버라이딩된 구현 객체의 디폴트 메소드를 호출한다.
		rc.setMute(true);
		rc.turnOff();
	}

}

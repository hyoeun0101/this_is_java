package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable s = tv;
		s.search("http://naver.com");
	
	}

}

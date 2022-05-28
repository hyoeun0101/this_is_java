package sec02.exam01_interface_declaration;

public interface RemoteControl {
	//상수 필드 public static final 생략 가능
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 - 메소드 선언. public abstract 생략.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴드 메소드 public 생략 가능. //기존 인터페이스를 확장해서 새로운 기능을 추가 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드. [public]//인터페이스만으로 호출이 가능하다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}

package sec03.exam01_name_implement_class;

public interface RemoteControl {
	//상수 필드 public static final 생략 가능
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 - 메소드 선언. public abstract 생략.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴드 메소드 public 생략 가능. -> 구현 객체의 메소드랑 같지만 선언만 해줌.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드. [public]
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}

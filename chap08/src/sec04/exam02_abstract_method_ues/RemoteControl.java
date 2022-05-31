package sec04.exam02_abstract_method_ues;

public interface RemoteControl {
	//상수 필드 public static final 생략
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드- 구현 객체에서 정의 필요
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 - 구현객체의 인스턴스 메소드와 비슷
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
	
	//정적 메소드 - 객체 생성없이 인터페이스만으로 호출
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}

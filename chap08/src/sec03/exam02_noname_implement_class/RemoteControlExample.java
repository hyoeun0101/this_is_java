package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스에서 구현된 추상 메서드 작성!!
		RemoteControl rc1 = new RemoteControl() {
			public int volume; 

			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				
				System.out.println("TV volume:"+this.volume);
			}
			
		};
		rc1.turnOn();

	}

}

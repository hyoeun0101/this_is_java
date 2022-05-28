package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		//�������̽����� ������ �߻� �޼��� �ۼ�!!
		RemoteControl rc1 = new RemoteControl() {
			public int volume; 

			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
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

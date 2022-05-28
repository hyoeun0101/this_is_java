package sec04.exam02_abstract_method_ues;

public class Audio implements RemoteControl{
	private int vol;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Audio를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.MAX_VOLUME)
			this.vol = RemoteControl.MAX_VOLUME;
		else if(vol<RemoteControl.MIN_VOLUME)
			this.vol = RemoteControl.MIN_VOLUME;
		else
			this.vol = vol;
		System.out.println("현재 Audio 볼륨:"+this.vol);
	}
	
	//디폴트 메소드 오버라이딩
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리");
		}else {
			System.out.println("Audio 무음 해제");
		}
	}
}

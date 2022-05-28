package sec04.exam01_abstract_method_ues;

public class Audio implements RemoteControl{
	private int vol;

	@Override
	public void turnOn() {
		System.out.println("Audio�� ŵ�ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.MAX_VOLUME)
			this.vol = RemoteControl.MAX_VOLUME;
		else if(vol<RemoteControl.MIN_VOLUME)
			this.vol = RemoteControl.MIN_VOLUME;
		else
			this.vol = vol;
		System.out.println("���� Audio ����:"+this.vol);
	}
}

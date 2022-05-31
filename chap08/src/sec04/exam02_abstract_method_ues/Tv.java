package sec04.exam02_abstract_method_ues;

public class Tv implements RemoteControl{
	
	
	private int vol;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� ŵ�ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.MAX_VOLUME)
			this.vol = RemoteControl.MAX_VOLUME;
		else if(vol<RemoteControl.MIN_VOLUME)
			this.vol = RemoteControl.MIN_VOLUME;
		else
			this.vol = vol;
		System.out.println("���� TV ����:"+this.vol);
	}
	

}

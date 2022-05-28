package sec03.exam01_name_implement_class;

public interface RemoteControl {
	//��� �ʵ� public static final ���� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� - �޼ҵ� ����. public abstract ����.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//������ �޼ҵ� public ���� ����. -> ���� ��ü�� �޼ҵ�� ������ ���� ����.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�. [public]
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}

package sec02.exam01_interface_declaration;

public interface RemoteControl {
	//��� �ʵ� public static final ���� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� - �޼ҵ� ����. public abstract ����.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//������ �޼ҵ� public ���� ����. //���� �������̽��� Ȯ���ؼ� ���ο� ����� �߰� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�. [public]//�������̽������� ȣ���� �����ϴ�.
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}

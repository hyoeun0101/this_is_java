package sec04.exam02_abstract_method_ues;

public interface RemoteControl {
	//��� �ʵ� public static final ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�- ���� ��ü���� ���� �ʿ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� - ������ü�� �ν��Ͻ� �޼ҵ�� ���
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("���� ó���մϴ�.");
		else
			System.out.println("���� �����մϴ�.");
	}
	
	//���� �޼ҵ� - ��ü �������� �������̽������� ȣ��
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}

package sec05.exam06_instanceof;

public class Bus implements Vehicle{
	//�������̽��� �߻� �޼ҵ� ����
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	//�޼ҵ�
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}

}

package sec04.exam02_abstract_method_ues;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Tv();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		//�������̵��� ���� ��ü�� ����Ʈ �޼ҵ带 ȣ���Ѵ�.
		rc.setMute(true);
		rc.turnOff();
	}

}

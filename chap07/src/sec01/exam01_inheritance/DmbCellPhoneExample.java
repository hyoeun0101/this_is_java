package sec01.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���","����",10);
		
		//��ӹ��� �ʵ�- CellPhone�� �ʵ�
		System.out.println("��:"+dmb.model);
		System.out.println("����: "+dmb.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmb.channel);
		
		//��ӹ��� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�� �ȳ��ϼ���. �� ȫ�浿�ε���");
		dmb.sendVoice("�� �� �ݰ����ϴ�");
		dmb.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
	}

}

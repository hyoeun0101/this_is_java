package sec01.exam01_inheritance;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("���� on");}
	void powerOff() {System.out.println("���� off");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("��:"+message);}
	void receiveVoice(String message) {System.out.println("����: "+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
	
}

package sec05.exam01_field_polymorphism;

public class Car {
	//field - �������̽� Ÿ�Կ� ���� ��ü ����
//	Tire fl = new HanTire();
//	Tire fr = new HanTire();
//	Tire bl = new KumTire();
//	Tire br = new KumTire();
	
	Tire[] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire()
	};
	//�޼ҵ�
	void run() {
		//���� ��ü�� �������̵��� �޼ҵ� ����
		for(Tire tire:tires) {
			tire.roll();
		}
	}
}

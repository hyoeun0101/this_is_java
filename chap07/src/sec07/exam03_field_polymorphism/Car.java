package sec07.exam03_field_polymorphism;

public class Car {
	//field
	Tire flTire = new Tire("�տ�",6);
	Tire frTire = new Tire("�տ�",2);
	Tire blTire = new Tire("�ڿ�",3);
	Tire brTire = new Tire("�ڿ�",4);

	//method
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(flTire.roll()==false) {
			stop();
			return 1;
		}
		if(frTire.roll()==false) {
			stop();
			return 2;
		}
		if(blTire.roll()==false) {
			stop();
			return 3;
		}
		if(brTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}

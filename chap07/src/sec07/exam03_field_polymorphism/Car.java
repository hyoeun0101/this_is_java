package sec07.exam03_field_polymorphism;

public class Car {
	//field

//	Tire flTire = new Tire("�տ�",6);
//	Tire frTire = new Tire("�տ�",2);
//	Tire blTire = new Tire("�ڿ�",3);
//	Tire brTire = new Tire("�ڿ�",4);
	Tire[] tires = {
			new Tire("�տ�",6),
			new Tire("�տ�",2),
			new Tire("�ڿ�",3),
			new Tire("�ڿ�",4)
	};

	//method
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}

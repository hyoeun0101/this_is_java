package sec07.exam03_field_polymorphism;

public class Car {
	//field

//	Tire flTire = new Tire("앞왼",6);
//	Tire frTire = new Tire("앞오",2);
//	Tire blTire = new Tire("뒤왼",3);
//	Tire brTire = new Tire("뒤오",4);
	Tire[] tires = {
			new Tire("앞왼",6),
			new Tire("앞오",2),
			new Tire("뒤왼",3),
			new Tire("뒤오",4)
	};

	//method
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

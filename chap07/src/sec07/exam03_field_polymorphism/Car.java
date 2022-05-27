package sec07.exam03_field_polymorphism;

public class Car {
	//field
	Tire flTire = new Tire("앞왼",6);
	Tire frTire = new Tire("앞오",2);
	Tire blTire = new Tire("뒤왼",3);
	Tire brTire = new Tire("뒤오",4);

	//method
	int run() {
		System.out.println("자동차가 달립니다.");
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
		System.out.println("자동차가 멈춥니다.");
	}
}

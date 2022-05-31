package sec05.exam01_field_polymorphism;

public class Car {
	//field - 인터페이스 타입에 구현 객체 대입
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
	//메소드
	void run() {
		//구현 객체의 오버라이딩된 메소드 실행
		for(Tire tire:tires) {
			tire.roll();
		}
	}
}

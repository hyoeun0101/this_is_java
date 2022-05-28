package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		//
		car.run();
		car.tires[0] = new KumTire();
		car.tires[1] = new KumTire();
		//KumTire 객체의 roll()메소드 호출.
		//-> 다양한 roll()메소드의 실행결과를 얻을 수 있다.=> 필드의 다형성
		car.run();
	}

}

package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		//
		car.run();
		car.tires[0] = new KumTire();
		car.tires[1] = new KumTire();
		//KumTire ��ü�� roll()�޼ҵ� ȣ��.
		//-> �پ��� roll()�޼ҵ��� �������� ���� �� �ִ�.=> �ʵ��� ������
		car.run();
	}

}

package sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<=5;i++) {
			int problemLocation = car.run();
			//Ÿ�̾� ��ũ��.
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location+"HanKoolTire�� ��ü");
				car.tires[problemLocation-1] = new HanKookTire(car.tires[problemLocation-1].location,15);
			}
			System.out.println("======================");
		}
	}

}

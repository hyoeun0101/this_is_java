package sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<=5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼 HanKookTire로 교체");
				car.flTire = new HanKookTire("앞왼",15);
				break;
				
			case 2:
				System.out.println("앞오 KumhoTire로 교체");
				car.frTire = new KumhoTire("앞오",13);
				break;
				
			case 3:
				System.out.println("뒤왼 HanKookTire로 교체");
				car.blTire = new HanKookTire("뒤왼",14);
				break;
				
			case 4:
				System.out.println("뒤오 KumhoTire로 교체");
				car.brTire = new KumhoTire("뒤오",17);
				break;
			}
			System.out.println("======================");
		}
	}

}

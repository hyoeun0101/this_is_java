package section07.contructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company: "+ car1.company);
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2:"+ car2.company);
		System.out.println("car2:"+ car2.model);
		
		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3:"+ car3.company);
		System.out.println("car3:"+ car3.model);
		System.out.println("car3:"+ car3.color);
		
		
		Car car4 = new Car("�ý�", "����",200);
		System.out.println("car4:"+ car4.company);
		System.out.println("car4:"+ car4.model);
		System.out.println("car4:"+ car4.color);
		System.out.println("car4:"+ car4.maxSpeed);
	

	}

}

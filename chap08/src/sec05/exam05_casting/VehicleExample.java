package sec05.exam05_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//�ڵ� Ÿ�� ��ȯ
		//vehicle.checkFare(); -> Vehicle���� checkFare()����.
		Bus bus = (Bus) vehicle;//���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();
	}

}

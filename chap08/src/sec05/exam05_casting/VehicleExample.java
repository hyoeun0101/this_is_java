package sec05.exam05_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//자동 타입 변환
		//vehicle.checkFare(); -> Vehicle에는 checkFare()없음.
		Bus bus = (Bus) vehicle;//강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}

}

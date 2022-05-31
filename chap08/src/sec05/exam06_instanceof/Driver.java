package sec05.exam06_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		//매개변수로 구현 객체인 Bus가 들어오면?
		//Bus의 메소드인 checkFare()을 실행하기 위해선 Bus로 다시 강제 타입 변환을 시켜줘야한다.
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		else {
		vehicle.run();
		}
	}

}

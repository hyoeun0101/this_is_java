package sec05.exam06_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		//�Ű������� ���� ��ü�� Bus�� ������?
		//Bus�� �޼ҵ��� checkFare()�� �����ϱ� ���ؼ� Bus�� �ٽ� ���� Ÿ�� ��ȯ�� ��������Ѵ�.
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

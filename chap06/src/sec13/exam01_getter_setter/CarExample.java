package sec13.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재속도:"+myCar.getSpeed());
		
		myCar.setSpeed(50);
		
		//멈추지 않는다면
		if(!myCar.isStop()) {
			myCar.setStop(true);//멈춰
		}
		System.out.println(myCar.isStop());
		System.out.println("현재속도:"+myCar.getSpeed());

	}

}

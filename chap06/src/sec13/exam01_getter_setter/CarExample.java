package sec13.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("����ӵ�:"+myCar.getSpeed());
		
		myCar.setSpeed(50);
		
		//������ �ʴ´ٸ�
		if(!myCar.isStop()) {
			myCar.setStop(true);//����
		}
		System.out.println(myCar.isStop());
		System.out.println("����ӵ�:"+myCar.getSpeed());

	}

}

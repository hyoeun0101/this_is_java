package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		boolean gasState = myCar.isLeftCas();
		//gas가 있다면 달려
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		if(myCar.isLeftCas()) {
			System.out.println("gas 있슴");
		}else {
			System.out.println("gas를 주입하세여");
		}
		

	}

}

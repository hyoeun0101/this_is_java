package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		boolean gasState = myCar.isLeftCas();
		//gas�� �ִٸ� �޷�
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		if(myCar.isLeftCas()) {
			System.out.println("gas �ֽ�");
		}else {
			System.out.println("gas�� �����ϼ���");
		}
		

	}

}

package sec08.exam02_return;

public class Car {
	//field
	int gas;
	//constructor
	
	//method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftCas() {
		
		if(gas == 0)
		{
		System.out.println("gas�� �����ϴ�.");
		return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run~(gas:"+ gas +")");
				gas--;
			}else {
				System.out.println("����ϴ�. gas:"+gas);
				return;
			}
			
		}
	}


}

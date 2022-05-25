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
		System.out.println("gas가 없습니다.");
		return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run~(gas:"+ gas +")");
				gas--;
			}else {
				System.out.println("멈춥니다. gas:"+gas);
				return;
			}
			
		}
	}


}

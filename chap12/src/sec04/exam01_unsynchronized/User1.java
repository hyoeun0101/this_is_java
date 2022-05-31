package sec04.exam01_unsynchronized;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(100);
	}

}

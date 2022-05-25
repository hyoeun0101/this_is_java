package sec13.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	//getter
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	
	//setter
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}

package sec04.exam02_parant_method_call;

public class SupersonicAirplane extends Airplane{
	//필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	//메소드
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			//부모 메소드 호출
			super.fly();
		}
	}
}

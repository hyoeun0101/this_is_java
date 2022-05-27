package sec07.exam03_field_polymorphism;

public class HanKookTire extends Tire{
	//constructor
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HanKookTire ����: "+ 
					(maxRotation - accumulatedRotation)+ "ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+"HanKookTire ��ũ***");
			return false;
		}
	}

		
		

}

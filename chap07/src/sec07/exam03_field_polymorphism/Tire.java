package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; //�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation; //���� ȸ����
	public String location;//Ÿ�̾� ��ġ
	
	//constructor
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ����: "+ 
					(maxRotation - accumulatedRotation)+ "ȸ");
			return true;
		}
		else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
		}
	}

}

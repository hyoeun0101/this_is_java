package sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pare<Integer, String> p1 = new Pare<>(1,"���");
		Pare<Integer, String> p2 = new Pare<>(1,"���");
		boolean result1 =  Util.<Integer,String>compare(p1, p2);
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		
		
		
		
		Pare<String, String> p3 = new Pare<>("user1","���");
		Pare<String, String> p4 = new Pare<>("user2","���");
		boolean result2 =  Util.compare(p3, p4);
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
	}

}

package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();//�ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;//���� Ÿ�� ��ȯ
		child.field2 = "yyy";
		child.method3();
		
		
	}

}

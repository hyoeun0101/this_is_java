package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();//자동 타입 변환
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;//강제 타입 변환
		child.field2 = "yyy";
		child.method3();
		
		
	}

}

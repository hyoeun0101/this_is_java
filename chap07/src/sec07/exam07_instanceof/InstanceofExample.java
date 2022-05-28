package sec07.exam07_instanceof;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1- Child로 강제변환");
		}else {
			System.out.println("method1 - Child로 변환되지 않음. 원래 Parent 객체이기 때문");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 강제변환");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();//자동 타입 변환
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}

package sec03.exam02_field_method_access;

public class A {
	//인스턴스 필드
	int field1;
	void method1() {}
	//정적 필드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	//모든 필드와 메소드 접근 가능
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스
	//정적 멤버만 접근가능
	static class C{
		void method() {
			//field1 = 0;
			//method();
			field2 = 10;
			method2();
		}
	}
}

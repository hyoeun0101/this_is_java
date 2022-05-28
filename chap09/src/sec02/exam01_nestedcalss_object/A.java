package sec02.exam01_nestedcalss_object;

public class A {

	A(){
		System.out.println("A 객체가 생성됨.");
	}
	
	//인스턴스 멤버 클래스
	//A클래스의 객체 생성 후 B의 객체를 생성할 수 있음.
	//정적 멤버 작성안됨.
	class B{
		B(){
			System.out.println("B 객체가 생성됨.");
		}
		int field1;
		void method1() {}
	}
	
	//정적 맴버 클래스
	//A의 객체를 따로 만들지 않고 객체를 생성할 수 있음.
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스: 메소드 내에서 선언.
		//메소드가 실행될 때 매소드 내에서 객체 생성 후 사용.
		//접근 제한자, static 작성X. 어짜피 메소드 내부에서만 사용되므
		class D{
			D(){
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method();
	}

}

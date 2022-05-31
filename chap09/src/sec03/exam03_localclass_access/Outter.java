package sec03.exam03_localclass_access;

public class Outter {
	
	public void method1(final int arg) {
		final int localVariable = 1;
		//final 변경할 수 없다!!
		//arg = 100; (x)
		//localVarialbe = 2;  (x)
		
		//local class
		class Inner{
			public void method() {
				//로컬변수로 복사
				//int arg;
				//int localVarialbe = 1;
				int result = arg + localVariable;
			}
		}		
	}
	
	public void method2(int arg) {
		int localVarialbe = 1;
		
		class Inner{
			//로컬 클래스의 필드로 복사
			//int arg;
			//int localVariable = 1;
			public void method() {
				int result = arg + localVarialbe;
			}
		}
	}
}

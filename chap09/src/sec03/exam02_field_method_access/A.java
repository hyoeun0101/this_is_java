package sec03.exam02_field_method_access;

public class A {
	//�ν��Ͻ� �ʵ�
	int field1;
	void method1() {}
	//���� �ʵ�
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� ��� Ŭ����
	//��� �ʵ�� �޼ҵ� ���� ����
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//���� ��� Ŭ����
	//���� ����� ���ٰ���
	static class C{
		void method() {
			//field1 = 0;
			//method();
			field2 = 10;
			method2();
		}
	}
}

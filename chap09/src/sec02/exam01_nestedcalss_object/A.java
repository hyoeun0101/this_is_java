package sec02.exam01_nestedcalss_object;

public class A {

	A(){
		System.out.println("A ��ü�� ������.");
	}
	
	//�ν��Ͻ� ��� Ŭ����
	//AŬ������ ��ü ���� �� B�� ��ü�� ������ �� ����.
	//���� ��� �ۼ��ȵ�.
	class B{
		B(){
			System.out.println("B ��ü�� ������.");
		}
		int field1;
		void method1() {}
	}
	
	//���� �ɹ� Ŭ����
	//A�� ��ü�� ���� ������ �ʰ� ��ü�� ������ �� ����.
	static class C{
		C(){
			System.out.println("C ��ü�� ������");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//���� Ŭ����: �޼ҵ� ������ ����.
		//�޼ҵ尡 ����� �� �żҵ� ������ ��ü ���� �� ���.
		//���� ������, static �ۼ�X. ��¥�� �޼ҵ� ���ο����� ���ǹ�
		class D{
			D(){
				System.out.println("D ��ü�� ������");
			}
			int field1;
			void method() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method();
	}

}

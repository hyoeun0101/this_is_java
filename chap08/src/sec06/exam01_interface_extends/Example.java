package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		Implementation impl = new Implementation();
		
		InterfaceA ia = impl;//�ڵ� Ÿ�� ��ȯ
		ia.methodA();
		System.out.println("----------");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("----------");
		
		//���� �������̽����� �޼ҵ� ��� ȣ�� ����!!
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}

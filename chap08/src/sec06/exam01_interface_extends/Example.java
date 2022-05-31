package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		Implementation impl = new Implementation();
		
		InterfaceA ia = impl;//자동 타입 변환
		ia.methodA();
		System.out.println("----------");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("----------");
		
		//하위 인터페이스에서 메소드 모두 호출 가능!!
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}

package sec06.exam01_interface_extends;

public class Implementation implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("method AAA");		
	}

	@Override
	public void methodB() {
		System.out.println("methodBBB");
	}

	@Override
	public void methodC() {
		System.out.println("method CCC");		
	}

}

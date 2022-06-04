package sec04.exam01_field;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis u = new UsingThis();
		UsingThis.Inner inner = u.new Inner();
		
		inner.method();
		
	}

}

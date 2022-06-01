package sec02.exam02_generic_type;


public class Box<T> {//extends Object
	private T t;
	//Object е╦ют
	public void set(T t) {
		this.t= t;
	}
	
	public T get() {
		return t;
	}

}

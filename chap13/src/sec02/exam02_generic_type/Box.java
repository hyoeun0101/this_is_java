package sec02.exam02_generic_type;


public class Box<T> {//extends Object
	private T t;
	//Object Ÿ��
	public void set(T t) {
		this.t= t;
	}
	
	public T get() {
		return t;
	}

}

package sec04.exam01_generic_method;

public class Util {
	//제네릭 메소드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}

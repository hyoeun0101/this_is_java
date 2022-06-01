package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		
		box.set("sdf");
		System.out.println(box.get());
		
		Box<Integer> box2 = new Box<>();
		box2.set(3);
		System.out.println(box2.get());
	}

}

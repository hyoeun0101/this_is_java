package sec04.exam01_generic_method;

public class BoxnigMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int intVal = box1.get();
		System.out.println(intVal);
		
		Box<String> box2 = Util.boxing("sf");
		String strVal = box2.get();
		System.out.println(strVal);
		
		
	}

}

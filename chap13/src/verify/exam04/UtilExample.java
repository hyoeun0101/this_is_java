package verify.exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<>("È«±æµ¿",35);
		Integer age = Util.getValue(pair,"È«±æµ¿");
		System.out.println(age);
		
		ChildPair<String,Integer> child = new ChildPair<>("È«»ï¿ø",20);
		Integer childAge = Util.getValue(child, "È«»ï¼ø");
		System.out.println(childAge);
		
		
	}

}

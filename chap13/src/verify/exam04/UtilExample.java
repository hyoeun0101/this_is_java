package verify.exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<>("ȫ�浿",35);
		Integer age = Util.getValue(pair,"ȫ�浿");
		System.out.println(age);
		
		ChildPair<String,Integer> child = new ChildPair<>("ȫ���",20);
		Integer childAge = Util.getValue(child, "ȫ���");
		System.out.println(childAge);
		
		
	}

}

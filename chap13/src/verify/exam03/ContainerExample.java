package verify.exam03;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String,String> con1 = new Container<>();
		con1.set("È«±æµ¿", "µµÀû");
		String name1= con1.getKey();
		String job = con1.getValue();
		System.out.println(name1+"-"+job);
		
		Container<String,Integer> con2 = new Container<>();
		con2.set("È«±æµ¿", 30);
		String name2 = con2.getKey();
		int age = con2.getValue();
		System.out.println(name2+"-"+age);
	}

}

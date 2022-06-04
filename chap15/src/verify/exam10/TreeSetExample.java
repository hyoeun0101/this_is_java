package verify.exam10;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeset = new TreeSet<>();
		treeset.add(new Student("blue",96));
		treeset.add(new Student("hong",86));
		treeset.add(new Student("sin",92));
		
		System.out.println("최고점수: "+treeset.last().score);
		System.out.println("최고점수를 받은 아이디: "+treeset.last().id);
		
	}

}

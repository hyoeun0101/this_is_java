package sec05.exam01_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//나이 오름차순으로 자동 정렬
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("감자바",25));
		treeSet.add(new Person("박지원",31));

		Iterator<Person> iter= treeSet.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p.name+" - "+p.age);
		}
	}

}

package sec05.exam01_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//���� ������������ �ڵ� ����
		treeSet.add(new Person("ȫ�浿",45));
		treeSet.add(new Person("���ڹ�",25));
		treeSet.add(new Person("������",31));

		Iterator<Person> iter= treeSet.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p.name+" - "+p.age);
		}
	}

}

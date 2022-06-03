package sec05.exam02_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	
	public static void main(String[] args) {
		TreeSet<Fruit> treeset = new TreeSet<>(new DescendingComparator());
		treeset.add(new Fruit("���",500));
		treeset.add(new Fruit("����",300));
		treeset.add(new Fruit("����",1000));
		
		Iterator<Fruit> iter = treeset.iterator();
		while(iter.hasNext()) {
			Fruit f = iter.next();
			System.out.println(f.name+" - "+f.price);
		}
	}

}

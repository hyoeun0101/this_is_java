package verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"hong"));
		set.add(new Student(2,"sin"));
		set.add(new Student(3,"kim"));
		set.add(new Student(3,"kim"));

		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.studentNum+"-"+s.name);
		}
	}

}

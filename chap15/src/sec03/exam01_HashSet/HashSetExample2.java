package sec03.exam01_HashSet;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("��ȿ��",20));
		set.add(new Member("��ȿ��",20));
		
		System.out.println("�� ��ü�� �� :"+set.size());
	}

}

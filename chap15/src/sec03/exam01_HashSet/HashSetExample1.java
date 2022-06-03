package sec03.exam01_HashSet;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		set.add("aaa");
		
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ÀÇ ¼ö: "+size);
		System.out.println("----------");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) 
		{
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println("----------");
		
		set.remove("aaa");
		set.remove("ccc");
		
		for(String str: set) {
			System.out.println(str);
		}
		System.out.println("----------");
		
		set.clear();
		if(set.isEmpty()) {System.out.println("ºñ¾îÀÖÀ½");}
	}
}

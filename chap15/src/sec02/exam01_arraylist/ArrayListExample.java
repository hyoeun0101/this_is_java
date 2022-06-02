package sec02.exam01_arraylist;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		System.out.println("-------------");
		
		String skill = list.get(2);
		System.out.println("2 :"+skill);
		System.out.println("-------------");		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i));
		}
		System.out.println("-------------");
		list.remove(1);
		list.remove(1);
		list.remove("Java");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i));
		}
	}

}

package sec04.exam05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����: "+score);
		
		score = scores.last();
		System.out.println("���� ���� ����: "+score);
		System.out.println("---------------");
		
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ����: "+score);
		score = scores.higher(95);
		System.out.println("95�� ���� ����: "+score);
		System.out.println("---------------");
		
		score = scores.floor(95);
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: "+score);
		score = scores.ceiling(85);
		System.out.println("85�� �̰ų� �ٷ� �� ����: "+score);
		System.out.println("---------------");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println("���� ���� ��ü�� ����:"+score+"(���� ��ü:"+scores.size()+")");
		}
	}

}

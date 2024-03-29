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
		System.out.println("가장 낮은 점수: "+score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: "+score);
		System.out.println("---------------");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: "+score);
		score = scores.higher(95);
		System.out.println("95점 위의 점수: "+score);
		System.out.println("---------------");
		
		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수: "+score);
		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위 점수: "+score);
		System.out.println("---------------");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println("가장 낮은 객체를 삭제:"+score+"(남은 객체:"+scores.size()+")");
		}
	}

}

package sec04.exam05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		//내림차순
		NavigableSet<Integer> desSet = scores.descendingSet();
		for(Integer score: desSet) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascSet = desSet.descendingSet();
		
		for(Integer score: ascSet) {
			System.out.print(score+" ");
		}
	}

}

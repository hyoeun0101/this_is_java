package sec04.exam05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		scores.put(87, "hong");
		scores.put(98, "lee");
		scores.put(75, "bak");
		scores.put(95, "sin");
		scores.put(80, "kim");
		
		//내림차순
		NavigableMap<Integer,String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet ) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		System.out.println("------------");
		
		//오름차순
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet =  ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet ) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}

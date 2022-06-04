package verify.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("black", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			totalScore+= entry.getValue();
			if(maxScore<entry.getValue()) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
		}
		
		System.out.println("평균 점수: "+totalScore/map.size());
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최고 점수를 받은 아이디: "+name);
		
		
		}

}

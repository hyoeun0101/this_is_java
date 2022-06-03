package sec04.exam01_Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//按眉 历厘
		map.put("eun", 100);
		map.put("jun", 95);
		map.put("sun", 90);
		System.out.println("醚 按眉狼 荐: "+map.size());
		
		//按眉 茫扁
		System.out.println("eun: "+map.get("eun"));
		System.out.println("==========");
		
		//按眉甫 窍唱究 贸府 how1
		Set<String> keyset = map.keySet();
		Iterator<String> keyIter = keyset.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println("========");

		
		//按眉 昏力
		map.remove("eun");
		System.out.println("Entry 荐: "+map.size());
		
		//按眉甫 窍唱究 贸府 how2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		System.out.println("========");
		
		map.clear();
		System.out.println("Entry 荐: "+map.size());
	}

}

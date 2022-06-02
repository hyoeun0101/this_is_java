package sec04.exam04_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//��ü ����
		map.put("eun", 100);
		map.put("jun", 95);
		map.put("sun", 90);
		System.out.println("�� ��ü�� ��: "+map.size());
		
		//��ü ã��
		System.out.println("eun: "+map.get("eun"));
		System.out.println("==========");
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("=========");
		
		//��ü ����
		map.remove("eun");
		System.out.println("Entry ��: "+map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
			
		}
		System.out.println("========");
		
		map.clear();
		System.out.println("Entry ��: "+map.size());
	}

}

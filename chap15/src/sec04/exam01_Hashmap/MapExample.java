package sec04.exam01_Hashmap;

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
		
		//��ü�� �ϳ��� ó�� how1
		Set<String> keyset = map.keySet();
		Iterator<String> keyIter = keyset.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println("========");

		
		//��ü ����
		map.remove("eun");
		System.out.println("Entry ��: "+map.size());
		
		//��ü�� �ϳ��� ó�� how2
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
		System.out.println("Entry ��: "+map.size());
	}

}

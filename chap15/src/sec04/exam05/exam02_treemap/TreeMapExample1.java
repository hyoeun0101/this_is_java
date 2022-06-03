package sec04.exam05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		scores.put(87, "hong");
		scores.put(98, "lee");
		scores.put(75, "bak");
		scores.put(95, "sin");
		scores.put(80, "kim");
		
		Map.Entry<Integer, String> entry =null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-"+entry.getValue());
		System.out.println("---------------");
		
		entry = scores.lowerEntry(95);
		System.out.println("95�� �Ʒ� ����: "+entry.getKey()+"-"+entry.getValue());
		entry  = scores.higherEntry(95);
		System.out.println("95�� �� ����: "+entry.getKey()+"-"+entry.getValue());
		System.out.println("---------------");
		
		entry = scores.floorEntry(95);
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: "+entry.getKey()+"-"+entry.getValue());
		entry = scores.ceilingEntry(85);
		System.out.println("85�� �̰ų� �ٷ� �� ����: "+entry.getKey()+"-"+entry.getValue());
		System.out.println("---------------");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+" - "+entry.getValue()+"(���� ��ü:"+scores.size()+")");
		}
	}

}

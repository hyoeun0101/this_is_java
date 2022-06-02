package verify.exam04;

public class Util<T,K>{
	//how1
//	public static <K,V> V getValue(Pair<K,V> p,K key) {
//		boolean result = p.getKey().equals(key);
//		if(result) {
//			return p.getValue();
//		}else {
//			return null;
//		}
//	}
	
	//how2
	public static <P extends Pair<K,V>,K,V> V getValue(P p,K key) {
	boolean result = p.getKey().equals(key);
	if(result) {
		return p.getValue();
	}else {
		return null;
	}
}
}

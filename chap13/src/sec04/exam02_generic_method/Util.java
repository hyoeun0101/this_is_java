package sec04.exam02_generic_method;

public class Util {
	//¸Þ¼Òµå
	public static <K,V> boolean compare(Pare<K,V> p1, Pare<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valCompare = p1.getVal().equals(p2.getVal());
		
		return keyCompare && valCompare;
	}
}

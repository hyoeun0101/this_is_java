package sec05.exam01_bounded_type;

public class Util {
	public static <T extends Number> int compare(T t1,T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		// v1이 크면 1, 같으면 0, 작으면 -1
		return Double.compare(v1, v2);
	}
}
 
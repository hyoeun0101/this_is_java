package sec05.exam08_and_or_negate_isequal.copy;

import java.util.function.IntPredicate;

public class PredicateAndOrNegatrExample {
	public static void main(String[] args) {
		IntPredicate predicateA = a -> a%2==0;
		
		IntPredicate predicateB = b -> b%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����ΰ�? "+ result);
		
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� ��� �Ǵ� 3�� ����ΰ�??"+ result);
		
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���ΰ�? "+result);
	}
}

package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x,y)->Calculator.staticMethod(x, y);
		System.out.println("���1: "+ operator.applyAsInt(3, 4));
		
		//�޼ҵ� ����
		operator = Calculator::staticMethod;
		System.out.println("���1: "+ operator.applyAsInt(3, 4));
		
		Calculator cal = new Calculator();
		operator = (x,y) -> cal.instanceMethod(x, y);
		System.out.println("���2: "+operator.applyAsInt(3, 4));
		
		//�޼ҵ� ����
		operator = cal::instanceMethod;
		System.out.println("���2: "+operator.applyAsInt(3, 4));
		

	}
}

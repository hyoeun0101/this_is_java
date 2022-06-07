package sec06.exam02_argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
public static void main(String[] args) {
	ToIntBiFunction<String,String> function;
	function = (a,b) -> a.compareToIgnoreCase(b);
	System.out.println(function.applyAsInt("java8", "JAVA8"));
	//메소드 참조
	function = String::compareToIgnoreCase;
	System.out.println(function.applyAsInt("java8", "JAVA8"));


}
}

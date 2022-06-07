package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> fun1 = Member::new;
		Member member1 = fun1.apply("angel");
		
		BiFunction<String,String, Member> fun2 = Member::new;
		Member member2 = fun2.apply("신천사", "호호");
		
		System.out.println(member1.getId());
		System.out.println(member2.getId());
		System.out.println(member1.getname());
		System.out.println(member2.getname());
	}
}

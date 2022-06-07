package sec05.exam03_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",90,96),
			new Student("�ſ��",95,93)
			
			);
	
	public static void printString( Function<Student, String> fun) {
		for(Student student: list) {
			System.out.print(fun.apply(student)+" ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> fun) {
		for(Student student: list) {
			System.out.print(fun.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	

			
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString(t -> t.getName());
		
		System.out.println("[���� ����]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[���� ����]");
		printInt(t -> t.getMathScore());
	
	}

}
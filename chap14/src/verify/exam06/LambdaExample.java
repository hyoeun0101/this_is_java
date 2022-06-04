package verify.exam06;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
	};
	
	private static double avg(ToIntFunction<Student> fun) {
		int sum=0;
		for(Student student : students) {
			sum += fun.applyAsInt(student);
		}
		return (double)sum/students.length;
	}
	
	public static void main(String[] args) {
		double e = avg(student -> student.getEnglishScore());
		double m = avg(student -> student.getMathScore());
		
		System.out.println(e);
		System.out.println(m);
	}
}

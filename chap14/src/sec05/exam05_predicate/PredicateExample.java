package sec05.exam05_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("hong","m",90),
			new Student("sun","w",90),
			new Student("bak","m",95),
			new Student("eun","w",92)
			);
	
	private static double avg(Predicate<Student> pre) {
		int count=0,sum =0;
		for(Student s: list) {
			if(pre.test(s)) {
				count++;
				sum+= s.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		
		double maleAvg = avg(t -> t.getSex().equals("m"));
		System.out.println("남자 평균 점수:"+ maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("w"));
		System.out.println("여자 평균 점수: "+femaleAvg);
	}

}

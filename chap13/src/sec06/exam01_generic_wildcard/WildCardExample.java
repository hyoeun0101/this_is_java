package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" 수강생: "+
				Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Students> course) {
		System.out.println(course.getName()+" 수강생: "+
				Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> workercourse) {
		System.out.println(workercourse.getName()+" 수강생: "+
				Arrays.toString(workercourse.getStudents()));
	}


	public static void main(String[] args) {

		Course<Person> personcourse = new Course<Person>("일반인 과정",5);
		personcourse.add(new Person("일반인"));
		personcourse.add(new Person("직장인"));
		personcourse.add(new Person("학생"));
		personcourse.add(new Person("고등학생"));

		Course<Worker> workercourse = new Course<Worker>("직장인 과정",5);
		workercourse.add(new Worker("직장인"));

		Course<Students> studentcourse = new Course<Students>("학생 과정",5);
		studentcourse.add(new Students("학생"));
		studentcourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentcourse = new Course<HighStudent>("고등학생 과정",5);
		highStudentcourse.add(new HighStudent("고등학생"));
		
		//등록하기
		registerCourse(personcourse);
		registerCourse(workercourse);
		registerCourse(studentcourse);
		registerCourse(highStudentcourse);
		System.out.println("----------------------------");
		
		registerCourseStudent(studentcourse);
		registerCourseStudent(highStudentcourse);
		System.out.println("----------------------------");
		registerCourseWorker(workercourse);
		registerCourseWorker(personcourse);
	}

}

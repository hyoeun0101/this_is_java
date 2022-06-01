package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" ������: "+
				Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Students> course) {
		System.out.println(course.getName()+" ������: "+
				Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> workercourse) {
		System.out.println(workercourse.getName()+" ������: "+
				Arrays.toString(workercourse.getStudents()));
	}


	public static void main(String[] args) {

		Course<Person> personcourse = new Course<Person>("�Ϲ��� ����",5);
		personcourse.add(new Person("�Ϲ���"));
		personcourse.add(new Person("������"));
		personcourse.add(new Person("�л�"));
		personcourse.add(new Person("����л�"));

		Course<Worker> workercourse = new Course<Worker>("������ ����",5);
		workercourse.add(new Worker("������"));

		Course<Students> studentcourse = new Course<Students>("�л� ����",5);
		studentcourse.add(new Students("�л�"));
		studentcourse.add(new HighStudent("����л�"));

		Course<HighStudent> highStudentcourse = new Course<HighStudent>("����л� ����",5);
		highStudentcourse.add(new HighStudent("����л�"));
		
		//����ϱ�
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

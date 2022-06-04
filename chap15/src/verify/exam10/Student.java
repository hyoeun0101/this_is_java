package verify.exam10;

public class Student implements Comparable{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}


	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		if(student.score < score)
			return 1;
		else if(student.score == score)
			return 0;
		else
			return -1;
	}
}

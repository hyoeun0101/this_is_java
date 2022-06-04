package verify.exam08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	//해시코드 생성
	@Override
	public int hashCode() {
		return studentNum + name.hashCode();
	}
	
	//같은 해시코드가 있다면 객체 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return name.equals(s.name) && studentNum == s.studentNum;
		}
		else {
			return false;
		}
	}
}

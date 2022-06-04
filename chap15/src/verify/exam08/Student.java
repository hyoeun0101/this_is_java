package verify.exam08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	//�ؽ��ڵ� ����
	@Override
	public int hashCode() {
		return studentNum + name.hashCode();
	}
	
	//���� �ؽ��ڵ尡 �ִٸ� ��ü ��
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

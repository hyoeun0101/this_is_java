package chap07.sec03.exam01_parant_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//�θ��� �⺻ �����ڰ� ������ �ٸ� �����ڸ� ��������� ȣ��.
		//�θ� �����ڴ� �ڽ� �������� �� ù�ٿ��� ȣ��Ǿ�� �Ѵ�.
		//���� �⺻������ super(); ����-> �̴� �θ��� �⺻ ������ ȣ��
		super(name, ssn);
		this.studentNo = studentNo;
	}

}

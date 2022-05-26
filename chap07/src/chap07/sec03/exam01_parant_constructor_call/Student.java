package chap07.sec03.exam01_parant_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//부모의 기본 생성자가 없으니 다른 생성자를 명시적으로 호출.
		//부모 생성자는 자식 생성자의 맨 첫줄에서 호출되어야 한다.
		//원래 기본적으로 super(); 실행-> 이는 부모의 기본 생성자 호출
		super(name, ssn);
		this.studentNo = studentNo;
	}

}

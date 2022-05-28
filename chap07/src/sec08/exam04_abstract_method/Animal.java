package sec08.exam04_abstract_method;

public abstract class Animal {
	//필드
	public String kind;
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//추상 메소드
	public abstract void sound();
	

}

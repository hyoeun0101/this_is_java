package sec10.exam5_singleton;

public class Singleton {
	//싱글톤 : 객체 생성되면 안됨. 접근 불가능.
	//자신의 타입인 정적 필드. 객체 하나만 생성
	private static Singleton singleton = new Singleton();
	
	//생성자. 외부에서 호출 방지- private
	private Singleton() {}
	
	
	static Singleton getInstance() {
		return singleton;
	}
}

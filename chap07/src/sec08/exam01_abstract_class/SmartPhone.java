package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	//constructor
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}

package sec06.exam03_constructor_references;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() execute");
		
	}
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id) execute");
	}
	
	public Member(String name,String id) {
		this.name = name;
		this.id = id;
		System.out.println("Member(String name,String id) execute");
	}
	
	public String getId() {return id;}
	public String getname() {return name;}
}

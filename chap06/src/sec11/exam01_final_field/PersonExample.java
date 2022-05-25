package sec11.exam01_final_field;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","자바");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "python";
		System.out.println(p1.name);
		//final 필드는 수정이 안됨!!
//		p1.nation = "USA";
//		System.out.println(p1.nation);

	}

}
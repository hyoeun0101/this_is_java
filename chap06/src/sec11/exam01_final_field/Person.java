package sec11.exam01_final_field;

public class Person {
	//field
	final String nation = "Korea";
	final String ssn;
	String name;
	
	//constructor
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}

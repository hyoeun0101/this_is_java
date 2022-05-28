package sec08.exam04_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		//일반적인 호출
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		//자동 타입 변환-> 재정의된 자식 메소드를 호출한다.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------------");
		
		//메소드의 다형성. -> 부모 타입의 매개 변수에 자식의 객체를 대입.
		animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

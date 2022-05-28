package sec08.exam04_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		//�Ϲ����� ȣ��
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		//�ڵ� Ÿ�� ��ȯ-> �����ǵ� �ڽ� �޼ҵ带 ȣ���Ѵ�.
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------------");
		
		//�޼ҵ��� ������. -> �θ� Ÿ���� �Ű� ������ �ڽ��� ��ü�� ����.
		animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

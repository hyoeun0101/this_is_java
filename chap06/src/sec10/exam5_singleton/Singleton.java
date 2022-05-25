package sec10.exam5_singleton;

public class Singleton {
	//�̱��� : ��ü �����Ǹ� �ȵ�. ���� �Ұ���.
	//�ڽ��� Ÿ���� ���� �ʵ�. ��ü �ϳ��� ����
	private static Singleton singleton = new Singleton();
	
	//������. �ܺο��� ȣ�� ����- private
	private Singleton() {}
	
	
	static Singleton getInstance() {
		return singleton;
	}
}

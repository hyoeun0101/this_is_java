package sec10.exam02_static_initial;

public class Television {
	//���� �ʵ�
	static String company = "SamSung";
	static String model = "LCD";
	static String info;
	//���� �ʱ�ȭ ���
	static {
		info = company + '-' + model;
	}
}

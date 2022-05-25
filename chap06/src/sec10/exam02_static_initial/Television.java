package sec10.exam02_static_initial;

public class Television {
	//정적 필드
	static String company = "SamSung";
	static String model = "LCD";
	static String info;
	//정적 초기화 블록
	static {
		info = company + '-' + model;
	}
}

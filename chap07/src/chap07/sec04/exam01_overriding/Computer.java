package chap07.sec04.exam01_overriding;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return 3.14159 * r * r;
	}

}

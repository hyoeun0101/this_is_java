package sec11.exam02_static_final;

public class Earth {
	
	//��� ����
	//���? static�̸鼭 final
	//=> ��ü���� ������ �ƴ� Ŭ������ ����. �� ����x
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS + EARTH_RADIUS;
	}
}

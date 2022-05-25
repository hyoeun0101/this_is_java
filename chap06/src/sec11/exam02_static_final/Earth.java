package sec11.exam02_static_final;

public class Earth {
	
	//상수 선언
	//상수? static이면서 final
	//=> 객체마다 저장이 아닌 클래스에 포함. 값 변경x
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS + EARTH_RADIUS;
	}
}

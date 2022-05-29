package sec05.exam03_anonymous_localclass;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//익명 구현객체 생성
		Calculator cal = new Calculator() {
			//int arg2 = 매개값;
			//int var2 = 0;

			@Override
			public int sum() {
				//int arg1 = 매개값;
				//int var1 = 0;
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
			
		};
		
		System.out.println(cal.sum());
		
	}
}

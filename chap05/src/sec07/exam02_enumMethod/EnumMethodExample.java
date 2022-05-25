package sec07.exam02_enumMethod;

import sec07.exam01_enum.Week;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name 메소드 : 열거 객체가 가지고 있는 문자열 리턴.
		Week today = Week.MONDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal 메소드 : 열거 객체 중 몇번째 열거 객체인지 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo 메소드 : 열거 객체가 앞에 있을수록 음수,양수
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		Syste
		m.out.println(result1);
		System.out.println(result2);
		
		//valueOf 메소드 : 매개값으로 주어지는 값과 동일한 열거 객체 리턴
		if(args.length==1)
		{
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUREDAY||weekDay == Week.SUNDAY)
			{
				System.out.println("주말~");
			}else {
				System.out.println("평일");
			}
		}
		//values : 모든 열거 객체를 배열로 리턴
		Week[] days = Week.values();
		for(Week day:days) {
			System.out.println(day);
		}
	}

}

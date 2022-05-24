package sec07.exam01_enum;
import java.util.Calendar;
public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		//Calendar 按眉 积己
		Calendar cal = Calendar.getInstance();
		//老(1)~配(7) 箭磊 府畔
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATUREDAY; break;
		}
		
		System.out.println("Today is "+today);
		if(today==Week.TUESDAY)
		{
			System.out.println("I exercise on Tuesday");
		}

	}

}

package study11;

import java.util.Calendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(1);
		int month = cal.get(2)+1;	//	월은 자바시스템에서 0부터 시작.
		int date = cal.get(5);
		System.out.println(year+"/"+month+"/"+date);
		
		cal.add(Calendar.DATE, -2);
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 1);
		
		year = cal.get(1);
		month = cal.get(2)+1;	//	월은 자바시스템에서 0부터 시작.
		date = cal.get(5);
		
		System.out.println(year+"/"+month+"/"+date);
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int s= cal.get(Calendar.SECOND);
		
		System.out.println(h+"/"+mi+"/"+s);
		
		System.out.println("현재 요일 : "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("올해 몇 번째 날 : "+cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("올해 몇 번째 주 : "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의 몇 번째 주 : "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번 달의 마지막 날 : "+cal.getActualMaximum(Calendar.DATE));
	}
}

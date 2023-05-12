package study11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat1 {

	public static void main(String[] args) {
		//Calendar cal = Calendar.getInstance();
		//String format = "yyyy년 MM월 dd일 hh시 mm분 ss초 E요일";
		//SimpleDateFormat df = new SimpleDateFormat(format);
		//System.out.println("현재날짜 : "+df.format(cal.getTimeInMillis()));
		
		Date today = new Date();
		System.out.println("현재날짜 : "+today);
	}
}

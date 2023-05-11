package study11;

import java.util.Calendar;
import java.util.Scanner;

public class UnixTest3 {
	
	public static int diffDate(String date1,String date2) {
		//풀어보기 4
		Calendar cal = Calendar.getInstance();
		//	기준날짜
		String[] year3 = date1.split("-");
		//	비교날짜
		String[] year4 = date2.split("-");
		
		int yy3 = Integer.parseInt(year3[0]);
		int mm3 = Integer.parseInt(year3[1]);
		int dd3 = Integer.parseInt(year3[2]);
		
		int yy4 = Integer.parseInt(year4[0]);
		int mm4 = Integer.parseInt(year4[1]);
		int dd4 = Integer.parseInt(year4[2]);
		
		
		cal.set(yy3,mm3-1,dd3);
		long u4 = cal.getTimeInMillis();
				
		cal.set(yy4,mm4-1,dd4);
		long u5 = cal.getTimeInMillis();
				
		int u6 = (int) ((u5-u4)/(60*60*24)/1000);
		
		
		return u6;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//풀어보기 2
		Calendar cal = Calendar.getInstance();
		
		String d1 = "2021-03-15";
		String d2 = "2021-04-05";		
		
		String[] year1 = d1.split("-");
		String[] year2 = d2.split("-");
		
		int yy1 = Integer.parseInt(year1[0]);
		int mm1 = Integer.parseInt(year1[1]);
		int dd1 = Integer.parseInt(year1[2]);
		
		int yy2 = Integer.parseInt(year2[0]);
		int mm2 = Integer.parseInt(year2[1]);
		int dd2 = Integer.parseInt(year2[2]);
		
		
		cal.set(yy1,mm1-1,dd1);
		long unix4 = cal.getTimeInMillis();
				
		cal.set(yy2,mm2-1,dd2);
		long unix5 = cal.getTimeInMillis();
				
		int unix6 = (int) ((unix5-unix4)/(60*60*24)/1000);
				
		System.out.println("날짜차이는 : "+unix6+"일");
		
		//풀어보기	4		
		String stanDate;		
		String comDate;
		
		System.out.println("기준연도를 입력해주세요");
		stanDate = scn.next();
		stanDate += "-";
		System.out.println("기준월을 입력해주세요");
		stanDate += scn.next();
		stanDate += "-";
		System.out.println("기준일을 입력해주세요");
		stanDate += scn.next();
		
		System.out.println("비교연도를 입력해주세요");
		comDate = scn.next();
		comDate += "-";
		System.out.println("비교월을 입력해주세요");
		comDate += scn.next();
		comDate += "-";
		System.out.println("비교일을 입력해주세요");
		comDate += scn.next();
		
		int dfDate = UnixTest3.diffDate(stanDate, comDate);
		System.out.println("두 날짜의 차이는 "+dfDate+"일 입니다.");
		
		//풀어보기 5
		//String aa ="1498137807001";
		//long bb = (Long.parseLong(aa)/1000)+(60*60*24*60*1000);
		
		System.out.println("unix타임 숫자를 입력해주세요");
		long aa = scn.nextLong();
		
		System.out.println("몇일후의 날짜를 보시겠습니까?");
		long bb = scn.nextLong();
		
		
		cal.setTimeInMillis(aa);
		int yy5 = cal.get(Calendar.YEAR);
		int mm5 = cal.get(Calendar.MONTH)+1;
		int dd5 = cal.get(Calendar.DATE);
				
		long cc = aa+((60*60*24*bb*1000));//bb의 값을 유닉스 숫자로 변환, 더하기
		
		cal.setTimeInMillis(cc);		
		int yy6 = cal.get(Calendar.YEAR);
		int mm6 = cal.get(Calendar.MONTH)+1;
		int dd6 = cal.get(Calendar.DATE);
		
		System.out.print(aa+"의 날짜는 "+yy5+"년 "+mm5+"월 "+dd5+"일 이며 "
						+bb+"일 후의 날짜는 "+yy6+"년 "+mm6+"월 "+dd6+"일 입니다");
		
		
		
		
	}
}

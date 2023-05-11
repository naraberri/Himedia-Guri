package study11;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest3 {//20001010

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("확인할 연도를 입력해주세요");
		int yy = scn.nextInt();
		System.out.println("확인할 월을 입력해주세요");
		int mm = scn.nextInt();
		
		cal.set(yy,mm-1,1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);		
		int lastDay = cal.getActualMaximum(Calendar.DATE); //이번달의 마지막 날짜
		int ln = 0;
		
		System.out.println("----"+yy+"년 "+mm+"월 달력----");
		for(int w=1;w<week;w++) {
			System.out.print("   ");
			ln++;
		}
		
		for(int d=1; d<=lastDay; d++) {
			if(d<10) {
				System.out.print("0"+d + " ");
				ln++;
			}else {
				System.out.print(d + " ");
				ln++;
			}
			
			
			if(ln == 7) {
				System.out.println();//개행
				ln = 0;
			}
		}
	}
}

package study11;

import java.util.Calendar;
import java.util.Scanner;

public class UnixTest2 {
	//풀어보기 3
	public static int doomDay(String date) {
		String[] year = date.split("-");	// 대상날짜 년,월,일 잘라내기
		
		int yy = Integer.parseInt(year[0]);	//	년
		int mm = Integer.parseInt(year[1]);	//	월
		int dd = Integer.parseInt(year[2]);	//	일
		
		Calendar cal = Calendar.getInstance();
		long u1 = cal.getTimeInMillis();	//	현재날짜
		
		cal.set(yy,mm-1,dd);		
		long u2 = cal.getTimeInMillis();	// d-day날짜
		
		int u3 = (int) ((u2-u1)/(60*60*24)/1000);
		
		return u3;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//풀어보기 1
				
		Calendar cal = Calendar.getInstance();
		long unix = cal.getTimeInMillis();
		
		cal.set(2023, 11, 25);		
		long unix2 = cal.getTimeInMillis();
		
		int unix3 = (int) ((unix2-unix)/(60*60*24)/1000);//long타입은 메모리 많이 먹음.
		
		System.out.println("크리스마스까지 D-Day : "+unix3+"일");
						
		//풀어보기3
		String inNumber;
		System.out.println("연도를 입력해주세요");
		inNumber = scn.next();
		inNumber += "-";
		System.out.println("월을 입력해주세요");
		inNumber += scn.next();
		inNumber += "-";
		System.out.println("일을 입력해주세요");
		inNumber += scn.next();
		
		int dDay = UnixTest2.doomDay(inNumber);
		System.out.println(dDay+"일 남았습니다.");
		
	}
}

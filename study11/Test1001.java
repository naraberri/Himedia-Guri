package study11;

import java.util.Calendar;
import java.util.Scanner;

public class Test1001 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("확인할 연도를 입력해주세요");
		int yy = scn.nextInt();
		System.out.println("확인할 월을 입력해주세요");
		int mm = scn.nextInt();
		
		CalendarTest3.calview(yy,mm);
		
	}	
	
}

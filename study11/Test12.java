package study11;

import java.util.Calendar;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {		
	//	랜덤 : 1~100 사이의 값 생성
	//	시스템이 얻은 값을 맞추는 문제
	Calendar cal = Calendar.getInstance();
	long u1 = cal.getTimeInMillis();
	System.out.println(u1);
	Scanner scn = new Scanner(System.in);
	
	int nansu = (int)(Math.random()*100)+1;
	int cnt = 0;
	
	while(true) {
		System.out.println("랜덤숫자를 맞춰주세요^____^");
		System.out.print("숫자입력>>");
		int answer = scn.nextInt();
		
		if(answer == nansu) {
			System.out.println(nansu+"이걸 맞춰???");
			break;
		} else {
			System.out.println("생각을 더하세요 인간.");
		}
		cnt++;
		if(cnt == 30) break;
	}
	cal = Calendar.getInstance();
	long u2 = cal.getTimeInMillis();
	System.out.println(u2);
	int result = (int) ((u2-u1)/1000);
	System.out.println("걸린시간 : "+result+"초");
	System.out.println("당신은 탈출에 실패했습니다.");
	
	}
}

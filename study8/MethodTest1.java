package study8;

import java.util.Calendar;
import java.util.Scanner;

public class MethodTest1 {
	//풀어보기1
	public static void my_sum(int a,int b,int c) {
		int result = a+b+c;
		
		System.out.println(result);
	}
	//풀어보기2
	public static int my_sum1(int a,int b,int c) {
		int result = a+b+c;
		
		return result;
	}
	//풀어보기3
	public static String space_delete(String str) {
		String str1 = str.replace(" ", "");
		
		return str1;
		
	}
	//풀어보기4
	public static void division(double a) {
		int b = (int)a;
		double c = a-b;
		
		System.out.println("정수:"+b+" / 실수:"+String.format("%.3f",c));
	}
	
	//풀어보기4 - 교수님
	/*public static void split_number(double a) {
		
		String b = a+"";	//숫자 -> 문자
		String[] ar1 = b.split("\\.");
		System.out.println("정수:"+ar1[0]+" / 실수:0."+ar1[1]);
	}*/
	
	
	public static void my_number(String number) {
		Calendar cal = Calendar.getInstance();
		String[] str = number.split("-");
		int chk1 = Integer.parseInt(str[1].substring(0,1));//주민등록번호 뒷자리 첫번째 번호
		int chk2 = Integer.parseInt(str[0].substring(0,2));//나이계산용 연도
		int age = 0;
		int mm = Integer.parseInt(str[0].substring(2,4));//생일출력용 달
		int dd = Integer.parseInt(str[0].substring(4));//생일출력용 일
		String gender ="";
		
		//	주민등록번호 오류체크
		
		if(str[0].length()==6 && str[1].length()==7 && mm<13) {
				
			if(chk1>0 && chk1<5) {
				System.out.println("정상");
			}else {
				System.out.println("잘못된 입력값입니다");
			}
					
		} else {
			System.out.println("잘못된 입력값입니다");
		}		
		
		//	나이체크
		
		if(chk2>23) {
			chk2 += 1900;
		} else {
			chk2+= 2000;
		}
		age = cal.get(Calendar.YEAR)-chk2;
		//	성별체크
		if(chk1 == 1||
		   chk1 == 3 ) {
			gender="남성";
		}else {
			gender="여성";
		}
		//	생일체크
		
		// 출력
		System.out.println("나이 : "+age+"세");
		System.out.println("성별 : "+gender);
		System.out.println("생일 : "+mm+"월"+dd+"일");
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		my_sum(10,20,30);		
		System.out.println(my_sum1(10,20,30));
		System.out.println(space_delete("우리 모두의 백과 사전"));
		division(4.1234);
		
		String number="";
		System.out.println("주민번호 앞자리를 입력해주세요");
		number = scn.next();
		number += "-";
		System.out.println("주민번호 뒷자리를 입력해주세요");
		number += scn.next();
		my_number(number);

	}

	

}

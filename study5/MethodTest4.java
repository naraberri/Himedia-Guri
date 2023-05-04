package study5;

import java.util.Calendar;

public class MethodTest4 {

	public static void main(String[] args) {
		int year = 1990;
		System.out.println("나이 : "+myAge1(year));
		
		myAge(1999);		
		int eng = 90;
		int kor = 88;
		mySum(eng,kor);
		myAvg(eng,kor);
	}
	
	public static void myAge(int a) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int age = year-a;
		System.out.println("나이 : "+age);
	}
	
	public static byte myAge1(int a) {
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR)-a;
		return (byte)age;
	}
	
	public static void mySum(int eng,int kor) {
		int hap = eng+kor;
		System.out.println(hap);
	}
	
	public static void myAvg(int eng,int kor) {
		int avg = (eng+kor)/2;
		System.out.println(avg);
	}
}

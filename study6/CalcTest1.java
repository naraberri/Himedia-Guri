package study6;

import java.util.Scanner;

public class CalcTest1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");		
		int a = scn.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요.");
		int b = scn.nextInt();
		
		System.out.println("사칙연산을 입력해주세요.(+,-,*,/)");
		String c = scn.next();
		
		myCalc(a,b,c);

	}
	
	public static void myCalc(int a,int b,String c) {
		int result = 0;
		switch(c) {
			case "*" : result = a*b;
				break;
			case "/" : result = a/b;
				break;
			case "+" : result = a+b;
				break;
			case "-" : result = a-b;
				break;
		}
		System.out.println(a+c+b+" = "+result);
	}

}

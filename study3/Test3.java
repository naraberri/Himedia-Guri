package study3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int c1 = scn.nextInt();
		System.out.println("연산자를 입력해주세요.(+,-,*,/)");
		String sign  = scn.next();
		System.out.println("두번째 숫자를 입력해주세요.");
		int c2 = scn.nextInt();
		int result = 0;		
		
		switch(sign) {
			case "*" : result = c1*c2;
				break;
			case "/" : result = c1/c2;
				break;
			case "+" : result = c1+c2;
				break;
			case "-" : result = c1-c2;
				break;
			default : System.out.println("잘못입력했습니다.");
				break;
		}
		System.out.println(c1+sign+c2+"="+result);

	}

}

package study2;

import java.util.Scanner;

public class Test9_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {		
		
			System.out.println("=드시려는 커피의 번호를 입력해주세요.=");
			System.out.println("1.아메리카노");
			System.out.println("2.다방커피");
			System.out.print("* 커피번호 >> ");
			int n1 = scn.nextInt();
			if(n1 == 1) {
				
			} else if(n1 == 2) {
				
			} else {
				System.out.println("없는 번호입니다.");
			}
		}
	}

}

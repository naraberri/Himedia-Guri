package study4;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] month = {1,3,5,10,12};
		int idx = 0;
		while(idx<month.length) {
			System.out.println(month[idx]+"월 ");
			idx++;
		}
		
		//	int i : month -->
		//	배열안에 있는 요소 하나하나를 i변수에 값을 줘서 출력
		for(int i : month) {
			System.out.println(month[i]+"월 ");
		}
		
		String[] str = {"aa","bb","cc"};
		for(String s :str) {
			System.out.println(s);
		}
		
		
		System.out.println("양수를 입력해주세요.");
		int a = scn.nextInt();		
		while(true) {
			if(a>0) {
				System.out.println(a+"을 입력했습니다.");
				break;
			}else {
				System.out.println("반복문을 종료합니다.");
				break;
			}
		}
		
		while(true) {
			System.out.println("양수를 입력해주세요.");
			int b = scn.nextInt();
			if(b == -1) {
				System.out.println("종료합니다");
				break;
			} else if(b >= 0) {
				System.out.println(b+"을 입력했습니다.");
			}
		}
		
	}

}

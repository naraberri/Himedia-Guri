package study2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String coffee = "";
		String sweet = "";
		
		System.out.println("=드시려는 커피의 번호를 입력해주세요.=");
		System.out.println("1.아메리카노");
		System.out.println("2.다방커피");
		System.out.print("* 커피번호 >> ");		
		int num = scn.nextInt();
			
		if(num == 1) {
			coffee = "아메리카노";
			System.out.println("="+coffee+"를 선택했습니다.=");
			System.out.println("1.설탕 넣기");
			System.out.println("2.설탕 없음");
			System.out.print("* 설탕번호 >> ");
			num = scn.nextInt();
			if(num == 1) {
				sweet = "설탕 넣은 ";
			} else if(num == 2) {
				sweet = "설탕 없는 ";
			} else {
				System.out.println("없는번호입니다.");
			}
			System.out.println(sweet+coffee+"가 나왔습니다.");
			}
			else if(num == 2) {
			coffee = "다방커피";
			System.out.println("="+coffee+"를 선택했습니다.=");
			System.out.println("1.프림1 + 설탕1 (연한맛)");
			System.out.println("1.프림2 + 설탕2 (단맛)");
			System.out.println("1.프림3 + 설탕3 (아주단맛)");
			System.out.print("* 선택번호 >> ");
			num = scn.nextInt();
			if(num == 1) {
				sweet = "연한맛 ";
			} else if(num == 2) {
				sweet = "단맛 ";
			} else if(num ==3) {
				sweet = "아주단맛 ";
			}
			else {
				System.out.println("없는번호입니다.");
			}
			System.out.println(sweet+coffee+"가 나왔습니다.");
			}
			else {
				System.out.println("없는번호입니다.");
			}
		
	}

}

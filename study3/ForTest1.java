package study3;

import java.util.Calendar;
import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for(int i=1; i<=7; i++) {
			System.out.println("javascript");
		}
		System.out.println("-------------------------");
		
		for(int i=11; i<=20; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("---------풀어보기1---------");
		
		for(int i=1; i<4; i++) {
			if(i==3) {
				System.out.println("문항 "+i+":오답");
			} else {
				System.out.println("문항 "+i+":정답");
			}
		}
		System.out.println("---------풀어보기2---------");
		
		Calendar cal = Calendar.getInstance();	//달력가져오기
		int yy = cal.get(Calendar.YEAR);		//달력가져오기
		
		for(int i=2021; i<2026; i++) {
			if(i == yy) {
				System.out.print("("+i+"년)");
			} else {
				System.out.print(i+"년");
			}
		}
		System.out.println("");
		System.out.println("---------풀어보기3---------");
		
		System.out.println("구구단숫자를 입력해주세요.");
		int num = scn.nextInt();
		System.out.println("- "+num+"단 출력 -");
		for(int i=1; i<=9; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		System.out.println("---------풀어보기4---------");
		
		System.out.println("출력할 별 갯수를 입력해주세요.");
		int star = scn.nextInt();
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		
	}

}

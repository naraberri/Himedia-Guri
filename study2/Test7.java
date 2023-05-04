package study2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("연차를 입력 : ");
		int emp_A_year = scn.nextInt();
		String year = "";
		
		if(emp_A_year >=15) {
			year = "특급";
		} else if(emp_A_year>=10) {
			year = "고급";
		} else if(emp_A_year>=6) {
			year = "중급";
		} else {
			year = "초급";
		}
		System.out.println("A 사원의 년차는 "+emp_A_year+"년으로"+year+"입니다." );
		System.out.println("--------------------------------------");
		
		
		String gender = "F";
		
		if(gender == "M") {
			System.out.println("A씨의 성별 코드는 "+gender+"로 남성입니다.");
		} else if(gender == "F") {
			System.out.println("A씨의 성별 코드는 "+gender+"로 여성입니다.");
		} else {
			System.out.println("잘못된 코드입니다.");
		}
		System.out.println("--------------------------------------");
		
		
		
	}

}

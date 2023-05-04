package study3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int time = 18;
		if(time != 18) {	//if(!(time == 18)){ }
			System.out.println("지금은 퇴근 시간이 아닙니다.");
		} else {
			System.out.println("퇴근 시간입니다. 10분 후 소등하겠습니다.");
		}
		
		System.out.println("------------------------------");
		
		if(!(time == 18)) {	
			System.out.println("지금은 퇴근 시간이 아닙니다.");
		} else {
			System.out.println("퇴근 시간입니다. 10분 후 소등하겠습니다.");
		}
		
		System.out.println("------------------------------");
		
		boolean result = true;	//	result = (1 == 1);
		if(!result) {
			System.out.println("11");
		} else {
			System.out.println("22");
		}
		System.out.println("------------------------------");
		
		int n1 = scn.nextInt();	
		
		int kor = n1;
		n1 = scn.nextInt();
		int eng = n1;
		
		if(kor>=60 && eng>=60) {
			System.out.println("합격입니다.");
		} else if ( (kor>=60 && eng<60) || 
					(kor<60 && eng>=60) ) {
			System.out.println("재시험입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("------------------------------");
		
		n1 = scn.nextInt();
		
		int math = n1;
		String level = "";
		
		if(math>=90) {
			level = "A학점";
		} else if (math>=80) {
			level = "B학점";
		} else if (math>=70) {
			level = "C학점";
		} else if (math>=60) {
			level = "D학점";
		} else {
			level = "F학점";
		}
		
		System.out.println(math+"점은 "+level+" 입니다.");
		System.out.println("------------------------------");		
				
		n1 = scn.nextInt();
		int num = n1;
				
		if(num%2 == 0 && num%10 == 0) {
			System.out.println("짝수이고 10의 배수입니다.");
		} else if(num%2 == 0 && num%10 != 0) {
			System.out.println("짝수이고 10의 배수가 아닙니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		System.out.println("------------------------------");
		
		n1 = scn.nextInt();
		num = n1;
		String page ="";
		
		if(num>0 && num<11) {
			page ="1페이지";
		} else if(num>10 && num<21) {
			page ="2페이지";
		} else if(num>20 && num<31) {
			page ="3페이지";
		} else {
			System.out.println("잘못된 숫자입력");
		}
		System.out.println("입력된 값은 "+num+"로 "+page+" 범위에 있습니다.");
		System.out.println("------------------------------");
		
		n1 = scn.nextInt();
		num = n1;
		int page1 = ((num-1)/10)+1;
		System.out.println("입력된 값은 "+num+"로 "+page1+" 범위에 있습니다.");
	}

}

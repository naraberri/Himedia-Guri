package study4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--------풀어보기 1--------");
		for(int i=1;i<18;i++) {
			if(i%5 == 0) {
				System.out.print(i+"** ");
			} else {
				System.out.print(i+" ");
			}
			/*System.out.println(i);
			System.out.println((i%5 == 0)?"** ":" ");*/ //	삼항연산자 사용
		}
		System.out.println();
		System.out.println("--------풀어보기 2--------");
		
		int[] months = {1,3,10};
		for(int i=0;i<months.length;i++) {
			int m = months[i];
			String season = "";
			
			if(m >=3 && m<=5) {
				season = "봄";
			} else if(m >=6 && m<=8) {
				season = "여름";
			} else if(m >=9 && m<=11) {
				season = "가을";
			} else {
				season = "겨울";
			}
			System.out.println(((m<10)?"0":"")+m+"월 : "+season);
		}
		
		System.out.println("--------풀어보기 3--------");
		
		
		for(int i=2;i<5;i++) {
			for(int j=1;j<4;j++) {
				System.out.println(i+"*"+j+" = "+(i*j));
			}
			System.out.println();
		}		
		
		System.out.println("--------풀어보기 4--------");
		
		String[] coffee = {"아메리카노","카푸치노","카페라떼","오늘의커피"};
		int[] price = {3500,4500,4300,3500};			
			
		while(true) {
			System.out.println("커피 번호를 선택해주세요.");
			System.out.println("1.아메리카노 2.카푸치노 3.카페라떼 4.오늘의커피 5.주문취소");
			System.out.print("번호>>");
			int c1 = scn.nextInt();
			
			if(c1 == 5) {
				System.out.println("주문을 취소했습니다.");
				break;
			}else if(c1<=0 && c1>=6) {
				System.out.println("번호를 다시 입력해주세요.");
			} else {			
				System.out.println(coffee[c1-1]+"를 선택하셨습니다.");
				System.out.println(price[(c1-1)]+"원 결제를 부탁드립니다.");
				break;
			}	
			
		}
		
		/*System.out.println("--------풀어보기 4--------");
		
		String[] coffee = {"아메리카노","카푸치노","카페라떼","오늘의커피"};
		int[] price = {3500,4500,4300,3500};			
			
		while(true) {
			System.out.println("커피 번호를 선택해주세요.");
			System.out.println("1.아메리카노 2.카푸치노 3.카페라떼 4.오늘의커피 5.주문취소");
			System.out.print("번호>>");
			int c1 = scn.nextInt();
				
			switch(c1) {
				case 1 : System.out.println(coffee[c1-1]+"를 선택하셨습니다.");
						 System.out.println(price[(c1-1)]+"원 결제를 부탁드립니다.");
						 return;
				case 2 : System.out.println(coffee[c1-1]+"를 선택하셨습니다.");
				 		 System.out.println(price[(c1-1)]+"원 결제를 부탁드립니다.");
				 		 return;
				case 3 : System.out.println(coffee[c1-1]+"를 선택하셨습니다.");
				 		 System.out.println(price[(c1-1)]+"원 결제를 부탁드립니다.");
				 		 return;
				case 4 : System.out.println(coffee[c1-1]+"를 선택하셨습니다.");
				 		 System.out.println(price[(c1-1)]+"원 결제를 부탁드립니다.");
				 		 return;
				case 5 : System.out.println("주문을 취소했습니다.");
						 return;
				default : System.out.println("번호를 다시 입력해주세요.");
			}
			
		}*/
		
		System.out.println("--------풀어보기 5-1--------");
		for(int i=1;i<6;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------풀어보기 5-2--------");
		for(int i=1;i<6;i++) {
			for(int j=i;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------풀어보기 6--------");
		
		int[][] classA = { {90,80,70},{50,100,100} };
		int hap1 = 0;
		int hap2 = 0;
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		int len1 = classA[0].length;
		int len2 = classA[1].length;
		
		for(int i=0; i<classA.length; i++) {
			for(int j=0; j<classA[i].length; j++) {
				if(i==0) {
					hap1 += classA[i][j];
				}else {
					hap2 += classA[i][j];
				}
			}
		}
		
		avg1 = hap1/len1;
		avg2 = hap2/len2;
		avg3 = (hap1+hap2)/(len1+len2);
		
		System.out.println("1반 총점:"+hap1+"점/평균:"+avg1+"점");
		System.out.println("1반 총점:"+hap2+"점/평균:"+avg2+"점");
		System.out.println("전체평균:"+avg3+"점");
		
	}

}

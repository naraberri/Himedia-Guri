package study2;

import java.util.Scanner;

public class Test1Teacher {

	public static void main(String[] args) {
		//영어점수 80이상 우수 아니면 양호
		
		int eng = 80;
		String result1 = (eng >= 80)?"우수":"양호";
		String result2 = "";
		if(eng>=80) {
			result2 = "우수";
		} else {
			result2 = "양호";
		}
		/*switch(){
			case 1 : System.out.println("답은 1");
			break;
			case 2 : System.out.println("답은 2");
			break;
			default : System.out.println("답 없음");
		}*/
		System.out.println(eng+" : "+result1);
		System.out.println("-------------------------------------");
		
		int apple = 88;
		String result3 = (apple >=80)?"A등급":(apple>=60)?"B등급":"C등급";
		System.out.println("사고의 당도는 "+apple+"으로 "+result3+"입니다.");
		System.out.println("-------------------------------------");
		
		int number = 10;
		System.out.println( ((number>0)?"양수":
							 (number<0)?"음수":"0")+ "입니다." );
		System.out.println("-------------------------------------");
		
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		
		int score = scn.nextInt();
		String result4 = (score >= 90)?"A학점":
						 (score >= 80)?"B학점":
						 (score >= 70)?"C학점":
						 (score >= 60)?"D학점":"F학점";
		System.out.println(score+"점은 : "+result4);
	}

}

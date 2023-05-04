package study2;

public class Test1 {

	public static void main(String[] args) {
		
		int eng = 80;
		String result = (eng >= 80)?"우수":"양호";
		System.out.println("영어점수는 "+eng+"점으로 "+result+"합니다.");
		System.out.println("--------------------------");
		
		int gender = 1;
		String result1 = (gender == 1)?"남자":"여자";
		System.out.println("성별은 "+result1+"입니다.");
		System.out.println("--------------------------");
		
		int number = 10;
		String result2 = (number > 0)?"양수":(number < 0)?"음수":"0";
		System.out.println("숫자"+number+"은/는 "+result2+"입니다.");
		System.out.println("--------------------------");
		
		int score = 92;
		String result3 = (score >= 90)?"A학점":(score >= 80)?"B학점":
						 (score >= 70)?"C학점":(score >= 60)?"D학점":"F학점";
		System.out.println(score+"점은 "+result3+"입니다.");
		System.out.println("--------------------------");

	}

}

package study6;

public class StudentInfo1 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.score1 = 70;
		calc.score2 = 80;
		System.out.println("score1 = "+calc.score1);
		System.out.println("score2 = "+calc.score2);
		System.out.println("합계 = "+calc.hap());

	}

}

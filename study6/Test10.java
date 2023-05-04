package study6;

public class Test10 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 88;
		
		System.out.println
			("국어: "+kor+", 영어: "+eng+"  결과는 "+ResultExam.abc(kor,eng));
		
		int[] aa = {26,78,43,78,23,68,97};
		
		System.out.println("점수의 합계: "+ResultExam.arraySum(aa));

	}

}

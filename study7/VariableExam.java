package study7;

class Score {
	int kor;
	int eng;
}

public class VariableExam {
	
	public static void main(String[] args) {
		Score score = new Score();
				
		score.kor = 100;
		score.eng = 90;
		
		int avg = (score.kor+score.eng)/2;
		
		System.out.println("국어 : "+score.kor+" , 영어 : "+score.eng+" , 평균 : "+avg);
		
		
	}
}

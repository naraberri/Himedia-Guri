package study6;

public class ResultExam {

	public static void main(String[] args) {
		int kor = 80;
		int eng = 100;
		System.out.println("국어: "+kor+", 영어: "+eng+"  결과는 "+abc(kor,eng));
		
		int[] score = {60,70,80,68,78};
		int avg = arraySum(score)/score.length;
		
		System.out.println("점수의 합: "+ arraySum(score)+" 평균점수: "+avg);
		
	}
	
	public static String abc(int a,int b) {
		String str = "";
		if(a >=60 && b >=60) str = "합격";
		else if(a <60 && b<60) str = "불합격";
		else str = "재시험";
		
		return str;
	}
	
	public static int arraySum(int[] a) {
		int hap = 0;
		for(int i=0;i<a.length;i++) {
			hap +=a[i];
		}
		return hap;
	}

}

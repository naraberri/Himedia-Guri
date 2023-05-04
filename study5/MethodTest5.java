package study5;

public class MethodTest5 {

	public static void main(String[] args) {
		System.out.println("-------문제1-------");
		roomSize(100);
		System.out.println();
		System.out.println("-------문제2-------");
		int a = 100;
		int b = 20;
		myCalc(a,b,"*");
		System.out.println();
		System.out.println("-------문제3-------");
		int c = 60;
		int d = 58;
		checkTrue(c,d);
		System.out.println();
		System.out.println("-------문제4-------");
		int[] score = {60,70,80,68,78};
		System.out.println("점수의 합 : "+arraySum(score));

	}
	
	public static void roomSize(int a) {
		double a1 = a*0.3025;
		System.out.println("입력하신 "+a+"평방미터는 "+Math.rint(a1)+" 평입니다");
		
	}
	
	public static void myCalc(int a,int b,String c) {
		int result = 0;
		switch(c) {
			case "*" : result = a*b;
				break;
			case "/" : result = a/b;
				break;
			case "+" : result = a+b;
				break;
			case "-" : result = a-b;
				break;
		}
		System.out.println(result);
	}
	
	public static void checkTrue(int a,int b) {
		if(a>=60 && b>=60) {
			System.out.println("a과목 "+a+",b과목 "+b+"로 합격입니다.");
		} else if((a>=60 && b<60) || (a<60 && b>=60)) {
			System.out.println("a과목 "+a+",b과목 "+b+"로 재시험입니다.");
		} else {
			System.out.println("a과목 "+a+",b과목 "+b+"로 불합격입니다.");
		}
	}
	
	public static int arraySum(int[]jumsu) {
		int hap = 0;
		for(int i=0;i<jumsu.length;i++) {
			hap +=jumsu[i];
		}
		return hap;
	}

}

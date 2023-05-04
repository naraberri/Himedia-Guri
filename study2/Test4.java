package study2;

public class Test4 {

	public static void main(String[] args) {
		//문자열 타입의 배열, 숫자타입의 배열
		String[] color = {"blue","yellow","green"};	
		byte[] a1 = {50,60,70};
		short[] a2 = {60,90,100};
		int[] a3 = {98,88,92};
		long[] a4 = {1000L,3000L,5000L};
		
		System.out.println(a1);
		System.out.println(a1[0]+","+a1[1]+","+a1[2]);
		System.out.println("long : "+a4[2]);
		
		float[] a5 = {70.7f,44.7f};
		double[] a6 = {70.6,70.8,70.6};
		
		System.out.println("float : "+a5[0]);
		System.out.println("double : "+a6[0]);
		
		double d2 = 12;
		System.out.println(d2);
		System.out.println("--------------------------");
		
		int[] score = {90,80,88,10,30,80,76};		
		int result = 0;
		int avg = 0;
				
		for(int i=0; i<score.length; i++ ) {
			result += score[i];
			avg = result/score.length;
		}
		System.out.println("점수의 합계는 "+result+"입니다.");
		System.out.println("점수의 평균은 "+avg+"입니다");
		
		//String[] str = {"aa","bb",77};(x)
	}

}

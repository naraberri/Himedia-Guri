package study5;

public class MathTest1 {

	public static void main(String[] args) {
		
		//	ceil() : 소수점 아래 올림.
		System.out.println(Math.ceil(98.2));
		System.out.println(Math.ceil(98.7));
		System.out.println();
		
		// floor() : 소수점 아래 내림
		System.out.println(Math.floor(98.2));
		System.out.println(Math.floor(98.7));
		System.out.println();
		
		//round() : 소수점 아래 반올림.정수형으로 변환
		System.out.println(Math.round(98.2));
		System.out.println(Math.round(98.4));
		System.out.println(Math.round(98.5));
		System.out.println(Math.round(98.9));
		System.out.println();
		
		//rint() : 소수점 아래 반올림.실수형으로 변환
		System.out.println(Math.rint(98.2));
		System.out.println(Math.rint(98.5));
		System.out.println(Math.rint(98.6));
		System.out.println();
		
		//abs() : 주어진 인자값의 절대값 반환.음수만 적용
		System.out.println(Math.abs(-98));
		System.out.println(Math.abs(98));
		System.out.println();
		
		//pow() 지수 승 반환.제곱수
		System.out.println(Math.pow(10,2));
		System.out.println(Math.pow(10,5));
		System.out.println();
		
		//sqrt() 제곱근 반환
		System.out.println(Math.sqrt(1000));
		System.out.println(Math.sqrt(77));
		System.out.println();
		
		//max(),min() 주어진 인자값들 중 가장 큰/작은 값 반환
		System.out.println(Math.max(100,200));
		System.out.println(Math.min(100,200));
		System.out.println();
		
	}

}

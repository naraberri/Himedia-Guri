package study6;

public class MyMath {
	
	public static void main(String[] args) {
		double a1 = 203985472;
		double a2 = 2346769;
		MyCalc(a1, a2);
	}
	
	public static void MyCalc(double a,double b) {
		
		String result = String.format("%.3f", a/b);
		
		System.out.println(result);
		
	}

}

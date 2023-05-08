package study8;

class Test4{
	int a = 0;
	int b = 0;
	int c = 0;
	int result = 0;
	
	public int hap() {
		result = a+b+c;
		return result;
	}
	
	public double avg() {
		return result/3;
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		Test4 kim = new Test4();
		Test4 hong = new Test4();
		
		kim.a = 90;
		kim.b = 80;
		kim.c = 70;
		
		System.out.println("김의 합계:"+kim.hap());
		System.out.println("김의 평균:"+kim.avg());
	}
}

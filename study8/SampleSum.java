package study8;

public class SampleSum {
	
	public void sum() {
		System.out.println(10+10);
	}
	
	public void sum(int a) {
		System.out.println(a+10);
	}
	
	public void sum(String a) {
		System.out.println(a+10);
	}
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void sum(String str,int a,int b) {
		System.out.println(str);
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		SampleSum s = new SampleSum();
		s.sum();
		s.sum(10,20);
		s.sum(30,50,100);

	}

}

package study5;

public class MethodTest1 {

	public static void main(String[] args) {
		sample1();
		sample2();
	}
	
	public static void sample1() {
		System.out.println("one");
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void sample2( ) {
		System.out.println("two");
	}

}

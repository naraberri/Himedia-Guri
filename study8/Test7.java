package study8;

public class Test7 {
	
	/*
	 *	생성자 , 다형성(오버로딩)
	 */

	Test7(boolean b) {
		
	}

	Test7(int i) {
		
	}

	Test7(String string) {
		
	}

	public static void main(String[] args) {
			
		Test7 t1 = new Test7(true);
		Test7 t3 = new Test7(1);
		Test7 t4 = new Test7("java");
	}
}

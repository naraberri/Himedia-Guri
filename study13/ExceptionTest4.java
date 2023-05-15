package study13;

public class ExceptionTest4 {

	//메소드 이름 뒤의 throws Exception은 호출한 곳에 강제의무를 건냄
	static void methodTest1() throws Exception{
		System.out.println("test");
	}
	public static void main(String[] args) {
		try {
			methodTest1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package study13;

public class ExceptionTest3 {

	public static void methodTest1() {
		try {
			//new : 일부러 exception 발생 시킬때의 키워드
			throw new Exception("헐~~~~~~~~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		methodTest1();
	}
}

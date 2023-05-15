package study13;

public class ExTest1 {

	static void abc() throws MyException{
		System.out.println("haha");
	}
	
	public static void main(String[] args) {
		try {
			abc();//haha출력
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.toTest());//오류입니다. 출력
		}
	}
}

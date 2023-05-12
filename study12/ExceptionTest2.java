package study12;

public class ExceptionTest2 {

	public static void main(String[] args) {
		//1. zero error
		//2. index number error
		String a1 = "abc";
		String a2 = "123";		
		int a3 = 0;
		int a4 = 0;
		
		try {
			a3 = Integer.parseInt(a1);
			a4 = Integer.parseInt(a2);
		} catch (NumberFormatException e) {
			System.out.println("형변환 오류");//a3 형변환 오류
		} catch (Exception e) {
			System.out.println("오류!!");
		}
		
		System.out.println(a4);//a3가 오류이기때문에 a4가 실행이 안되기 때문에 0 그대로
		System.out.println();
		System.out.println();
		
		String str = "abc";		
		
		try {
			System.out.println(str.charAt(3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("문자열 자리번호 오류");
		} 
		catch (Exception e) {
			System.out.println("오류입니다");
		}
		
		
		
	}
}

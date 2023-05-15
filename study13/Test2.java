package study13;

public class Test2 {

	public static void main(String[] args) {
		//예외처리 : 문법 오류 이외의 사항이 발생하여 프로그램 중단을 방지한다.
		//		  ex) DB연결, I/O연결 시 필수적으로 예외처리를 함
		int a = 100;
		int b = 0;
		int[] c = {10,20,30};
		String d = "abc";
		//Exception -> 모든 error
		//ArithmeticException -> zero error
		//ArrayIndexOutOfBoundsException -> 배열 자리번호 error
		//NumberFormatException -> 형변환 error
		//StringIndexOutOfBoundsException -> 자리번호 error
		
		System.out.println(c[1]);
		try {
			System.out.println(c[0]);
			System.out.println(Integer.parseInt(d));//형변환 error
			System.out.println(c[2]);//위의 형변환 error때문에 출력되지 않음
			//System.out.println(a/b);//zero error
			//System.out.println(c[7]);//배열 자리번호 error			
			//System.out.println(d.charAt(5));//문자열 자리번호 error
		} catch (ArithmeticException e) {
			System.out.println("zero error가 발생했습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 자리번호 error가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("형변환 error가 발생했습니다.");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("문자열 자리번호 error가 발생했습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다");
		}
		System.out.println(d.charAt(0));//정상출력
	}
}

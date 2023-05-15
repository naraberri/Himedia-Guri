package study13;

public class Test1 {
	
	public static void main(String[] args) {
		//정규표현식(핸드폰)
		String phone = "010-2222-1234";
		String pattern = "01(0|1|[6-9])-[0-9]{3,4}-[0-9]{4}";
		if(phone.matches(pattern)) {
			System.out.println("올바른 핸드폰 번호");
		} else {
			System.out.println("핸드폰번호를 다시 확인해주세요.");
		}
		
		//예외처리 : 문법 오류 이외의 사항이 발생하여 프로그램 중단을 방지한다.
		//		  ex) DB연결, I/O연결 시 필수적으로 예외처리를 함
		int a = 100;
		int b = 0;
		int[] c = {10,20,30};
		String d = "abc";
		try {
			System.out.println(a/b);//zero error
			System.out.println(c[7]);//배열 자리번호 error
			System.out.println(Integer.parseInt(d));//형변환 error
			System.out.println(d.charAt(5));//문자열 자리번호 error
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		System.out.println(d.charAt(0));//정상출력
		
		
	}
	
	
}

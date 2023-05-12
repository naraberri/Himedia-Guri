package study12;

public class MatchesTest2 {

	public static void main(String[] args) {
		//ex1
		String birthday = "1980-02-22";
		String pattern = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		if(birthday.matches(pattern)) {
			System.out.println("올바른 날짜");
		} else {
			System.out.println("올바른 날짜 아님");
		}
		System.out.println();
		
		//ex2
		String str = "공지사항 게시판 이미지";
		if(str.matches(".*게시판.*")) {
			System.out.println("문자열 있음!");
		} else {
			System.out.println("문자열 없음!");
		}
		System.out.println();
		
		//ex3
		String txt1 = "123";
		if(txt1.matches(".*[0-9].*")) {
			System.out.println("숫자 있음!");
		} else {
			System.out.println("숫자 없음!");
		}
		System.out.println();
		
		//ex4
		String phone = "010-222-1234";
		pattern = "01(0|1[6-9])-[0-9]{3,4}-[0-9]{4}";
		if(phone.matches(pattern)) {
			System.out.println("올바른 핸드폰 번호");
		} else {
			System.out.println("핸드폰번호를 다시 확인해주세요");
		}
		System.out.println();
		
		//ex5
		String name = "홍길동";
		pattern = "[가-힣]+";
		boolean result = name.matches(pattern);
		System.out.println("이름체크: "+result);
		System.out.println();
		
		//ex6
		String email1 = "a_-@naver.com";
		String email2 = "abc@korea.co.kr";
		String email3 = "abc@korea";
		pattern = "^[a-zA-Z]+[a-zA-Z0-9\\_.-]*@[a-zA-Z0-9]+\\.[a-zA-Z]+$";
		//pattern ="^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
		
		System.out.println(email1.matches(pattern));
		System.out.println(email2.matches(pattern));
		System.out.println(email3.matches(pattern));
	}
}

package study12;

public class MatchesTest3 {

	public static void main(String[] args) {
		// 회원아이디체크(영문,숫자,특수문자(_,-,$)를 포함한 6~12자)
		String pattern = "";
		String userid = "test11";
		pattern = "^[a-zA-Z]{1}[a-zA-Z0-9_-]{5,11}$";
		System.out.println("아이디 : "+userid.matches(pattern));
		
		//회원명체크(한글 또는 영문으로 2자~50자)
		String name = "한글명";
		pattern = "^[a-zA-Z가-힣]{2,50}$";
		System.out.println("회원명 : "+name.matches(pattern));
		
		//학점체크(A~D,F,+,-)
		String hakjum = "A+";
		pattern = "(A|B|C|D|F){1}(\\+|-)?";
		System.out.println("학점 : "+hakjum.matches(pattern));
		
		//공백여부체크		
		String content = " ";
		pattern = "^\\S|\\s";
		System.out.println("공백여부 : "+content.matches(pattern));
		System.out.println(content);
		
		//이메일 체크
		String email = "a_-@naver.com";		
		pattern = "^[a-zA-Z]+[a-zA-Z0-9\\_.-]*@[a-zA-Z0-9]+\\.[a-zA-Z]+$";		
		System.out.println(email.matches(pattern));
		
		
	}
}

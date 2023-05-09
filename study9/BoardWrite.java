package study9;

public class BoardWrite {

	public static void main(String[] args) {
		BoardVO bvo = new BoardVO();
		
		bvo.setTitle(" 안녕하세요 ");
		bvo.setPass("123 456");
		bvo.setName(" 홍길동 ");
		bvo.setContent(" 배고파요 ");
		bvo.setEmail("a.com");
		
		System.out.println("제목 : "+bvo.getTitle());
		System.out.println("암호 : "+bvo.getPass());
		System.out.println("이름 : "+bvo.getName());
		System.out.println("콘텐츠 : "+bvo.getContent());
		System.out.println("이메일 : "+bvo.getEmail());
		
	}
}

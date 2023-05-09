package study9;

public class MemberWrite {

	public static void main(String[] args) {
		MemberVO mvo = new MemberVO();
		
		mvo.setUserid(" a b c d e f g ");
		mvo.setPass(" 12 34 56 78 ");
		mvo.setName(" 홍 길 동 ");
		mvo.setGender(" F ");
		mvo.setBirthday(" 19 90 - 05 - 16 ");
		
		System.out.println("아이디 : "+mvo.getUserid());
		System.out.println("암호 : "+mvo.getPass());
		System.out.println("이름 : "+mvo.getName());
		System.out.println("성별 : "+mvo.getGender());
		System.out.println("생년월일 : "+mvo.getBirthday());
	}
}

package study13;

public class LstNameChkTest {

	public static void main(String[] args) {
		String str = "이";
		LstNmChk lstNm = new LstNmChk();
		try {
			lstNm.checkLstNm(str);
			System.out.println(str+"은/는 올바른 성입니다.");
		} catch (InvalidNmException e) {
			System.out.println(e.toString());
		}
	}
}

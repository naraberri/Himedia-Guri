package study12;

public class MatchesTest1 {

	public static void main(String[] args) {
		//ex1
		String title = "a";
		String pattern = ".+";
		System.out.println(title.matches(pattern));
		System.out.println();
		//ex2
		String color1 = "red";
		String color2 = "ared";
		String color3 = "redabc";
		String color4 = "readabc";
		pattern = "^red.*";
		System.out.println(color1.matches(pattern)); //true
		System.out.println(color2.matches(pattern)); //false
		System.out.println(color3.matches(pattern)); //true
		System.out.println(color4.matches(pattern)); //false
		System.out.println();
		//ex3
		String color5 = "yellow";
		String color6 = "rellow";
		String color7 = "bellow";
		String color8 = "cellow";
		pattern = "^(r|y|b).*";//r or y or b로 시작해야함
		System.out.println(color5.matches(pattern)); //true
		System.out.println(color6.matches(pattern)); //true
		System.out.println(color7.matches(pattern)); //true
		System.out.println(color8.matches(pattern)); //false
		System.out.println();
		//ex4
		String gender = "M";
		pattern = "^(M|F)";
		System.out.println(gender.matches(pattern)); //true
		System.out.println();
		//ex5(숫자만)
		String eng = "100";
		pattern = "^[0-9]+$";
		//숫자로 시작하고 1개이상 있어야하고 숫자로 끝나야함
		System.out.println(eng.matches(pattern)); //true
		System.out.println();
		//ex6(영문만)
		String str = "aAbB";	
		pattern = "^[a-zA-Z]+$";
		//영어(대소문자)로 시작하고 1개이상 있어야하고 영어로 끝나야함
		System.out.println(str.matches(pattern)); //true
		System.out.println();
		//ex7(한글만)
		String kor = "ㄱ";	
		pattern = "^[ㄱ-ㅎ가-힣]+$";
		//한글로 시작하고 1개이상 있어야하고 한글로 끝나야함
		System.out.println(kor.matches(pattern)); //true
		System.out.println();
		
	}
}

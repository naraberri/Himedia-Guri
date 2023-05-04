package study4;

public class StringTest4 {

	public static void main(String[] args) {
		//	length()
		String str = " javascript ";
		System.out.println(str.length());
		
		//	replace(기존값,바꿀값)
		System.out.println(str.replace("java","oracle"));
		System.out.println(str.replace(" ",""));
		
		//	trim() : 앞뒤 공백 제거
		
		str = str.trim();
		System.out.println(str);
		
		//	substring(시작번호,끝번호) : 범위설정
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4));
		System.out.println(str.substring(1));
		
		System.out.println(str.charAt(4));
		
		//	indexOf -> search
		System.out.println(str.indexOf("script"));
		System.out.println(str.indexOf("oracle"));
		
		//	contains
		System.out.println(str.contains("script"));
		System.out.println(str.contains("oracle"));
		
		//	startsWith(), endsWith()
		System.out.println(str.startsWith("java"));
		System.out.println(str.endsWith("oracle"));
		
		//	split()
		String[] prgms = str.split("c");
		System.out.println(prgms[0]);
		System.out.println(prgms[1]);
		
		// toUpperCase(), toLowerCase()
		System.out.println("Linux".toUpperCase());
		System.out.println("Linux".toLowerCase());
		
		// equals()
		System.out.println(str.equals("java"));
		
		
	}

}

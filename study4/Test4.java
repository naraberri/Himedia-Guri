package study4;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("-----------풀어보기1-----------");
		String subject = " Html,mysql,java ";
		// subject를 기본출력한다
		System.out.println(subject);
		//subject에서 mysql을 oracle로 바꾸고 출력한다
		System.out.println(subject.replace("mysql","oracle"));
		//subject에서 문자열길이를 출력한다
		System.out.println(subject.length());
		//subject에서 앞뒤 공백을 제거하고 subject2 변수를 만든다
		String subject2 = subject.trim();
		System.out.println(subject2);
		//java라는 단어만 출력한다
		int a1 = subject2.indexOf("java");
		System.out.println(subject2.substring(a1,a1+4));
		//첫번째 ,를 찾아 자리번호를 출력한다
		System.out.println(subject2.indexOf(","));
		//첫번째 쉼표 다음의 글자 1개를 출력한다
		int a2 = subject2.indexOf(",");
		System.out.println(subject2.substring(a2+1));
		//javascript라는 단어가 존재하는지 결과를 출력한다
		boolean a3 = subject2.equals("javascript");
		if(a3==true) {
			System.out.println("존재함");
		}else {
			System.out.println("존재안함");
		}
		//subject2를 쉼표로 분리하여 두번째 위치의 문자열을 출력한다
		//System.out.println(subject.split(",")[1]);
		String[] str = subject.split(",");
		System.out.println(str[1]);
		
		System.out.println("-----------풀어보기2-----------");
		
		String title = "자바프로그래밍 입문";
		String content = "자바를 이용하여 기초부터 중급까지 완성한다.";
		
		int c1 = title.indexOf("자바");
		int c2 = content.indexOf("자바");
		
		if(c1>-1 && c2>-1) {
			System.out.println("자바라는 단어가 모두 포함되었습니다.");
		}else if((c1>-1 && c2<0) && (c1<0 && c2>-1)) {
			System.out.println("자바라는 단어가 한쪽만 포함 되었습니다.");
		}else {
			System.out.println("자바라는 단어가 모두 포함되지 않았습니다.");
		}
		
		System.out.println("-----------풀어보기3-----------");
		
		String jumsu = "eng:70,kor:90,math:88";
		
		String[] c3 = jumsu.split(",");
		for(int i=0;i<c3.length;i++) {
			System.out.println(c3[i]);
		}
		
		System.out.println("-----------풀어보기4-----------");
		String[] c4 = jumsu.split(":|,");
		for(int i=0;i<c4.length;i++) {
			if(i%2==1) {
				System.out.print(c4[i]+" ");
			}
		}
		System.out.println();
		System.out.println("-----------풀어보기5-----------");
		
		String birthday = "1990/05/27";
		int c5 = birthday.indexOf("90");
		int c6 = birthday.indexOf("5");
		int c7 = birthday.indexOf("27");
		System.out.println(birthday.substring(c5,c5+2)+"년 "+
						   birthday.substring(c6,c6+1)+"월 "+
						   birthday.substring(c7,c7+2)+"일 생");
		
		System.out.println("-----------풀어보기6-----------");
		String str1 = "java";
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<i*2;j++) {
				System.out.print(" ");
			}
			System.out.println(str1.substring(i,i+1));
		}
		
	}

}

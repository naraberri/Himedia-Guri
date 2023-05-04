package study5;

public class StringTest1 {

	public static void main(String[] args) {
		//	풀어보기 3
		String jumsu = "eng:70,kor:90,math:88";
		//	String[] jj = {"eng:70","kor:90","math:88"}
		String[] jj = jumsu.split(",");
		for(int i=0;i<jj.length;i++) {
			System.out.println(jj[i]);
		}
		System.out.println("--------------------------------");
		
		//	풀어보기 4
		for(int i=0;i<jj.length;i++) {
			System.out.print(jj[i].split(":")[1]+" ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		//	풀어보기 5
		String birthday = "1990/05/27";
		String[] bb = birthday.split("/");
		
		String yy = bb[0].substring(2,4);
		//String mm = bb[1].substring(1,2);
		String mm = bb[1].charAt(1)+"";//	""로 인해  char타입을 String으로 변환
		String dd = bb[2];	
		
		System.out.println(yy+"년 "+mm+"월 "+dd+"일 생");
		System.out.println("--------------------------------");
		
		//	풀어보기 6
		String str = "java";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<i*2;j++) {
				System.out.print(" ");
			}
			System.out.println(str.substring(i,i+1));
		}
		
	}

}

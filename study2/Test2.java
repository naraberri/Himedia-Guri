package study2;

public class Test2 {

	public static void main(String[] args) {
		//byte short int long
		byte a = 127;	//-128 ~ 127
		short b = 32767;  //-32,768 ~ 32,767
		int c = 2147483647;	//-2,147,483,648 ~ 2,147,483,647
		long d = 9223372036854775807L;
		
		float f1 = 3.144444444444444444444f;
		double g1 = 3.1444444444444444444444;
		
		System.out.println(f1);
		System.out.println(g1);
		
		char c1 = 'a';
		c1++;
		c1++;
		System.out.println("char :"+c1);
		//char c2 = 'ab'; 오류
		//char c3 = "a"; 오류
		char c4 = '가';
		c4++;
		c4++;
		c4++;
		c4++;
		c4++;
		System.out.println("char :"+c4);
		String s1 = "a";
		System.out.println("String :"+s1);
		
		char c3 ='a';	//97
		char c5 = 98;	//b
		System.out.println("c5 : "+c5);
		
	}

}

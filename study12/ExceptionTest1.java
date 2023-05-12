package study12;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//ex1
		int a = 0;
		int b = 20;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("잘못된연산");
		}
		System.out.println();
		
		int c = 10;
		int d = 0;
		try {
			System.out.println(c/d);
		} catch (Exception e) {
			System.out.println("잘못된연산");
		}
		
		//ex2
		String[] array1 = {"11","22"};
		try {
			System.out.println(array1[1]);
		} catch (Exception e) {
			System.out.println("없는 배열입니다");
		}
		System.out.println();
		
		//ex3
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);//익셉션 에러
			System.out.println(4);//출력안됨 > 위에서 에러로 인해 catch로 넘어감
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
		System.out.println();
		
		//ex4
		int n1 = 10;
		int n2 = 0;
		
		try {
			int result = n1/n2;
		} catch (ArithmeticException e) {
			System.out.println("zero error");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println();
		
		//ex5
		String[]pgName = {"JAVA","PHP","ASP"};
		int i = 0;
		
		while(i<5) {
			try {
				if(i==4)System.out.println(i/0);
				else System.out.println(pgName[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array exception");
			} catch (Exception e) {
				System.out.println("zero error");
			} finally {
				System.out.println("finally");
			}
			i++;
		}
		
		//exam1
		String str = "abc";
		int j = 0;
		
		while(j<5) {
			try {
				if(j==4)System.out.println(j/0);
				else System.out.println(str.charAt(j));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("String exception");
			} 
			catch (Exception e) {
				System.out.println("없는 글자입니다");
			} finally {
				System.out.println("finally");
			}
			j++;
		}
		
		
		
	}
}

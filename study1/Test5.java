package study1;

public class Test5 {
	public static void main(String[] args) {
		int a= 150;
		int b = 7;
		System.out.println(a+"+"+b+"= "+(a+b));
		System.out.println(a+"-"+b+"= "+(a-b));
		System.out.println(a+"*"+b+"= "+(a*b));
		System.out.println(a+"/"+b+"= "+(a/b));
		System.out.println(a+"을 "+b+"로 나눈 나머지값은 "+(a%b));
		
		int eng1 = 90;
		int kor = 80;
		System.out.println(eng1+kor);
		System.out.println((eng1+kor)/2);
		
		String fruit = "사과";
		int price = 500;
		System.out.println(fruit+"의 가격은 "+price+"원 입니다.");
		System.out.println("-----------------");
		
		int eng = 90;
		int math = 100;
		System.out.println("영어("+eng+") 수학("+math+") 평균("+(eng+math)/2+")");
		System.out.println("-----------------");
	}
}

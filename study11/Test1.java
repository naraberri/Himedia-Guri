package study11;

interface Test2 {
	public int hap();
}

class Test3 implements Test2{
	//	멤버변수,인스턴스(객체)변수
	private String name;
	private int eng;
	private int kor;
	//	멤버변수, 클래스변수(전역변수)
	static String title;
	
	@Override
	public int hap() {	//	다형성 > 오버라이딩
		
		return eng+kor;
	}
	
public int hap(int a, int b) {	//	다형성 > 오버로딩
		
		return eng+kor;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}
	
}

public class Test1 extends Test3{

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();	//	인스턴스(객체)처리
		test1.setName("홍길동");
		test1.setEng(60);
		test1.setKor(100);
		
		System.out.println(test1.getName());
		System.out.println("합계: "+test1.hap()+" 평균: "+(test1.hap()/2));
		
	}
}

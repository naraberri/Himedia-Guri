package study6;

class MySubject1 {
	//	클래스변수(전역변수)
	static String title;	//	static : 공유메모리영역
	
	//	인스턴스변수(객체변수)
	int price = 0;			//	각자 고유의 메모리 공간을 차지
}

public class MySchool1 {
	
	public static void main(String[] args) {
		
		MySubject1 st1 = new MySubject1();
		MySubject1 st2 = new MySubject1();
		
		st1.title = "java";
		st2.title = "oracle";
		
		st1.price = 100;
		st2.price = 200;
		
		System.out.println("st1: "+st1.title);	//java
		System.out.println("st2: "+st2.title);	//oracle
		
		st1 = st2;	//위치 주소가 넘어감
		
		System.out.println("st1: "+st1.title);	//oracle
		System.out.println("st2: "+st2.title);	//oracle
		
		System.out.println("st1: "+st1.price);	//oracle
		System.out.println("st2: "+st2.price);	//oracle
	}
}
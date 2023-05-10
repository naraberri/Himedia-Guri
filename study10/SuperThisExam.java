package study10;

class Program1{
	public void pgName() {
		System.out.println("JAVA");
	}
}

class Program2 extends Program1{	//	상속
	public void pgName() {	//	오버라이딩
		System.out.println("JSP");
	}
	
	public void programAll() {
		super.pgName();	//	부모클래스의 메소드
		//this.pgName();
	}
}

public class SuperThisExam {

	public static void main(String[] args) {
		Program1 a = new Program1();
		Program2 b = new Program2();
		
		a.pgName();
		b.pgName();
		b.programAll();
	}
}

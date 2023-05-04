package study6;

public class MyBook1 {
	public static void main(String[] args) {
		
		StudentInfo st = new StudentInfo();
		
		System.out.println("- Student Info -");	//인스턴스 작업
		st.eng = 90;
		st.kor = 100;
		st.name = "홍길동";
		System.out.println("영어점수 : "+st.eng);
		System.out.println("국어점수 : "+st.kor);
		System.out.println("학생이름 : "+st.name);
	}
	
}
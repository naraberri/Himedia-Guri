package study9;
//풀어보기2
public class StudentInfo extends StudentVO {
	
	public int sum(int eng,int kor) {
		int result = eng+kor;
		return result;
	}
	
	public int avg(int result) {
		int avg = result/2;
		return avg;
	}
	
	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		
		s.setName("김철수");
		s.setYear(1);
		s.setEng(90);
		s.setKor(80);
		
		System.out.println(s.getName());
		System.out.println(s.getYear());
		System.out.println(s.sum(s.getEng(), s.getKor()));
		System.out.println(s.avg(s.sum(s.getEng(), s.getKor())));
		
	}
}

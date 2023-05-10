package study10;
//풀어보기2
public class StudentImpl extends StudntService {

	private String name;
	private int eng;
	private int kor;
	
	
	public int sum() {
		int result = getEng()+getKor();
		return result;
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

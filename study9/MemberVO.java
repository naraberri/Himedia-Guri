package study9;

/*
 * 아이디 / 암호 / 이름 / 성별 / 생년월일
 * userid / pass / name / gender / birthday
 * uderid   ->6~12 아닌경우 -> 아이디 입력 오류
 * pass	    ->4~20 아닌경우 -> 암호 입력 오류
 * gender   ->M/F  아닌경우 -> 성별 입력 오류
 * birthday -> 2020-12-25 10자리가 아닌경우 ->날짜입력오류
 */
public class MemberVO {
	private String userid;
	private String pass;
	private String name;
	private String gender;
	private String birthday;
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		userid = userid.replace(" ", "");
		if(userid.length()<6 || userid.length()>12) {
			userid = "아이디 오류입니다";
		}
		
		this.userid = userid;
		
		
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		pass = pass.replace(" ", "");
		if(pass.length()<8 || pass.length()>20) {
			pass = "비밀번호 오류입니다";
		}
		
		this.pass = pass;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		name = name.replace(" ", "");
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		gender = gender.trim();
		if(!gender.equals("M") && !gender.equals("F")) {
			gender = "성별 오류입니다";
		}
		
		this.gender = gender;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		birthday = birthday.replace(" ", "");
		if(birthday.length() != 10) {
			birthday = "생년월일 오류입니다";
		}
		
		this.birthday = birthday;
			
		
	}
	
}

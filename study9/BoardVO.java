package study9;
/*
 * 일반게시판 : 제목 / 암호 / 이름 / 내용 / 이메일
 * 
 */

public class BoardVO {
	
	private String title;
	private String pass;
	private String name;
	private String content;
	private String email;
	
	/* GET/SET
	 * 
	 * tltle/name/content 앞뒤공백제거
	 * pass는 모든 공백제거
	 * email은 @의 존재여부 -> 존재하지 않으면 공백으로 처리
	 */
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title.trim();
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass.replace(" ", "");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name.trim();
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content.trim();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.indexOf("@") == -1) {
			email = " ";
		}
		this.email = email;
		
		
	}
	
}

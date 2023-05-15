package study13;

public class LstNmChk {
	public static final String[] lstNmArr = {"김","이","박","조","최","송","허","왕","양","나","차"};
	
	void checkLstNm(String lastName) throws InvalidNmException {
		if(!IsLstNm(lastName)) {	//false가 왔을 때 예외처리함
			throw new InvalidNmException();
		}
	}

	private boolean IsLstNm(String str) {
		boolean tf = false;
		for(int i=0;i<lstNmArr.length;i++) {
			if(lstNmArr[i].equals(str)) {
				tf = true;
			}
		}
		return tf;
	}
}

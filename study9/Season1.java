package study9;

public class Season1 {
	String name;
	int firstMonth;
	int lasMonth;
	int avgTemp;
	
	public void spring() {
		name = "봄";
		firstMonth = 3;
		lasMonth = 5;
		avgTemp = 20;
	}
	
	public void summer() {
		name = "여름";
		firstMonth = 6;
		lasMonth = 8;
		avgTemp = 30;
	}
	
	public void seasionPrint() {
		System.out.println("계절명:"+name);
		System.out.println("계절기간:"+firstMonth+"~"+lasMonth);
		System.out.println("평균온도:"+avgTemp);
	}

}

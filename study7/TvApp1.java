package study7;

class TvInfo {
	String model;
	String color;
	int size;
	int price;
}

public class TvApp1 {
	
	public static void main(String[] args) {
		TvInfo tif1 = new TvInfo();
		TvInfo tif2 = new TvInfo();
		
		tif1.model = "M01TV";
		tif2.model = "M02TV";
		
		tif1.color = "red";
		tif2.color = "blue";
		
		tif1.size = 50;
		tif2.size = 55;
		
		tif1.price = 150;
		tif2.price = 200;
		
		System.out.println
			("모델명 : "+tif1.model+" , 색상 : "+tif1.color+
			 "  , 크기 : "+tif1.size+"인치, 가격 : "+tif1.price+"만원");
		System.out.println
		("모델명 : "+tif2.model+" , 색상 : "+tif2.color+
		 " , 크기 : "+tif2.size+"인치, 가격 : "+tif2.price+"만원");
	}
}

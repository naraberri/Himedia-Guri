package study9;
//	접근지정자 : public > protected > (생략) > private

class AppleInfo{
	//멤버변수,인스턴스변수
	String name = "사과";
	int price = 5000;
	void discount() {
		price = price -(price/10);
	}
}

class CherryInfo{
	//멤버변수,클래스변수
	static String name = "체리";
	static int price = 5000;
	static void discount() {
		price = price -(price/10);
	}
}

public class MyFruit extends AppleInfo {

	public static void main(String[] args) {
		
		//System.out.println(CherryInfo.price);
		//discount();
		//System.out.println(CherryInfo.price);
		
		MyFruit myFruit = new MyFruit();
		System.out.println(myFruit.name);
		System.out.println(myFruit.price);
		myFruit.discount();
		System.out.println(myFruit.price);
	}
}

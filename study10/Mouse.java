package study10;
//풀어보기3
import study9.Product;

public class Mouse extends Product {
	
	public int discount() {
		int result = getPrice() - (getPrice()/5);
		return result;
	}

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		System.out.println(mouse.getName());
		System.out.println(mouse.getPrice());
		System.out.println(mouse.getMaker());
		
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		
		m1.setName("파란마우스");
		m2.setName("검정마우스");
		m1.setPrice(5000);
		m2.setPrice(6000);
		m1.setMaker("미국");
		m2.setMaker("미국");
		
		System.out.println(m1.getName()+","+m1.getPrice());
		System.out.println("할인가격 : "+m1.discount());
	}

}

package study9;
//풀어보기3
public class Mouse {
	
	public static void main(String[] args) {
		Product m1 = new Product();
		Product m2 = new Product();
		
		m1.setName("파란마우스");
		m2.setName("검정마우스");
		m1.setPrice(5000);
		m2.setPrice(6000);
		m1.setMaker("미국");
		m2.setMaker("미국");
		
		System.out.println("생산품명: "+m1.getName());
		System.out.println("생산품명: "+m2.getName());
		System.out.println("가격: "+m1.getPrice());
		System.out.println("가격: "+m2.getPrice());
		System.out.println("생산지: "+m1.getMaker());
		System.out.println("생산지: "+m2.getMaker());
		
	}
}

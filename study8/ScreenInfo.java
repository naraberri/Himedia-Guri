package study8;
//	풀어보기2
public class ScreenInfo {
	String movieTitle ="";	// 인스턴스변수
	int ticketPrice = 10000;
	
	public ScreenInfo(String movieTitle) {	//	매개변수
		//	현객체.인스턴스 변수 = 매개변수
		this.movieTitle = movieTitle;
	}

	public ScreenInfo(String movieTitle, int ticketPrice) {
		this.movieTitle = movieTitle;
		this.ticketPrice = ticketPrice;
	}

	public static void main(String[] args) {
		ScreenInfo info1 = new ScreenInfo("미이라");
		ScreenInfo info2 = new ScreenInfo("아마존",15000);
		System.out.println("screen 1의 영화제목은 "+info1.movieTitle);
		System.out.println("screen 2의 영화제목은 "+info2.movieTitle);
		System.out.println("screen 1의 가격은 "+info1.ticketPrice);
		System.out.println("screen 2의 가격은 "+info2.ticketPrice);
		
		
	}
}

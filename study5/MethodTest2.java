package study5;

public class MethodTest2 {

	public static void main(String[] args) {
		System.out.println("=중국집 메뉴=");
		chinaMenu();
		System.out.println("=분식집 메뉴=");
		bunsikMenu();
		System.out.println();
		loop10();
		System.out.println();
		loop20();

	}
	
	public static void chinaMenu() {
		System.out.println("1.짜장면 - 4000원");
		System.out.println("2.짬뽕 - 5000원");
	}
	
	public static void bunsikMenu() {
		System.out.println("1.떡라면 - 3500원");
		System.out.println("1.떡볶이 - 4000원");
	}
	
	public static void loop10() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void loop20() {
		for(int i=1;i<=20;i++) {
			System.out.print(i+" ");
		}
	}

}

package study7;

public class Car1 {
	static int speed;	//속도
	static String carName;	//차이름
	public static void speedUp() {
		speed++;
	}
	public static void speedDown() {
		speed--;
		if(speed<0) {
			stop();
		}
	}
	
	public static void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		
		Car1 car1 = new Car1();
		
		car1.carName = "소나타";
		car1.speed = 100;
		car1.speedUp();
		car1.speedUp();
		
		System.out.println("차 이름 : "+car1.carName);
		System.out.println("현재속도 : "+car1.speed);
		
		car1.speed = 0;
		
		System.out.println(car1.carName);
		System.out.println(car1.speed);
	}
	
}

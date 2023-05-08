package study8;

public class Car1_Teacher {
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
		carName = "소나타";
		speed = 100;
		speedUp();
		speedUp();
		
		System.out.println("차 이름 : "+carName+"현재속도 : "+speed);		
		stop();		
		System.out.println("차 이름 : "+carName+"현재속도 : "+speed);
		
		carName = "그랜저";
		
		System.out.println("차 이름 : "+carName+"현재속도 : "+speed);

	}

}

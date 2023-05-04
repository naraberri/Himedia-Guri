package study7;

public class Car2 {
	int speed;	//속도
	String carName;	//차이름
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
		if(speed<0) {
			stop();
		}
	}
	
	public void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		car2.carName = "소나타";
		car2.speed = 100;
		
		car2.speedUp();
		car2.speedUp();
		
		System.out.println("차이름 : "+car2.carName);
		System.out.println("현재속도 : "+car2.speed);
		
		while(true) {
			car2.speedDown();
			if(car2.speed==0) break;
		}
		
		System.out.println("차이름 : "+car2.carName);
		System.out.println("현재속도 : "+car2.speed);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Car2 car3 = new Car2();
		
		car3.carName = "그랜저";
		car3.speed = 100;
		
		car3.speedUp();
		car3.speedUp();
		
		System.out.println("차이름 : "+car3.carName);
		System.out.println("현재속도 : "+car3.speed);
		
		while(true) {
			car3.speedDown();
			if(car3.speed==0) break;
		}
		
		System.out.println("차이름 : "+car3.carName);
		System.out.println("현재속도 : "+car3.speed);

	}

}

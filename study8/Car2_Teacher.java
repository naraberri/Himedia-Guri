package study8;

public class Car2_Teacher {
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
		Car2_Teacher sonata = new Car2_Teacher();
		
		sonata.carName = "소나타";
		sonata.speed = 100;
		
		sonata.speedUp();
		sonata.speedUp();
		
		System.out.println("차이름 : "+sonata.carName);
		System.out.println("현재속도 : "+sonata.speed);
		
		sonata.stop();
		
		System.out.println("차이름 : "+sonata.carName);
		System.out.println("현재속도 : "+sonata.speed);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Car2_Teacher granduer = new Car2_Teacher();
		
		granduer.carName = "그랜저";
		granduer.speed = 100;
		
		granduer.speedUp();
		granduer.speedUp();
		
		System.out.println("차이름 : "+granduer.carName);
		System.out.println("현재속도 : "+granduer.speed);
		
		granduer.stop();
		
		System.out.println("차이름 : "+granduer.carName);
		System.out.println("현재속도 : "+granduer.speed);

	}

}

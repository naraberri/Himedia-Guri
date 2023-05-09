package study9;

class CarInfo{
	String carName;
	String carColor;
	int velocity;
	
}

public class CarColor extends CarInfo {
	
	public CarColor(String color, String name, int speed) {
		carName = name;
		velocity = speed;
		carColor = color;
		
	}
	public static void main(String[] args) {
		CarColor cc = new CarColor("white","sonata",100);
		System.out.println(cc.carName+"."+cc.velocity+"."+cc.carColor);
	}
}

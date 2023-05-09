package study9;

//	접근지정자 : public > protected > (생략)기본값 > private
public class Person1 {
	
	//	멤버변수,인스턴스변수,객체변수
	private int age;			//	int age = 0;
	public String name;	//	String name = null;
	private int height;	// 
	private int weight;
	//	멤버변수,클래스변수
	//static int score;
	
	public int getAge() {
		return height;
	}
	
	public void setAge(int age) {
		if(age < 0 || age>200) {
			height = 0;
		}
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		if(height < 0 || height>300) {
			height = 0;
		}
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		if(weight < 0 || weight>300) {
			weight = 0;
		}
		this.weight = weight;
	}
}

package study9;

class Person2{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}

public class Student2 extends Person2 {
	public void dataSet() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(70);
	}
	
	public static void main(String[] args) {
		Student2 s2 = new Student2();
		s2.dataSet();
		System.out.println("나이 :"+s2.age+", 이름 : "+
							s2.name+", 키 : "+s2.height+
							", 몸무게 : "+s2.getWeight());
	}

}

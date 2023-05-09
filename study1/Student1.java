package study1;

import study9.Person1;

public class Student1 {

	public static void main(String[] args) {
		
		Person1 s1 = new Person1();
		s1.name = "홍길동";
		s1.setAge(30);
		s1.setHeight(170);
		//s1.weight = 70; private 다른클래스에서 접근 불가
		s1.setWeight(70);
	}
}

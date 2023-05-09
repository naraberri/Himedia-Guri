package study9;

import study1.Person10;

public class Student10 extends Person10 {

	public static void main(String[] args) {
		Student10 ss = new Student10();
		
		ss.name = "홍길동";
		ss.height = 170;
		//ss.age = 30;	default라 오류
		//ss.weight = 70;	private라 오류
	}
}
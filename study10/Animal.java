package study10;

abstract class Sound{
	abstract void cry();
}

class Cat extends Sound{
	void cry() {
		System.out.println("야옹야옹!");
	}
}

class Dog extends Sound{
	void cry() {
		System.out.println("멍멍!");
	}
}

public class Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.cry();
		dog.cry();
	}
}

package PracticeOops;

class Animal12 {
	void eat() {
		System.out.println("this is an example for single inheritance....");
		System.out.println("Animal can eat....");
	}
}

class Dog extends Animal12 {
	void sound() {
		System.out.println("Dog barks....");
	}
}

class BabyDog extends Dog {
	void cry() {
		System.out.println("example for multilevel inheritance");
		System.out.println("Baby dog weeps....");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog oDog = new BabyDog();
		oDog.eat();
		oDog.sound();
		oDog.cry();
	}

}

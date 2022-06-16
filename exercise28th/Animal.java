package exercise28th;

class Monkey {
	void jump() {
		System.out.println("Jumping...");
	}

	void bite() {
		System.out.println("Biting...");
	}
}

interface BasicAnimal {
	void eat();

	void sleep();
}

class Human extends Monkey implements BasicAnimal {
	@Override // implements override it is interface
	public void eat() {
		System.out.println("Eating.");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping.");
	}
}

public class Animal {
	public static void main(String[] args) {
		Human Denver = new Human();
		Denver.sleep();
		Denver.eat();
	}
}

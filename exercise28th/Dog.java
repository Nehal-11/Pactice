package exercise28th;

public class Dog {
	String colour = "White";
	String breed = "Pug";

	void show() {
		System.out.println("colour=" + colour);
		System.out.println("breed=" + breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.show();
	}

}

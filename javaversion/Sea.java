package javaversion;

class Fish {
	String action;
	int noOfwings;
}

public class Sea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f1 = new Fish();
		f1.action = "Swim";
		f1.noOfwings = 2;
		System.out.println("the action is: " + f1.action);
		System.out.println("the no.of wings is: " + f1.noOfwings);
	}

}

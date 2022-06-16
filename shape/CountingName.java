package shape;

import java.util.Scanner;

class Character {
	String name;

	Character() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any character: ");
		name = scan.next();
	}

	void countNumber() {
		int count = 0; 
		for (int charIndex = 0; charIndex < name.length(); charIndex++) {
			++count;
		}
		System.out.println(count);
	}
}

public class CountingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character obj = new Character();
		obj.countNumber();
	}

}
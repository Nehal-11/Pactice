package exercise28th;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		System.out.println("Enter num:");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		if (a < 1) {
			System.out.println("small");
		} else if (a > 1000000) {
			System.out.println("large");
		}
		if (a == 0) {
			System.out.println("The entered num is zero");
		} else if (a > 0) {
			System.out.println("The entered num is positive");
		} else if (a < 0) {
			System.out.println("The entered num is negative");
		}
	}

}

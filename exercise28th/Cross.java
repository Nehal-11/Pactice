package exercise28th;

import java.util.Scanner;

public class Cross {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("String of alphabtets");
		System.out.println("Enter the alphabet: ");
		String alphabet = scan.next();
		int n = scan.nextInt();
		switch (alphabet) {
		case "A": {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || i == n / 2 + 1 || j == n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}
			break;
		}
		default:
			System.out.println("hi");
		}
	}

}

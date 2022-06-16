package examples;

import java.util.Scanner;

public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, add = 0, digit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		while (num > 0) {
			digit = num % 10;
			add = add + digit;
			num = num / 10;
		}
		System.out.println("the sum of digits of given numbers is: " + add);
	}

}

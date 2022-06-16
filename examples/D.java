package examples;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator: ");
		String operator = sc.next();
		System.out.println("Enter the input number: ");
		int a, b, sum;
		a = sc.nextInt();
		b = sc.nextInt();
		switch (operator) {
		case "add":
			sum = a + b;
			System.out.println("the addition of given input numbers is:" + sum);
			break;
		case "sub":
			sum = a - b;
			System.out.println("the subtraction of given input numbers is:" + sum);
			break;
		case "multiply":
			sum = a * b;
			System.out.println("the multiplication of given input numbers is:" + sum);
			break;
		case "divide":
			sum = a / b;
			System.out.println("the division of given input numbers is:" + sum);
			break;

		default:
			System.out.println("Enter the valid input!");
		}
	}

}

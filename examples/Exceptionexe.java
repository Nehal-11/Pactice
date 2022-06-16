package examples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionexe {
/*	void display() throws ArrayIndexOutOfBoundsException {
	throw new ArrayIndexOutOfBoundsException("Hiii");
	}*/
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a , b, c;
	/*try {
	a = scan.nextInt();
	b = scan.nextInt();
	c = b/a;
	}
	catch(InputMismatchException e){
		System.out.println(e);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("rest code....");
	//int[]b= new int[5];
	//System.out.println(b[5]);*/
	
	/*try {
		a = scan.nextInt();
		b = scan.nextInt();
		try { 
		 c = b/a;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}catch(InputMismatchException e){
		System.out.println(e);
	}*/
	/*a = scan.nextInt();
	b = scan.nextInt();	
	try {
throw new ArithmeticException("Hello");
	}catch(ArithmeticException e) {
		System.out.println("Hello2");
}*/

	try {
		a = scan.nextInt();
		b = scan.nextInt();
		c = b/a;
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("end");
		}
	
	
	
}
}

package examples;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 350, b = 400, c = 1500, d = 5500;
		if (a >= b && a >= c && a >= d) {
			System.out.println("the largest number is- " + a);
		} 
		else if (b >= c && b >= d) {
			System.out.println("the largest number is- " + b);
		}
		else if (c >= d) {
			System.out.println("the largest number is- " + c);
		}
		else {
			System.out.println("the largest number is- " + d);
		}
	}
}

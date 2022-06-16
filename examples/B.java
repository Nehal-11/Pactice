package examples;

public class B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 70;
		if (a > 0) {
			System.out.println("a is +ve");
			if (a % 2 == 1) {
				System.out.println("a is an odd number");
			} else if (a % 2 == 0) {
				System.out.println("a is an even number");
			}
		}

		else {
			System.out.println("a is -ve");
		}
	}

}

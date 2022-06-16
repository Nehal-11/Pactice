package exercise28th;

class Fan {
	String brand, price, warranty;
	int noOfblades;

	void Display(String brand, String price, String warranty, int noOfblades) {
		System.out.println("brand= " + brand);
		System.out.println("price= " + price);
		System.out.println("warranty= " + warranty);
		System.out.println("noOfblades= " + noOfblades);
	}
}

public class Jt {
	static void Nehal() {
		System.out.println("Hi nehal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nehal();
		Fan f1 = new Fan();
		f1.Display("havels", "1,200", "1 year", 4);

	}
}

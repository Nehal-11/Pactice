package exercise28th;

abstract class Pen {
	abstract void write();

	abstract void refill();
}

class FountainPen extends Pen {
	void write() {
		System.out.println("Write");
	}

	void refill() {
		System.out.println("Refill");
	}

	void changeNib() {
		System.out.println("Changing the nib");
	}
}

class Pen1 {
	public static void main(String[] args) {
		FountainPen fp = new FountainPen();
		fp.write();
		fp.refill();
		fp.changeNib();
	}
}
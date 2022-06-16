package exercise28th;

abstract class Shape {
	int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public double getNumSides() {
		return numSides;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}

class Rectangle extends Shape {
	double height, width;

	public Rectangle(double w, double h) {
		super(4);
		this.height = h;
		this.width = w;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}
}

class RtTriangle extends Shape {
	double height, width;

	public RtTriangle(double w, double h) {
		super(4);
		this.height = h;
		this.width = w;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}
}

public class Trianglearea {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(20, 10);
		RtTriangle tri = new RtTriangle(35, 40);
		System.out.println("Area of rectangle=" + rec.getArea());
		System.out.println("perimeter of rectangle=" + rec.getPerimeter());
		System.out.println("Area of rectangle=" + tri.getArea());
		System.out.println("perimeter of rectangle=" + tri.getPerimeter());

	}
}

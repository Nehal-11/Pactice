package interface12;

interface Multiply {
	void multi();
}

interface Divison {
	void divide();
}

public class Interface0 implements Divison, Multiply {
	int result;
	int number1, number2;

	Interface0(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		result = number1 * number2;
		System.out.println("multiply of two number is: " + result);

	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
result = number1 / number2;
System.out.println("divide of two number is : " +  result);
	}
public static void main(String[] args) {
	Interface0 oInter = new Interface0(40, 30);
	oInter.multi();
	oInter.divide();
}
}

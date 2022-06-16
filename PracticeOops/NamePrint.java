package PracticeOops;

class FirstName {
	void print_firstName() {
		System.out.println("Nehal");
	}
}

class MiddleName extends FirstName {
	void print_middlename() {
		System.out.println("Deepak");
	}
}

class LastName extends MiddleName {
	void print_lastName() {
		System.out.println("Ruparel");
	}
}

public class NamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastName oName = new LastName();
oName.print_firstName();
oName.print_middlename();
oName.print_lastName();
	}

}

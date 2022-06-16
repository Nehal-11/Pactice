package polymorphism;

public class EmployeeExe extends Address {

	String name,position;
	int Id;
	
	void show(int a) {
		
		super.show();
		System.out.println("Hi");
	}
}

package examples;

class Bird {
	String name, colour;
	int age;

	Bird(String name, String colour, int age) {
		System.out.println("name: " + name);
		System.out.println("colour:" + colour);
		System.out.println("age: " + age);
	}
}

class Animal {
	String name, breed;
	int age;

	Animal(String name, String breed, int age) {
		System.out.println("name: " + name);
		System.out.println("breed: " + breed);
		System.out.println("age: " + age);
	}
}

class Mobile {
	String brand, colour;

	Mobile(String brand, String colour) {
		System.out.println("brand: " + brand);
		System.out.println("colour: " + colour);
	}
}

class Vehicle {
	String nameofVehicle, modelNo;
	int noOfWheels;

	Vehicle(String nameofVehicle, String modelNo, int noOfWheels) {
		System.out.println("nameofVehicle: " + nameofVehicle);
		System.out.println("modelNo: " + modelNo);
		System.out.println("noOfWheels: " + noOfWheels);
	}
}

class Fan {
	String brand, speed;
	int noOfwings;

	Fan(String brand, String speed, int noOfwings) {
		System.out.println("brand= " + brand);
		System.out.println("speed= " + speed);
		System.out.println("noOfwings= " + noOfwings);
	}
}

class Stud {
	String studentName, group;
	String gender, dob;
	int rollno;

	Stud() {
		studentName = "Nehal";
		group = "Computer Science";
		gender = "female";
		dob = "01-03-1999";
		rollno = 20012;
		System.out.println("studentName= " + studentName);
		System.out.println("group= " + group);
		System.out.println("gender= " + gender);
		System.out.println("dob= " + dob);
		System.out.println("rollno= " + rollno);
	}
}

class Employee {
	String companyName, teamName, salary, department, dateofJoining;
	int empno;

	Employee() {
		companyName = "ATMECS";
		teamName = "Aspire wave-7";
		salary = "15,000";
		department = "Technical support";
		dateofJoining = "20-03=2021";
		empno = 2;
		System.out.println("companyName= " + companyName);
		System.out.println("teamName= " + teamName);
		System.out.println("salary= " + salary);
		System.out.println("department= " + department);
		System.out.println("dateofJoining= " + dateofJoining);
		System.out.println("empno= " + empno);
	}
}

public class Samples {
	public static void main(String[] args) {
		Bird b1 = new Bird("peacock", "green", 10);
		Animal a1 = new Animal("tom", "retriever", 2);
		Mobile m1 = new Mobile("oneplus", "blue");
		Vehicle veh = new Vehicle("bike", "PY03T3033", 4);
		Fan f1 = new Fan("oriental", "300rpm", 3);
		Stud s1 = new Stud();
		Employee emp1 = new Employee();
	}

}

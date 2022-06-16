package PracticeOops;

class Animal {
	private String name, breed;
	private double feet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getFeet() {
		return feet;
	}

	public void setFeet(double feet) {
		this.feet = feet;
	}
}

public class Encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal oAnimal = new Animal();
		oAnimal.setName("Oreo");
		oAnimal.setBreed("Pug");
		oAnimal.setFeet(5.5);
		System.out.println(oAnimal.getName());
		System.out.println(oAnimal.getBreed());
		System.out.println(oAnimal.getFeet());
	}

}

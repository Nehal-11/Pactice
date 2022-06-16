package examples;

class movie1 {
	String name, actor, actress, director, rating;

	void show(String name, String actor, String actress, String director, String rating) {
		System.out.println("Movie1 name is: " + name);
		System.out.println("Actor name is: " + actor);
		System.out.println("Actress name is: " + actress);
		System.out.println("Director name is: " + director);
		System.out.println("Movie rating is: " + rating);
	}
}

class movie2 {
	String name, actor, actress, director, rating;

	void show(String name, String actor, String actress, String director, String rating) {
		System.out.println("Movie1 name is: " + name);
		System.out.println("Actor name is: " + actor);
		System.out.println("Actress name is: " + actress);
		System.out.println("Director name is: " + director);
		System.out.println("Movie rating is: " + rating);
	}
}

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie1 obj1 = new movie1();
		obj1.show("Jai bhim", "Suriya", "Jennifer", " TJ Gnanavel", "5/5");
		movie2 obj2 = new movie2();
		obj2.show("valimai", "ajith", "kajal", "siva", "3/5");
	}

}

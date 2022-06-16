package examples;

class Animal232
{
	private String name;
	private int age;

	public Animal232() {
		// TODO Auto-generated constructor stub
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

}

public class GetSet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal232 oAnimal = new Animal232();
		oAnimal.setName("dog");
		oAnimal.setAge(4);
		System.out.println(oAnimal.getName());
		System.out.println(oAnimal.getAge());
	}

}

package examples;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "nehal";
		String name1 = "Nehal";
		System.out.println(name.hashCode());
		//name = name.concat("ruparel");
		//System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
StringBuffer name2 = new StringBuffer(name);
System.out.println(name2.hashCode());
name2.append("ruparel");
System.out.println(name2);
System.out.println(name2.hashCode());

	}

}

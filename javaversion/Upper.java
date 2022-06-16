package javaversion;

public class Upper {
	public static void main(String[] args) {
		String str1 = "the quick brown fox jumps over the lazy dog";
		System.out.print(Upper.capitalizeWord(str1));
	}

	public static String capitalizeWord(String str) {
		String words[] = str.split("\\s");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}
}
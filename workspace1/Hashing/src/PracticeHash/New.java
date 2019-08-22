package practiceHash;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface Function
{
	void display();
	
	default void run() {
		System.out.println("========Functional Interface ===========");
	}
	
	 default void run2() {
		System.out.println("========Functional Interface ===========");
	}
	
}

public class New {
	
	void display()
	{
		System.out.println("Testing of Function Interface with Methode Reference");
	}
	
	
	/*
	 * String[] word = str.split(" ");// {my,name,is,java} for (int j = 0; j <
	 * word.length; j++) { String n = word[j];// my StringBuilder s = new
	 * StringBuilder(); char[] str1 = n.toCharArray();// {m,y} for (int i =
	 * n.length() - 1; i >= 0; i--) { char t = str1[i]; System.out.print(t); } }
	 */
	
	static void reverseWord(String str) {
		StringBuilder builder=new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(char c:str.toCharArray()) {
			if(c != ' ') {
				temp.append(c);
			} else {
				builder.append(temp.reverse());
				builder.append(c);
				temp.setLength(0);
			}
		}
		builder.append(temp.reverse());
		System.out.println("builder :"+builder.toString());
	}

	static void reverseString(String str) {
		char[] str1 = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			char temp = str1[i];
			System.out.print(temp);
		}

	}

	public static void main(String[] args) {
		String str = "My name is java";
		System.out.println(str + "\n");
		reverseWord(str);
		System.out.println("\n");
		reverseString(str);
		// ===========================================================================================================

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("\nSum of the array element = " + sum);
		Integer n = integers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("\nProduct of the array element = " + n);
		// ===========================================================================================================

		String[] array = { "Geeks", "for", "Geeks" };
		Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);
		if (String_combine.isPresent()) {
			System.out.println(String_combine.get());

		}
		System.out.println();
		//============================================================================
		New obj = new New();
		Function ref = obj::display;
		ref.run();
		ref.display();
	} 
}

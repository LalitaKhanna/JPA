package PracticeHash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class New {
	static void reverse(String str) {
		String[] word = str.split(" ");
		for(int j=0;j<word.length;j++)
		{
			String n= word[j];
		char[] str1 = n.toCharArray();
		for (int i = n.length() - 1; i >= 0; i--) {
			char temp = str1[i];
			System.out.print(temp);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is java";
		System.out.println(str);
		reverse(str);

	}

}

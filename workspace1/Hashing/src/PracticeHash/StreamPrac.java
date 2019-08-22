package practiceHash;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class StreamPrac {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "efg", "bcd", "gha", "defga", "jk");
		long count = strList.stream().filter(x -> !x.isEmpty()).filter(y -> y.charAt(0) == 'a').count();

		System.out.println(count);
		// List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		List<Integer> evenNum = Arrays.asList(8, 2, 2, 3, 7, 5, 16);
		long count1 = evenNum.parallelStream().filter(x -> x % 2 == 0).count();
		System.out.println(count1);
		List<Integer> sqEven = evenNum.parallelStream().filter(x -> x % 2 == 0).map(y -> y * y).distinct()
				.collect(Collectors.toList());
		evenNum.parallelStream().filter(x -> x % 2 == 0).map(y -> getSquare(y)).distinct()
				.forEach(z -> System.out.println(z));

		String str = "welcome";
		char[] str1 = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			char temp = str1[i];
			System.out.println(temp + "\n");
		}

		List<String> strList1 = Arrays.asList("ae", "efg", "mca", "gha", "kgha", "ajk");
		System.out.println("=========================");
		List<Long> list=strList1.stream().filter(x -> !x.isEmpty()).filter(y -> y.contains("a"))
				.map(z->getAscii(z)).collect(Collectors.toList());
				
				System.out.println(list);
	}

	static long getAscii(String i) {
		// TODO Auto-generated method stub
		//StringBuilder sb = new StringBuilder();
		// String i = "Awelcome";
		char[] letters = i.toCharArray();
		long result = 0;
		for (char ch : letters) {
			result = ((byte) ch);
		System.out.println("--"+result);
		
		}
		return result;
	}

	static int getSquare(int x) {
		return x + x;
	}

}

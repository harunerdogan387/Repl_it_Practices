package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class CountTriples {
	/*
	 * We'll say that a "triple" in a string is a char appearing three times in a
	 * row. Print out the number of triples in the given string. The triples may
	 * overlap.
	 * 
	 * Example: input: abcXXXabc output: 1
	 * 
	 * Example: input: xxxabyyyycd output: 3
	 * 
	 * Example: input: java output: 0
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;
		// WRITE YOUR CODE HERE

		for (int i = 0; i < str.length() - 2; i++) {
			if ((str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)))
					&& (str.substring(i, i + 1).equals(str.substring(i + 2, i + 3)))) {
				count++;
			}

		}

		System.out.println(count);

		System.out.println("======================");
		count=0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 2; i++) {
			if ((ch[i] == ch[i + 1]) && (ch[i] == ch[i + 2])) {
				count++;
			}

		}
		System.out.println(count);

	}
}

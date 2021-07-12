package repl_it;

import java.util.Scanner;

public class PrintFirstandLastNumber {
	public static void main(String[] args) {

		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		int n = word.length();
		System.out.print(word.charAt(0));
		System.out.println(word.charAt(n - 1));
	}
}

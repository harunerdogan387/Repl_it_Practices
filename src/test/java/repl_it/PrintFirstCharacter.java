package repl_it;

import java.util.Scanner;

public class PrintFirstCharacter {
	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();
		// WRITE YOUR CODE HERE
		System.out.println(word.charAt(0));

	}
}

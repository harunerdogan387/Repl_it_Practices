package repl_it;

import java.util.Scanner;

public class GetSandwich {
	/*
	 * A sandwich is two pieces of bread with something in between. Print the string
	 * that is between the first and last appearance of "bread" in the given string,
	 * or return string "nothing" if there are not two pieces of bread.
	 * 
	 * Example: input: breadjambread output: jam
	 * 
	 * Example: input: xxbreadjambreadyy output: jam
	 * 
	 * Example: input: xxbreadapple output: nothing
	 * 
	 * Example: input: breadbutterbread output: butter
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");
		if (first == last || last == -1) {
			System.out.println("nothing");
		} else {
			System.out.println(str.substring(first + 5, last));
		}

	}
}

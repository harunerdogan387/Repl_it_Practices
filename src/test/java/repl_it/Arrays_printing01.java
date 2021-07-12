package repl_it;

import java.util.Scanner;

public class Arrays_printing01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}
		// leave above alone! write your code below

		String arr1[] = new String[5];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i].substring(0, 3);
			System.out.println(arr1[i]);

		}
	}
}

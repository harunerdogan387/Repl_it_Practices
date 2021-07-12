package repl_it;

import java.io.InputStream;
import java.util.Scanner;

public class FindTheLenght {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the text:");
		String text = scan.nextLine();
		int n = text.length();
		System.out.println("Length is: " + n);
	}

}

package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below

		String[] newSentence = sentence.split(" ");
		String sntc[] = new String[newSentence.length];
		int z = 0;
		for (int i = newSentence.length - 1; i >= 0; i--) {
			sntc[z] = newSentence[i];
			System.out.println(sntc[z]);
			z++;
		}

	}
}

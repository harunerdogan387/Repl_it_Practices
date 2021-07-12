package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here

		String[] newSentence = sentence.split(" ");
		for (int i = newSentence.length -1; i >= 0; i--) {
			reversed += ""+newSentence[i]+" ";
		}
		reversed=reversed.substring(0,reversed.length()-1 );
		// End your code here. do not modify below statement
		System.out.println(reversed);

	}
}

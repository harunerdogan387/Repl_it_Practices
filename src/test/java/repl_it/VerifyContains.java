package repl_it;

import java.util.Scanner;

public class VerifyContains {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    boolean R = word.contains(sentence);
	    System.out.println(R);
		
	}
}

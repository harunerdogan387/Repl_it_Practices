package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class Split_Sentence {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //type your code below
	    String[] newSentence = sentence.split(" ");
	    //System.out.println(Arrays.toString(newSentence));
	    for(int i=0; i<newSentence.length; i++) {
	    	System.out.println(newSentence[i]);
	    }
	}
}

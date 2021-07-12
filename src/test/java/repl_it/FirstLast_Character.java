package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLast_Character {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
//	   for(int i=0; i<words.length; i++) {
//		   words [i]= words[i].substring(0,1)+words[i].substring(words[i].length()-1);
//	   System.out.println(words[i]);
//	   }

	   for(int i=0; i<words.length; i++) {
		   words [i]=""+ words[i].charAt(0)+words[i].charAt(words[i].length()-1);
	   System.out.println(words[i]);
	   }
	}
}

package repl_it;

import java.util.Scanner;

/*
 Instructions from your teacher:
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 


Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java 
 */
public class Withoutx_X {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    int Length = word.length();
	    
	    if (word.startsWith("x") || word.startsWith("X")) {
	    	word = word.substring(1);
	   }
	    Length = word.length();
	    if (word.endsWith("x") || word.endsWith("X")) {
	    	word = word.substring(0,Length-1);
	    	System.out.println(word);
	    }
	   else {
		   System.out.println(word);
	   }
	  }
}

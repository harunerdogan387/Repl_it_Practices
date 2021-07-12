package repl_it;

import java.util.Scanner;

/*
 Instructions from your teacher:
Return the number of times that the string "java" appears anywhere in the given string word.



Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3 
 */
public class Count_Java {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String word = scan.nextLine();
	    
	    int Length = word.length();
	    int i, count=0;
	    
	    for (i=0; i<=Length-4;i++) {
	    	if (word.substring(i,i+4).equals("java")) 
	    		count++;
	    }
	    	
	    System.out.println(count);
	    
	}
}

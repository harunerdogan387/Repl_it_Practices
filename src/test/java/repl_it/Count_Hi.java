package repl_it;

import java.util.Scanner;
/*
 Instructions from your teacher:
Print out the number of times that the string "hi" appears anywhere in the given string.

Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 
 */
public class Count_Hi {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    int Length= str.length();
	    int i, count =0;
	    
	    for (i=0; i<=Length-2;i++) {
	    	if (str.substring(i,i+2).equals("hi")) 
	    		count++;
	    }
	    	
	    System.out.println(count);
	}
}


package repl_it;

import java.util.Scanner;

/*
 Instructions from your teacher:
 Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 

Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false 
 */
public class Has_aJava {
	public static void main(String[] args) {
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    //String word1 = word.substring(0, 4);
	    
	   // String word2 = word.substring(1, 5);
	    int L = word.length();
	    if (L<4) {
	    	System.out.println(exists);
	    }
	    else if(L>=4 && (exists = (word.substring(0,4).equals("java") || word.substring(1,5).equals("java")))) {
	    	
	     	System.out.println(exists);
	  	}
	    else {
	    	System.out.println(exists);
	    }
		
	}

}

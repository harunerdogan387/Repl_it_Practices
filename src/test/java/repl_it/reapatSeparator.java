package repl_it;

import java.util.Scanner;

public class reapatSeparator {
	/*
	Given two strings, word and a separator sep, 
	return a big string made of count occurrences of the word,
	separated by the separator string.
			Example:
			input: Word
			input: X
			input: 3
			output: WordXWordXWord
	*/
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	  
	    int L = separator.length();
	     word = word.concat(separator);
	    String a="";
	    
	    for (int i=1;i<=count; i++){
	    	a+=word;
	    }
	    
	    int aL = a.length();
	    a = a.substring(0, aL-L);
	    System.out.println(a);
	}
}

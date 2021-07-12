package repl_it;

import java.util.Scanner;

/*
 Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars. 

Example:
input: A
input: Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:
input: a
input: f
output: abcdef

Example:
input: a
input: d
output: abcd

Example:
input: B
input: O
output: BCDEFGHIJKLMNO 
 */
public class PrintLetters {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    System.out.println(start);
	    System.out.println(end);
	    
	    do{
		   System.out.print(start);
	    	start++;
		}
	    	while (start<=end);
}
}

package repl_it;

import java.util.Scanner;

public class Factorial {
/*
 In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console. 

Example:
input: 5
output: 120 
 */
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    long z=1;
	   for (int i=n; i>0; i--) {
	    	z=z*i;
	    }
	    System.out.println(z);
	    System.out.println((long)16*15*14*13*12*11*10*9*8*7*6*5*4*3*2*1);
	  }
}

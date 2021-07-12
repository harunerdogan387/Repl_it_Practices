package repl_it;

import java.util.Scanner;

public class MiddelThree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE

    int i, n = word.length();
    
    if (n%2==1 && n>=5) { 
		i = n/2;
		System.out.print(word.charAt(i-1));
		System.out.print(word.charAt(i));
		System.out.print(word.charAt(i+1));
	}
	else  {
		System.out.println("invalid");
		}
    
}
}

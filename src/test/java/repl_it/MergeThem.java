package repl_it;

import java.util.Scanner;

public class MergeThem {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
    int n1 =word1.length();
    int n2 =word2.length();

    if (n1 == 3 && n2 == 3) {
    	System.out.print(word1.charAt(0));
    	System.out.print(word2.charAt(0));
    	System.out.print(word1.charAt(1));
    	System.out.print(word2.charAt(1));
    	System.out.print(word1.charAt(2));
    	System.out.print(word2.charAt(2));
    }
    else {
    	System.out.println("cannot merge");
    }
    
}
}

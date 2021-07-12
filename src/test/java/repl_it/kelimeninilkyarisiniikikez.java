package repl_it;

import java.util.Scanner;

public class kelimeninilkyarisiniikikez {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE

	 int i, n = word.length();
	 String word1="";
	
	// if (n%2==0) {
				for (i=0; i < n/2; i++) {
				word1+=word.charAt(i);
				}     
		        System.out.println(word1+word1);  
	  // }
		//else  {
		//	System.out.println("the number of letters is not even");
		//	}

}
}

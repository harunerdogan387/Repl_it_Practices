package repl_it;

import java.util.Scanner;

public class Reverse_it {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int n = word.length();
    if (n<5) {
    	System.out.println("Too short!");
    }
    else if (n>5) {
    	System.out.println("Too long!");
    }
    else {
    	String drow ="";
    for(int i = n-1 ; i >= 0; i--) {
        drow += word.charAt(i);
    }
    System.out.println(drow);
    }

    

}
}

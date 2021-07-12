package repl_it;

import java.util.Scanner;

public class alejandro1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("\nPlease input the text: ...");
        String a = s.nextLine();
        a=a.toLowerCase();
        //your code here
	  /*
	    if (a.contains("alejandro")){
            System.out.println("read this mail ");
        } else {
            System.out.println("dont read");
        }
	    */

        //System.out.println((a.contains("alejandro"))? "read this mail":"dont read");


        System.out.println((a.contains("project") && a.contains("alejandro")) ? "read this mail" :
                "dont read");
    }
}

package repl_it;

import java.util.Scanner;

public class String_No_End {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    String txt = s.next();
    //your code here
  // System.out.println(txt.substring(0,(int)txt.length()-1));
	
    
   /* int n = txt.length();
    txt=txt.substring(0,n-1);
    System.out.println(txt);
   */
    
    
    
    int m =txt.lastIndexOf("");
    //System.out.println(m);
    System.out.println(txt.substring(0,m-1));
    
	}

	
}


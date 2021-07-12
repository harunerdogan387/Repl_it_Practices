package repl_it;

import java.util.Scanner;

public class Middle_one {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    int i, n = word.length();
   
   
    if (n%2==1 && n>=3) { 
		i = n/2;
		System.out.println(word.charAt(i));
	}
	else if (n==1){
		System.out.println(word+word+word);
	}

	else if (n%2==0 && n>=4) {
			i = n/2;
			System.out.print(word.charAt(i-1));
			System.out.print(word.charAt(i));
	}
	else  {
		System.out.println(word+word);
		}
    
    
    /*
    
    if (n%2==1) { 
    		if (n>=3) {
    			i = n/2;
    		System.out.println(word.charAt(i));
    		}
    		else{
    		System.out.println(word+word+word);
    	   }
    }		
    else {		
    	if (n>=4) {
    			i = n/2;
    			System.out.print(word.charAt(i-1));
    			System.out.print(word.charAt(i));
    		}
    		else  {
    			System.out.println(word+word);
    		}
    }
    
    */	
	
	}
}
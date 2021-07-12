package repl_it;

import java.util.Scanner;

public class Online_Book_Merchants {
	public static void main(String[] args) {
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
		
	   /* if (isPremiumCustomer) {
			if(nbooksPurchased>=8) {
				freeBooks=2;
			}
			else if(nbooksPurchased>=5) {
				freeBooks=1;
			}
			else {
			}
		}
		else {
			if(nbooksPurchased>=12) {
				freeBooks=2;
			}
			else if(nbooksPurchased>=7) {
				freeBooks=1;
			}
			else {
			}
		}
		System.out.println(freeBooks);
		*/
	    if (isPremiumCustomer) {
	    	freeBooks =(nbooksPurchased>=8)? 2:
	    				(nbooksPurchased>=5)? 1:0;
	    }
	    else {
	    	freeBooks =(nbooksPurchased>=12)? 2:
				(nbooksPurchased>=7)? 1:0;
		}
	    System.out.println(freeBooks);
	    
		
	}
}

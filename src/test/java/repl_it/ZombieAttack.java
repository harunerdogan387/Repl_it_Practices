package repl_it;

import java.util.Scanner;

public class ZombieAttack {
	/*
A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population.write a program to loop the city population and make it lose half of its population until no humans left. Print the each day like below for each day:

example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
	 */
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int z= inhabitants;
	    
	    if (z==0){
	        System.out.println("Day "+z+" ["+inhabitants+"]"); 
	        System.out.println("---- EXTINCT ----");  		
	      }
	      else{
	    
	    for (int i=0; i<=z; i++) {
	    	
	    	System.out.println("Day "+i+" ["+inhabitants+"]");
	    	inhabitants/=2;
	    	if(inhabitants==0) {
	    		System.out.println("---- EXTINCT ----");
	    		break;
	    	}
	    }
	  }
	}
}

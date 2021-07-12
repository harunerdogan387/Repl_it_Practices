package repl_it;

import java.util.Scanner;

/*
 Instructions from your teacher:
Print true if the string "cat" and "dog" appear the same number of times in the given string word. 

Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false 
 */
public class Cats_Dogs {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int countOfCats = 0;
	        int countOfDogs = 0;
	        String word = scan.nextLine();
	       
	       
	        for (int i = 0; i <=word.length()-3; i++) 
	          if (word.substring(i,i+3).equals("cat"))
	          countOfCats++;
	         
	        for (int i = 0; i <=word.length()-3; i++) 
	          if (word.substring(i,i+3).equals("dog"))
	          countOfDogs++;
	      
	      
	       //System.out.println("Count of Cats: "+countOfCats);
	       //System.out.println("Count of dogs: "+countOfDogs);
	        
	        boolean result = countOfCats == countOfDogs ? true :false;
	        System.out.println(result);
	       
	    }
	    
	  }
	


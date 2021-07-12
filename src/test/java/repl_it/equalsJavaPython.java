package repl_it;

import java.util.Scanner;
/*
 Instructions from your teacher:
 Given a string, print out true if the number of appearances 
 of "java" anywhere in the string is equal to the number of appearances 
 of "python" anywhere in the string (case sensitive).
 
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false 
 */
public class equalsJavaPython {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		 
		    int Length = sentence.length();
		    int i, countJava=0, countPython=0;
		    
		    for (i=0; i<=Length-4;i++) {
		    	if (sentence.substring(i,i+4).equals("java")) 
		    		countJava++;
		    }
		    	
		    //System.out.println("java: "+countJava);
		    
		    for (i=0; i<=Length-6;i++) {
		    	if (sentence.substring(i,i+6).equals("python")) 
		    		countPython++;
		    }
		    	
		    //System.out.println("python:"+countPython);
		    
		    boolean count = (countJava==countPython);
		    System.out.println(count);
		    
		    
		
		    
		    
	}
}


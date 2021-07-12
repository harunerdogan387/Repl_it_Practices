package repl_it;

import java.util.Scanner;

/*
 Instructions from your teacher:
Write a program that will print out route instructions. 
Your program should take 2 parameters: start point and end point. 
Use left, right, up and down for navigation. Insert ">" between commands. 
If start point equals to end point - display: "start/end(start or end variable!) found".

Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 
 */
public class Build_Route {
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
    
    String route = "";
  
    
    	
    	for (int i=1; i<=4; i++) {
    		if(start.equals(end)) {
    			if (i!=1) {
    			route = route.substring(0, route.length()-3);
    			System.out.println(route+": "+start+ " found");
    			}
    			else {
    			System.out.println(start+ " found");
    			}	
    			break;
    			}
    		
    		 if (start.equals("A")) {
    			route = route + "rigth > ";
    			start = "B";
    		}
    		else if (start.equals("B")) {
    			route = route + "down > ";
    			start = "C";
    		} 
    		else if (start.equals("C")) {
    			route = route + "left > ";
    			start = "D";
    		} 
    		else {
    			route = route + "up > ";
    			start = "A";
    		}
    		
    	}

}
}


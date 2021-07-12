package repl_it;

import java.util.Scanner;

public class FindAuser {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
	
	System.out.println("Enter full name:");
	String fullName = scan.nextLine();
	
	String user1 = "Max Payne";
	String user2 = "Alan Wake";
	
	boolean Result = fullName.equalsIgnoreCase(user1) || fullName.equalsIgnoreCase(user2);
	
	if (Result) {
		System.out.println("User found!");
	}
	else {
		System.out.println("User not found");
	}
	
}
}

package repl_it;

import java.util.Scanner;

public class Email2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String email = scan.next();
    int begin = 0;
    int ending=email.indexOf('_');
    	String firstName =email.substring(0,ending);
 	
    	firstName=(""+firstName.charAt(0)).toUpperCase()
    		  +firstName.substring(1).toLowerCase();
    	System.out.println("First name: " +firstName);
    
    int begin1 = ending+1; 
    int ending1=email.indexOf('@'); 
    	String lastName =email.substring(begin1, ending1);
    
    	lastName = (""+lastName.charAt(0)).toUpperCase()
				+ lastName.substring(1).toLowerCase();
    	System.out.println("Last name: "+lastName);
    	
    int begin2 = ending1+1;
    int ending2=email.indexOf('.'); 	
    	String domain =email.substring(begin2,ending2);
    	System.out.println("Domain: "+domain);
    	
    int begin3 = ending2+1;
    int ending3=email.lastIndexOf(""); 
    	String levelDomain =email.substring(begin3,ending3);
    	System.out.println("Top-Level Domain: "+levelDomain);
 }
}
/*   
    
    	lastName = (""+lastName.charAt(0)).toUpperCase()
				+ lastName.substring(1).toLowerCase();
	
	String FullName = firstName+" "+lastName;
	System.out.println(FullName);
    
    

	String str ="ABCDABCD";
		
		int n2 = str.indexOf("B");//1
		int n3 = str.lastIndexOf("B"); //5
		System.out.println(n2);
		System.out.println(n3);
		
		String myEmail ="Myemail.school@coldmail.edu";
		int Begin = myEmail.indexOf("@");
		int End = myEmail.lastIndexOf(".");
		
		String EmailType= myEmail.substring(Begin , End);
		System.out.println( EmailType );
		

 Write a program that will print 
 out information about user based on email. 
 Print first and last name from the upper case. 
  
 *Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
*/

package repl_it;

import java.util.Scanner;

public class FindingMaxLengthinString_Array {
	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		int maxLength = words[0].length();
		String maxWord = words[0];
		for (int i=1;i<words.length; i++) {
			if (words[i].length() >maxLength) {
			maxWord = words[i];
			}
		
		}System.out.println(maxWord);
		
	}
}

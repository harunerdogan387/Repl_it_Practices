package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class findNon_Duplicate {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    System.out.println(Arrays.toString(nums));
	   for (int j=0;j<nums.length;j++) {
	    	int count=0;
	    for (int i=0;i<nums.length;i++) {
	    	if (nums[j]==nums[i]) {
	    	count++;
	    	}
	    
	    }
	    if (count ==1) {
	    System.out.println(nums[j]);
	    
	   
	    }
	    
	    }  
	}    
}

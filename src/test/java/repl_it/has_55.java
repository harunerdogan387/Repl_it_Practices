package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class has_55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO Type your code below:
		String result="";
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				result = "true";
			break;
			} else {
				result = "false";
			}
		}
		System.out.println(result);
		
	}
}

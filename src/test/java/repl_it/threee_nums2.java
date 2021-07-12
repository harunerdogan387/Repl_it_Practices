package repl_it;

import java.util.Scanner;

public class threee_nums2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three numbers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();

		// your code here

		/*
		 * if (n1>n2 && n1>n3 || n1> n2 && n2==n3 ||
		 * 
		 * n1==n2 && n1>n3 || n1==n3 && n1>n2) { System.out.println("n1 is bigger"); }
		 * else if(n2>n1 && n2>n3 || n2>n1 && n1==n3 || n2==n1 && n2>n3 || n2==n3 &&
		 * n2>n1) { System.out.println("n2 is bigger"); } else if (n3>n1 && n3>n2 ||
		 * n3>n1 && n1==n2 || n3==n1 && n3>n2 || n3==n2 && n3>n1){
		 * System.out.println("n3 is bigger"); }
		 * 
		 * else { System.out.println("numbers are equal"); }
		 */

		if (n1 >= n2 && n1 >= n3) {
			System.out.println("n1 is bigger");
		}
		if (n2 >= n1 && n2 >= n3) {
			System.out.println("n2 is bigger");
		}
		if (n3 >= n1 && n3 >= n2) {
			System.out.println("n3 is bigger");
		}

	}
}

package repl_it;

import java.util.Scanner;

public class ShoppingList2_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String report = "";
		
		System.out.println("Enter Item1, count and its price:");
		String item1 = scan.next();
		int count1 = scan.nextInt();
		double price1 = scan.nextDouble();

		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.next();
		int count2 = scan.nextInt();
		double price2 = scan.nextDouble();

		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.next();
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();

		
		if (count1 != 0) {
			report += "Item1: " + item1 + " Price: " + price1*count1;
		}
		if (count2 != 0) {
			report  += ", Item2: " + item2 + " Price: " + price2*count2;
		} 
		if (count3 != 0) {
			report += ", Item3: " + item3 + " Price: " + price3*count3;
		} 
		
		double total = price1*count1 + price2*count2 + price3*count3;

		System.out.println(report);
		System.out.println("Total price: " + total);

	}
}

package repl_it;

import java.util.Scanner;

public class ShoppingList {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE:

		Scanner scan = new Scanner(System.in);
		String item1, item2, item3, report;
		double price1, price2, price3, totalprice;

		System.out.println("Enter Item1 and its price:");
		item1 = scan.nextLine();
		price1 = scan.nextDouble();
		System.out.println("Enter Item2 and its price:");
		item2 = scan.nextLine();
		price2 = scan.nextDouble();
		System.out.println("Enter Item3 and its price:");
		item3 = scan.nextLine();
		price3 = scan.nextDouble();

		totalprice = price1 + price2 + price3;

		report = ("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: "
				+ item3 + " Price: " + price3);
		System.out.println(report);
		System.out.println("Total price: " + totalprice);

	}
}

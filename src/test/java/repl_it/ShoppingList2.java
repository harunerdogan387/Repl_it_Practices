package repl_it;

import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String item1, item2, item3, Item1, Item2, Item3, report;
		int count1, count2, count3;
		double price1, price2, price3, total;

		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
		count1 = scan.nextInt();
		price1 = scan.nextDouble();

		if (count1 == 0) {
			price1 *= count1;
			Item1 = "Item1 " + "\"" + item1 + "\"" + " is not included since its count is 0, ";
		} else {
			price1 *= count1;
			Item1 = "Item1: " + item1 + " Price: " + price1 + ", ";
		}

		System.out.println("Enter Item2, count and its price:");
		item2 = scan.next();
		count2 = scan.nextInt();
		price2 = scan.nextDouble();
		if (count2 == 0) {
			price2 *= count2;
			Item2 = "Item2 " + "\"" + item2 + "\"" + " is not included since its count is 0, ";
		} else {
			price2 *= count2;
			Item2 = "Item2: " + item2 + " Price: " + price2 + ", ";
		}

		System.out.println("Enter Item3, count and its price:");
		item3 = scan.next();
		count3 = scan.nextInt();
		price3 = scan.nextDouble();
		if (count3 == 0) {
			price3 *= count3;
			Item3 = "Item3 " + "\"" + item3 + "\"" + " is not included since its count is 0";
		} else {
			price3 *= count3;
			Item3 = "Item3: " + item3 + " Price: " + price3;
		}
		report = Item1 + Item2 + Item3;

		total = price1 + price2 + price3;
		System.out.println(report);
		System.out.println("Total price: " + total);

	}
}

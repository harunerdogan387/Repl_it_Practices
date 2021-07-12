package repl_it;

import java.util.Scanner;

public class patient_information {

	public static void main(String[] args) {

		String firstName, lastName, fullName, email, street, city, state, address, contacts;
		int age;
		double height, weight;
		boolean isMarried;
		long zipcode, workPhoneNumber, personalPhoneNumber;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.print("Enter your first name: ");
		firstName = scan.next();
		System.out.print("Enter your last name: ");
		lastName = scan.next();
		System.out.print("Enter your email: ");
		email = scan.next();
		System.out.print("Enter your street: ");
		street = scan.next();
		System.out.print("Enter your city: ");
		city = scan.next();
		System.out.print("Enter your state: ");
		state = scan.next();
		System.out.print("Enter your zip code: ");
		zipcode = scan.nextLong();
		System.out.print("Enter your work phone number: ");
		workPhoneNumber = scan.nextLong();
		System.out.print("Enter your personal phone number: ");
		personalPhoneNumber = scan.nextLong();
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		System.out.print("Enter your height: ");
		height = scan.nextDouble();
		System.out.print("Enter your weight: ");
		weight = scan.nextDouble();
		System.out.print("Are you married?(true or false): ");
		isMarried = scan.nextBoolean();

		fullName = lastName + firstName;
		address = (street + " " + city + " " + state + " " + zipcode);
		contacts = ("work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber
				+ ",  email: " + email);

		System.out.println("\n\nPatient personal information" + "\nFull name: " + fullName + "\nAddress: " + address
				+ "\nContacts: " + contacts + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight
				+ " pounds" + "\nMarried?: " + isMarried);

	}
}

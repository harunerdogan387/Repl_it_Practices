package repl_it;

import java.util.Scanner;

public class Citizens {

	public static void main(String[] args) {

		int seniorCitizens, nonSeniorCitizens, age;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = scan.nextInt();
		nonSeniorCitizens = scan.nextInt();
		System.out.println("What is new citizen's age?");
		age = scan.nextInt();
		if (age > +65) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("Non-Senior Citizen");
		}
		/*
		 * if (age<0) {
		 * 
		 * System.out.println("invalid"); } else if (age>=65) {
		 * System.out.println("Senior Citizen"); seniorCitizens=seniorCitizens+1; } else
		 * { System.out.println("Non-Senior Citizen");
		 * nonSeniorCitizens=nonSeniorCitizens+1; }
		 * System.out.println("New seniorCitizens count "+seniorCitizens+
		 * "\nNew nonSeniorCitizens count "+nonSeniorCitizens);
		 */

		age = (age >= 65) ? (seniorCitizens++) :
		/* (age>0 && age<65)? */ (nonSeniorCitizens++);
		/* (nonSeniorCitizens=nonSeniorCitizens+0); */

		System.out.println(
				"New seniorCitizens count " + seniorCitizens + "\nNew nonSeniorCitizens count " + nonSeniorCitizens);
	}

}

package repl_it;

import java.util.Scanner;

public class BlackJackKeepHand {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int house = s.nextInt();
		int player = s.nextInt();

		// your code here
		if (house + player <= 21) {
			if (house > player) {
				System.out.println("player loss");
			} else if (house == player) {
				System.out.println("its a tie");
			} else {
				System.out.println("player wins");
			}
		} else {
			System.out.println("busts");
		}
	}
}

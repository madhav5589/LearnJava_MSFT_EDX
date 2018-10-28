import java.util.*;
public class OddsAndEvens {

	public static void main(String[] args) {
		System.out.println("Let’s play a game called Odds and Evens");
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String userName = scan.next();
		System.out.println("Hi "+ userName + ", which do you choose? (O)dds or (E)vens?");
		String userPick = scan.next();
		if (userPick.equals("O")) {
			System.out.println(userName + " has picked odds! The computer will be evens.");
		}
		else {
			System.out.println(userName + " has picked evens! The computer will be odds.");
		}
		System.out.println("--------------------------------------");
		
		// Part 2 - Play the game
		
		System.out.println("How many fingers do you put out?");
		int userChoice = scan.nextInt();
		
		Random rand = new Random();
		int computerChoice = rand.nextInt(6);
		System.out.println("The computer plays number " + computerChoice);
		System.out.println("--------------------------------------");
		
		int sum = userChoice + computerChoice;
		System.out.println("The sum is "+ sum);
		String winner = "";
		if (sum % 2 == 0) {
			// even won
			winner = "E";
			System.out.println("It's Even!");
		}
		else {
			// odd won
			winner = "O";
			System.out.println("It's Odd!");
		}
		
		if (userPick.equals(winner)) {
			System.out.println("That means "+ userName + " wins!");
		}
		else {
			System.out.println("That means computer wins!");
		}
	}
}

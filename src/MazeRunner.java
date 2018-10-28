import java.util.Scanner;

public class MazeRunner {
	static Maze myMap = new Maze();
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		intro();
		String userMove = userMove();
		
		while(myMap.didIWin() != true) {
			if(!myMap.canIMoveRight() && !myMap.canIMoveLeft()
					&& !myMap.canIMoveUp() && !myMap.canIMoveDown()) {
				System.out.println("Sorry, you've hit a wall.");
				userMove();
			}
			
			if(userMove.equals("R")) {
				if(myMap.canIMoveRight()) {
					myMap.moveRight();
				} else {
					System.out.println("Sorry, you've hit a wall.");
				}
			}
			else if(userMove.equals("L")) {
				if(myMap.canIMoveLeft()) {
					myMap.moveLeft();
				} else {
					System.out.println("Sorry, you've hit a wall.");
				}
			}
			else if(userMove.equals("U")) {
				if(myMap.canIMoveUp()) {
					myMap.moveUp();				
				} else {
					System.out.println("Sorry, you've hit a wall.");
				}
			}
			else if(userMove.equals("D")) {
				if(!myMap.canIMoveDown()) {
					myMap.moveDown();
				} else {
					System.out.println("Sorry, you've hit a wall.");
				}
			}
			myMap.printMap();
			userMove();
		}
		System.out.println("Congratulations, you made it out alive!");
	}
	
	public static void intro() {
		System.out.println("Welcome to Maze Runner!");
		System.out.println("Here is your current position:");
		myMap.printMap();
	}
	
	public static String userMove() {
		System.out.println("where would you like to move? (R, L, U, D)");
		String userChoice = new Scanner(System.in).next();
		return userChoice;
	}

}

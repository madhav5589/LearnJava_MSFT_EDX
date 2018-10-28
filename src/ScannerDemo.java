import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.print("Please enter your name:");
		String name = input.next();
		System.out.println("Hello " + name);
		
		System.out.println("10 plus 20 is " + 10 + 20);
	}

}

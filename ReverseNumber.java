package reverseNumber;

// import the Scanner class so we can create a new Scanner object
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		// creating the variables that we will need to complete this program
		// originalNumber does not need to be initialized yet (we'll do it
		// later)
		int originalNumber;
		int remainder;
		int reverse;

		// Create the scanner object
		Scanner userInput = new Scanner(System.in);

		// Provide a prompt that asks the user to enter a number
		System.out.println("Please enter a number here: ");

		// Assign the number entered by the user to the variable
		// "originalNumber"
		originalNumber = userInput.nextInt();

		System.out.println(originalNumber);
	}
}

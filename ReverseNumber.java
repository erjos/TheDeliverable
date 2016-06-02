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
		int reverse = 0;

		// Create the scanner object
		Scanner userInput = new Scanner(System.in);

		// Provide a prompt that asks the user to enter a number
		System.out.println("Please enter a number here: ");

		// Assign the number entered by the user to the variable
		// "originalNumber"
		originalNumber = userInput.nextInt();
	
		//Create a loop, goal: strip off digits of the original number until it's 0
		while (originalNumber > 0) {
			
			//lets assign a value to the remainder variable
			//taking the remainder of the number divided by 10 gives the last digit on the number
			remainder = originalNumber % 10;
			
			//printing the remainder to see what happens
			
			// need to add something to change the originalNumber and stop the loop
			originalNumber = originalNumber / 10;
			
			// need to assign a value to the "reverse" variable
			//reverse starts as zero so *10 won't do anything until second loop
			reverse= reverse * 10 + remainder;
			
			//Print the final value
			System.out.println("Your reversed number is : " + reverse);
		}
	}
}

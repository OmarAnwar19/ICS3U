/* Omar Anwar
 * ICS3O, SquareOrCube assignment
 * 5/10/21
 * This program takes a number from the user, and then if its less then 0, gives the cube, if its greater than 0 gives the 
 * square, and does this until 0 is entered. When it's entered, the program is terminated.
 */

//importing scanner utility
import java.util.Scanner;

public class SquareOrCube {

//declaring scanner as a static variable so it can be used by all methods
static Scanner scanner1 = new Scanner(System.in);

	//this method just explains the program to the user
	public static void programDesc() {
		
		//explaining program to the user
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("This program takes an input from the user, and outputs either the square or cube until 0 is entered.");
		System.out.println("-------------------------------------------------------------------------------------");
		
	}
	
	public static void errorEx() {
		
		//this method is for when an invalid input is detected, output a message to the user, and exit the program
		System.out.println("\nInvalid Input. Please enter a parsable value.");
		System.exit(0);
	}
	
	//this program gets all inputs from the user
	public static double getUserInput() {
		
		//first part of try and catch statement
		try {
		
		//declaring variable to store the user's number
		double userNumber;
		
		//asking for an input
		System.out.println("\nPlease enter a number: ");
		
		//getting and storing the number to a variable
		userNumber = scanner1.nextDouble();
		
		//returning the number so it can be used in other methods
		return (userNumber);
		
		//second half of try and catch, calling method for errors if one is encountered
		} catch (Exception ex) {
			
			//if error is found, call this method
			errorEx();
			
		}
		
		//this return statment is just so the program doesn't return an error, won't actually be returned or used
		return(0);
	}

	//this method does calculations based on the number gotten above
	public static double calcResult (double userNumber) {
		
		//declaring a variable for the calculated number
		double calcNumber;
		
		//if the number is > 0, find the square
		if (userNumber > 0) {
			
			//calculating square
			calcNumber = (userNumber * userNumber);
			
			//returning the value
			return (calcNumber);
			
		//if the number is < 0, find the cube
		} else if (userNumber < 0 ) {
			
			//calculating cube
			calcNumber = (userNumber * userNumber * userNumber);
			
			//returning the value
			return (calcNumber);
			
		}
		
		//this is just a placeholder so the program doesn't return an error, won't actually be returned
		return(0);
		
	}
	
	//this program otputs the results
	public static void printResult (double userNumber, double calcNumber) {
		
		//if the user's number is > 0, display a message about square
		if (userNumber > 0) {
			
			//the message mentioned above
			System.out.println("\nThe square of " + Math.round(userNumber) + "², is = " + Math.round(calcNumber));
			
		//if the user's number is < 0, display a number about cube
		} else if (userNumber < 0) {
			
			//the message mentioned above, same as with square, but says cube, and with a different symbol
			System.out.println("\nThe cube of " + Math.round(userNumber) + "³, is = " + Math.round(calcNumber));
			
		}
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method to explain program
		programDesc();
		
		//declaring a sentinel, the value which our loop terminates if its reached
		int SENTINEL = 0;
		
		//declaring variables for the users number, and the calculated number
		double userNumber, calcNumber;
		
		//a do while loop
		do {
			
			//while the userNumber is not equal to the SENTINEL (0), do this
			userNumber = getUserInput();//calling getUserInput method
			calcNumber = calcResult(userNumber);//calling method to calculate the cube or square, passing the userInput argument
			printResult(userNumber, calcNumber);//calling method to print results, passing the userInput, and calcNumber arguments
			
		//while the userNumber is not equal to 0, if it is, then exit the loop and output the following message
		} while (userNumber != SENTINEL);
		
		//display a message that the user entered a 0
		System.out.println("\n0 - was entered. Exiting program.");
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
	}

}

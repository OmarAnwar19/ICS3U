/* Omar Anwar
 * ICS30, GreatestCommonFactor assignment
 * 5/11/21
 * This program takes 2 numbers from the user, and then finds the greatest common factor of both values.
 */

import java.util.Scanner;

public class GreatestCommonFactor {
	
	//method for error and exception handling
	public static void errorEx() {
		
		//this method is for when an invalid input is detected, output a message to the user, and exit the program
		System.out.println("\nInvalid Input. Please enter a parsable value.");
		System.exit(0);
	}
	
	//method to print program description
	public static void printProgramDescription() {
		
		//printing program description
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("This program takes 2 user numbers, and then returns the GCF (Greatest Common Factor).");
		System.out.println("-------------------------------------------------------------------------------------");
		
	}
	
	//method to get user inputs (first and second numbers). Takes the scanner, aswell as the string "choice" as parameters
	//--> the string "choice" is declared in main, if it is "first", then we are looking for the first number input, if 
	//it is "second, then we are looking for the second number input
	public static int getUserInput(Scanner scanner1, String choice) {
		
		//first part of try and catch statement
		try {
		
		//declaring variable for the user's number
		int userInput;
		
		//if the string choice reads "first"
		if (choice == "first") {

			//ask user for number
			System.out.println("\nPlease enter the first number: ");
			userInput = scanner1.nextInt();//get and store the value
			return (userInput);//return the userInput, or number that they entered
			
		//otherwise, if the string choice reads "second"
		} else if (choice == "second") {
			
			//same as above, but for the second number
			System.out.println("\nPlease enter the second number: ");
			userInput = scanner1.nextInt();
			return (userInput);
			
		}
		
		//second half of try and catch, calling method for errors if one is encountered		
		} catch (Exception ex) {
			
			//if error is found, call this method
			errorEx();
			
		}
		
		//this is just so the program doesn't throw an error, won't actually be returned
		return (0);
		
	}
	
	//method to calculate the greatest common factor, takes the first and second number as parameters
	public static int gcf(int n1, int n2) {
		
		//SINCE WE HAD TO USE A "MODULUS" AS STATED IN THE ASSIGNMENT DESCRIPTION, I GOOGLED THIS, AND CAME
		//TO SOMETHING CALLED EUCELIDS METHOD, AND THIS IS WHAT THE BOTTOM BLOCK OF CODE IS.
		
		/*In Euclid's algorithm, we start with two numbers X and Y. If Y is zero then the greatest common divisor of both will be X
		, but if Y is not zero then we assign the Y to X and Y becomes X%Y. Once again we check if Y is zero, if yes 
		then we have our greatest common divisor or GCD otherwise we keep continue like this until Y becomes zero.*/
		
		//if n2 = 0, then n2 is the greatest common factor
		if(n2 == 0){
			//return this value
			return n1; 
		} 
		
		//if not then y = x, and we divide n1/n2 until it can no longer divide, this is the gcf
		return gcf(n2, n1%n2);
		
	}
	
	//method to print the results of our calculation, takes the first, second, and gcf numbers as parameters
	public static void printResult(int n1, int n2, int gcf) {
		
		//printing out the results
		System.out.println("\nThe GCF (Greatest Common Factor) of " + n1 + " and " + n2 + " is: " + gcf);
		
	}
	
	//main class
	public static void main(String[] args) {
		
        printProgramDescription();  //print the program description
        
        Scanner scanner1 = new Scanner(System.in);  //instantiate a Scanner object to read from the console
        
        //declaring variables for the first and second number inputs
        int n1, n2;
        
        //the following method reads the user input; it takes two arguments and returns an integer
        n1 = getUserInput(scanner1, "first");  
        n2 = getUserInput(scanner1, "second");
        
        printResult(n1, n2, (gcf(n1, n2))); //determine the gcf & print the result
        
        scanner1.close(); //close the Scanner
   }

}

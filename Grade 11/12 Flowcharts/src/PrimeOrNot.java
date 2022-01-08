/* Omar Anwar
 * ICS3O, PrimeOrNot assignment
 * 5/17/21
 * This program takes a number from a user, and displays whether it is a prime number or not. 0 can also be entered to exit the program.
 */

//importing the scanner utility
import java.util.Scanner;

//public class
public class PrimeOrNot {
	
	//method to print program description
	public static void prntPrgDesc() {
		
		//explain and display program to the user
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("This program takes an input from a user, and displays whether it is prime or not.");
		System.out.println("Enter 0, a double value, or a letter in order to terminate the program.");
		System.out.println("---------------------------------------------------------------------------------");
		
	}

	//method to get user input
	public static int getUserInput(Scanner scanner1) {
		
		//declare the variable for user input
		int userNum = 0;
		
		//variable for getting errors
		boolean invalidInput = false;
		
		//do while loop
		do {
			
			//first part of try and catch 
			try {
			
				//asking user for number
				System.out.print("\nPlease enter an integer: ");
		
				//storing the input to a variable
				userNum = scanner1.nextInt();
		
			//if the number is negative, throw an error
			if (userNum < 0) {
				
				//explain that an error was encountered
				System.out.println("\nInvalid Input. Please enter a parsable value.");
				
			}
				
			//second part of try and catch statement
			} catch (Exception ex) {
			
				//if an invalid input is entered, explain this in a message, then set boolean for invalidInpt = true
				System.out.println("\nInvalid Input. Please enter a parsable value.");
				
			}
		
		//second part of do while loop. Do this while no errors are encountered
		} while (invalidInput = false);
		
		//return the number the user entered
		return(userNum);
		
	}
	
	//method to check whether a number is prime or not
	public static boolean calcPrimeOrNot(int userNum) {
		
		//boolean to determine whether number is prime or not
		boolean isPrime = false;
	
		//declaring variable i = 2, so the first division is by 2
		int i=2;
			
		//while i is less than user input
		while (i <= userNum / 2) {
		    
		//check if the user input is divisible by i
		if (userNum % i == 0) {
			
			//if it is, then the number is not prime
			isPrime = true;
		    break;//break out of the loop
		    
		}
		
		//increment the counter in case the number is not divisible by the first value
		i++;
		    
		}
			
		//return the boolean, whether it's true or false
		return(isPrime);
		
	}
		
	//method to output results
	public static void outputResults(int userNum, boolean isPrime) {
	
		//if the boolean = true, then this is not a prime number
		if (isPrime == true) {
			
			//output this to user
			System.out.println("\n" + userNum + " is NOT A PRIME number.");
			System.out.println("------------------------------------");
			
		//if the boolean = false, then this is a prime number
		} else if (isPrime == false) {
			
			//output this to the user
			System.out.println("\n" + userNum + " is A PRIME number");
			System.out.println("------------------------------------");
			
		} 
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
		
		int userNum; //variable for user number
		boolean isPrime;//variable for the prime or not boolean
		int SENTINEL = 0;//variable for sentinel
		
		//start by calling the method to print the program description
		prntPrgDesc();
		
		//do while loop
		do {
				
			//call and store both the methods for getting user input, and checking whether a number is prime or not
			userNum = getUserInput(scanner1);
			isPrime = calcPrimeOrNot(userNum);
			
			//if the userNumber is not 0, or negative, output results
			if ((userNum != SENTINEL) && (userNum > 0)) {
				
				//calling method for outputting results
				outputResults(userNum, isPrime);
				
			}
		
		//do this code as long as the user does not enter 0 
		} while (userNum != SENTINEL);
		
		//if 0 is entered, display a message
		System.out.println("\n0 or a non-integer value was entered, terminating program.");
		
		scanner1.close();
		
	}

}

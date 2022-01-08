/* Omar Anwar
 * ICS3O, ArrayCheckKeyRandom assignment
 * 5/21/21
 *This program takes an input from the user, and returns the first occurence of the number in an array.
 */

//importing utilities for array sorting and scanner
import java.util.Arrays;
import java.util.Scanner;

//public class
public class ArrayCheckKeyRandom {

	//method to print program description
	public static void prntPrgDesc() {
		
		//displaying the program description to the user
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("This program takes an input from the user, and returns the first occurence of the number in an array.");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	
	}
	
	//method to get random number
	public static int getRandomInteger(int maximum, int minimum){ 
		
		//randomize number between range of maximum and minimum
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
		
	}
	
	//method to populate the array
	public static int [] populateArray(int array1 [ ]) {
		
		//for integer i, while it's less than the length of the array
		for ( int i = 0; i < array1.length - 1; i++ ) {
			
			//populate the array with a random number between 1 and 20
			array1[i] = getRandomInteger(10, 1);
			
		}
		
		//return the array
		return(array1);
		
	}
	
	//method to get user input
	public static int getUserInput(Scanner scanner1) {
		
		//declaring variable for the user input
		int userInput;
		
		//asking the user for a number
		System.out.print("\nPlease enter a value to search (between 1-10): ");
		
		//storing the number to a variable
		userInput = scanner1.nextInt();
		
		//returning the value
		return(userInput);
		
	}
	
	//method to check user input
	public static int compUserInput(int array1 [], Scanner scanner1, int userInput) {
		
		//declaring variable for the user number index
		int arrayIndex = -1;
		
			//for integer i, while it's less then the length of the array
			for ( int i = 0; i < array1.length - 1; i++ ) {
			
				//if the array at index i = the user input, then the arrayIndex is the same as the user input
				if (array1[i] == userInput) {
				
					//make them equal
					arrayIndex = i;				
					return(arrayIndex);//return the arrayIndex
					
				}//if 
				
			}//for
			
		//otherwise, return -1, meaning that the number was not found
		return(arrayIndex);
		
	}//method

	//method to print the program results
	public static void displayResults(int array1[], int userInput, int arrayIndex) {
		
		//print the whole array
		System.out.println("\nArray: " + Arrays.toString(array1));
							
		//if the arrayIndex = -1, meaning that no value was found
		if (arrayIndex == -1) {
			
			//print no value was found
			System.out.println("User Input: " + userInput + ". Was not found in the array.");
			
		//otherwise, if a value was found
		} else {
			
			//print the number, and the index it was found
			System.out.println("User Input: " + userInput + ". Found at index: " + arrayIndex);

			
		}
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//calling method to print program description
		prntPrgDesc();
		
		//declaring array
		int [ ] array1 = new int [20];
		
		//calling method to populate the array
		populateArray(array1);
		
		//storing value to userInput by calling method for userInput
		int userInput = getUserInput(scanner1);
		
		//storing value of the array index by calling method for it
		int arrayIndex = compUserInput(array1, scanner1, userInput);
		
		//displaying the results by calling said method
		displayResults(array1, userInput, arrayIndex);
		
		//closing scanner to avoid resource leaks
		scanner1.close();

		
	}

}

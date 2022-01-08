	/* Omar Anwar
	 * ICS3O, TempConvertor assignment
	 * 5/18/21
	 * This program asks the user for a temperature, in farenheit, and then converts it to celsius
	 */
	
	//importing scanner utility
	import java.util.Scanner;
	
	public class TempConvertor {
	
	//method for exception handling
	public static void errorEx() {
		
		//this method is for when an invalid input is detected, output a message to the user, and exit the program
		System.out.println("\nInvalid Input. Please enter a parsable value.");
		
	}
	
	//method to print program description
	public static void printProgramDescription (){
	
		//explaining the program to the user
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("This program takes an input from the user in farenheit, and converts it to celsius.");
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public static double getUserInput(Scanner scanner1) {
		
		//declaring variable for the temperature
		double tempInput;
		
		//first part of try and catch statement
		try {
		
			//ask user for temperature
			System.out.println("\nPlease enter a farenheit temperature: ");
			
			//get input and store it to a variable
			tempInput = scanner1.nextDouble();
			
			//return the value of the user input
			return (tempInput);
		
		//second half of try and catch, calling method for errors if one is encountered
		} catch (Exception ex) {
			
			//if error is found, call this method
			errorEx();
			
		}
		
		//this number is not actually returned, it is just here so the program doesnt throw an exception. 
		return(0);
		
	}
	
	//method to calculate the farenheit to celsius
	public static double conversionCalculator (double tempInput) {
		
		//declaring a new variable to store the converted value
		double tempCalc;
			
		//calculating the user input in celsius
		tempCalc = ((tempInput -32) * (0.56));
			
		//returning the calculation rounded
		return (Math.round(tempCalc));	
			
		
	}
	
	public static void outputResults(double tempInput, double calcOutput) {
		
		//outputting the results of the calculations
		System.out.print("\nThe conversion is: ");
		
		//print the calculation results
		System.out.print(tempInput + "°F" + " = " + calcOutput + "°C\n");
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
	
		//declaring sentinel for the do while loop
		int SENTINEL = 0;
		
		//declaring variables for tempInput, and the calculation
		double tempInput, calcOutput;
		
		//calling method for program description
		printProgramDescription();
		
		//first part of do while loop. do this:
		do {
			
			//declaring and calling methods for user choice, user input, and converting the temperature
			tempInput = getUserInput(scanner1);
			calcOutput = conversionCalculator(tempInput);
			
			//do this only if the user has entered a number other than 0, or a letter
			if (tempInput != 0.0 && calcOutput != 0.0) {
				
				//outputting the results
				outputResults(tempInput, calcOutput);
				
			}
			
			
		//while the user has not entered 0, or an integer( as the value would default to 0)
		} while (tempInput != SENTINEL);
		
		//explain this to the user
		System.out.println("0 or a non-number value was entered, program terminated.");
	
		//closing scanner to avoid resource leaks
		scanner1.close();
			
		}
	
	}

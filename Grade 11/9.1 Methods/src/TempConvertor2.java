/* Omar Anwar
 * ICS3O, TempConvertor assignment
 * 5/10/21
 * This program asks the user for a temperature, either in celsius or farenheit, and then converts it to the other one
 */

//importing scanner utiility
import java.util.Scanner;

public class TempConvertor2 {

//declaring scanner as a static variable so it can be used by all methods
static Scanner scanner1 = new Scanner(System.in);
	
public static void errorEx() {
	
	//this method is for when an invalid input is detected, output a message to the user, and exit the program
	System.out.println("\nInvalid Input. Please enter a parsable value.");
	System.exit(0);
}
	
public static void printProgramDescription (){

	//explaining the program to the user
	System.out.println("-------------------------------------------------------------------------------------");
	System.out.println("This program takes an input from the user in either celsius or farenheit, and  converts it to the opposite unit. \n");
	System.out.println("-------------------------------------------------------------------------------------");
}

public static int getUserMenuChoice() {
		
	//declaring variable to store menu choice
	int menuChoice;
	
	//outputting menu options
	System.out.println("Please choose an option: ");
	System.out.println("1.) Celsius to Farenheit");
	System.out.println("2.) Farenheit to Celsius\n");
	
	//first part of try and catch statment
	try {
	
	//getting and storing menu choice
	menuChoice = scanner1.nextInt();
	
	//if the user choses a number other than 1 or 2, throw an error
	if ((menuChoice != 1) && (menuChoice != 2)) {
		
		//call the method for errors
		errorEx();
	}
	
	//return menuChoice
	return (menuChoice); 
	
	//second half of try and catch, calling method for errors if one is encountered
	} catch (Exception ex) {		
		
		//if error is found, call this method
		errorEx();
		
	}
	
	//this return statement is just so the program doesn't return an error, this won't actually be used
	return (0);
	
}

public static double getUserInput(int menuChoice) {
	
	//declaring variable for the temperature
	double tempInput;
	
	//first part of try and catch statement
	try {
	
	//if the user chose celsius to farenheit,
	if (menuChoice == (1)) {
		
		//ask for celsius temperature
		System.out.println("\nPlease enter a celsius temperature: ");
		
		//ask for and store variable
		tempInput = scanner1.nextDouble();
		
		//return the temperature they chose
		return (tempInput);
		
	//same as above but with farenheit to celsius
	} else if (menuChoice == (2)) {
		
		System.out.println("\nPlease enter a farenheit temperature: ");
		
		tempInput = scanner1.nextDouble();
		
		return (tempInput);
		
	}
	
	//second half of try and catch, calling method for errors if one is encountered
	} catch (Exception ex) {
		
		//if error is found, call this method
		errorEx();
		
	}
	
	//this value is just so the program doesnt throw an error, wont actually be returned
	return(0.0); 
	
}

public static double conversionCalculator (int menuChoice, double tempInput) {
	
	//declaring a new variable to store the converted value
	double tempCalc;
	
	//if they chose celsius to farenheit
	if (menuChoice == 1) {
		
		//calculate
		tempCalc = ((tempInput * (9/5)) + 32);
		
		//store rounded value to variable
		return (Math.round(tempCalc));
		
	//same as above, but if they chose farenheit to celsius
	} else if (menuChoice == 2) {
		
		tempCalc = ((tempInput -32) * (0.56));
		
		return (Math.round(tempCalc));	
		
	}
	
	//this is just so the program doesnt throw an error, this value won't actually be returned
	return (0.0);	
	
}

public static void outputResults(int menuChoice, double tempInput, double calcOutput) {
	
	//outputting the results of the calculations
	System.out.println("\nThe conversion is: ");
	
	//if they chose celsius to farenheit, output this
	if (menuChoice == 1) {
		
		System.out.println("\n" + tempInput + "°C" + " = " + calcOutput + "°F");
		
	//if they chose farenheit to celsius, output this
	} else if (menuChoice == 2) {
		
		System.out.println("\n" + tempInput + "°F" + " = " + calcOutput + "°C");
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method for program description
		printProgramDescription();
		
		//declaring and calling methods for user choice, user input, and converting the temperature
		int menuChoice = getUserMenuChoice();
		double tempInput = getUserInput(menuChoice);
		double calcOutput = conversionCalculator(menuChoice, tempInput);
		
		//outputting the results
		outputResults(menuChoice, tempInput, calcOutput);

		scanner1.close();
		
	}

}

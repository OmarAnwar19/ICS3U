/* Omar Anwar
 * ICS3O, AverageMinMax assignment
 * This program prompts the user for a series of numbers, then displays their average, min and max values.
 * 5/12/21
 */

//importing utilities for scanner and decimalFormat
import java.util.Scanner;
import java.text.*;

public class AverageMinMax {

	//declaring the number of repetitions of loop in main, as well as totalNumber, as static variables
	//this means that they can be easily retrieved by any methods
	static double numCount = 0;
	static double totalNumber = 0; 
	
	//declaring scanner as a static variable so it can be used by all methods
	static Scanner scanner1 = new Scanner(System.in);

		//this method just explains the program to the user
		public static void programDesc() {
			
			//explaining program to the user, by printing to the screen
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("This program prompts the user for a series of numbers, then displays their average, min and max values.");
			System.out.println("(Default minimum and maximum values = 0, if no larger or smaller values are entered, these will be the maximum and minimum values.");
			System.out.println("Enter 0 to Quit.");
			System.out.println("-------------------------------------------------------------------------------------\n");
			
		}
		
		//this method is for error handling
		public static void errorEx() {
			
			//this method is for when an invalid input is detected, output a message to the user, and exit the program
			System.out.println("\nInvalid Input. Please enter a parsable value.");
			System.exit(0);
		}
		
		//this program gets all inputs from the user
		public static double getUserInput(Scanner scanner1) {
			
		//first part of try and catch statement
		try {
			
		//declaring variable to store the user's number
		double userInput;
		
		//getting and storing the number to a variable
		userInput = scanner1.nextDouble();
			
		//returning the number so it can be used in other methods
		return (userInput);
			
		//second half of try and catch, calling method for errors if one is encountered
		} catch (Exception ex) {
			
			//if error is found, call this method
			errorEx();
				
		}
			
		//this return statement is just so the program doesn't return an error, won't actually be returned or used
		return(0);
		
		}
	
	//the primary method for calculating, and storing the min, max and avg,
	//this method requires lots of parameters, but this allows it to function fully
	public static double storeUserInput(double userNumber, double minNumber, double maxNumber, double avgNumber, String rtrn) {
		
		//start by adding to the number of loops the main method loop has undergone
		(numCount) ++;
		
		//if the user input is smaller than minNumber (starts as 0), then the user input is the new minimum
		if (userNumber < minNumber) {
			
			//as you repeat the loop, there will probably be a number smaller than the last, and that will become the new minimum
	          minNumber = userNumber;
	          
	    } 
		
		//if the user input is larger than maxNumber (starts as 0), then the user input is the new minimum
		if (userNumber > maxNumber) {
	    	
			//as you repeat the loop, there will probably be a number smaller than the last, and that will become the new minimum
	         maxNumber = userNumber;
	    }

		//calculating average
	    	totalNumber += userNumber;//start by adding the user input to the total sum 
	    	totalNumber = totalNumber;
	    	
	    		
		avgNumber = (totalNumber / numCount);//divide the sum by the repetitions of the loop
			
		//if the String parameter is "min"
	    if (rtrn == "min") {
	    	
	    	//return the minNumber
	    	return (minNumber);
	    	
	    //if the String parameter is "max"
	    } else if (rtrn == "max") {
	    	
	    	//return the maxNumber
	    	return (maxNumber);
	    
	    //if the String parameter is "avg"
	    } else if (rtrn == "avg") {
	    	
	    	//return the avgNumber
	    	return (avgNumber);
	    
	    //if the String parameter is "sum"
	    } else if (rtrn == "sum") {
	    	
	    	//return the sum of the numbers, totalNumber
	    	return (totalNumber);
	    	
	    }
	    
	    //this value is not actually returned, but rather is just a placeholder so the program does not throw an error
	    return (0);
	    
	}
	
	//method to output the different calculations, takes the parameters of the different values, aswell as the decimal format
	public static void printResults(double minNumber, double maxNumber, double avgNumber, DecimalFormat df1) {
		
		//print each of the values, as well as the number itself decimal formatted
		System.out.println("\nMinimum Value: " + df1.format(minNumber));
	    System.out.println("Maxiumum Value: " + df1.format(maxNumber));
	    
	    System.out.println("Sum of Values: " + df1.format(totalNumber));
	    System.out.println("Average of Values: " + df1.format(avgNumber));
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		programDesc();  //print the program description
        
        Scanner scanner1 = new Scanner(System.in);  //instantiate a Scanner object to read from the console
        DecimalFormat df1 = new DecimalFormat("#.00");
        
        //declaring a sentinel, the value which our loop terminates if its reached
      	int SENTINEL = 0;
      	
      	//declaring variables for max, min, avg numbers, all equal to 0, as well as the variable for totalNumber
      	double maxNumber = 0;
    	double minNumber = 0; 
    
    	double totalNumber;
    	double avgNumber = 0;
      	
      	//declaring variables for the users number, and the calculated number
      	double userNumber;
      	
      	//a do while loop
      	do {
      		
     		//while the userNumber is not equal to the SENTINEL (0), do this
      		System.out.println("Please enter a number: ");
      		userNumber = getUserInput(scanner1);//calling getUserInput method
      		
      		//store all of the values from the method into variables which can be called later
      		minNumber = storeUserInput(userNumber, minNumber, maxNumber, avgNumber, "min");
      		maxNumber = storeUserInput(userNumber, minNumber, maxNumber, avgNumber, "max");
      		avgNumber = storeUserInput(userNumber, minNumber, maxNumber, avgNumber, "avg");
      		totalNumber = storeUserInput(userNumber, minNumber, maxNumber, avgNumber, "sum");
      			
      	//while the userNumber is not equal to 0, if it is, then exit the loop and output the following message
      	} while (userNumber != SENTINEL);
	    
      	//call the method to print the results of the calculations
	    printResults(minNumber, maxNumber, avgNumber, df1);
      		
      	//closing the scanner to avoid resource leaks
      	scanner1.close();
		
	}

}

/* Omar Anwar
 * ICS3O, SquareRoot assignment
 * 5/5/21
 * this program asks the user for an input, and then calculates it's square root, this is repeated until any negative value is enterd
 */

//importing decimal formatting , and scanner utilities
import java.text.*;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the scanner an decimalformat utilities
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring the sentinel, which is the value which we will set as the value to end the loop
		int SENTINEL = -1;//it is only -1, however, later, it will make sense how it is any negative number
	    double userInput, sqrtCalc;//declaring doubles for userInput, and the calculated square root
	    
	    //explaining the program to the user
	    System.out.println("This program takes in a number from the user, and returns the square root, until a negative value is entered. ");
	    
	    //try and catch statement to try the code, and then return a message if there are any errors
	    try {
	    
	    //do everything in this loop, until a certain condition is met
  	    do {
  	    	
  	    	//ask the user for a number, and then store it to a variable
  	    	System.out.println("\nPlease enter a number : ");
		    userInput = scanner1.nextInt(); 
		    
		    //calculating the square root of the number, and storing it to a variable
		    sqrtCalc = Math.sqrt(userInput);
		    //displaying the calculated square root in a 2 decimal format
  	    	System.out.println("\nThe square root of " + userInput + " is " + df1.format(sqrtCalc));
  	    	
		
  	    //do the above loop, unless the user input is less then, or equal to the sentinel (-1)
  	    } while (!(userInput <= SENTINEL));
  	    
  	    //if it is less then or equal to 0, then display this message to the user
  	    System.out.println("\n0, or negative value entered; program terminated.");
  	    
  	    //closing the scanner to avoid resource leaks
  	    scanner1.close();
		
  	    //second part of the try and catch statement, if there are errors detected, then output this message to the user
	    } catch (Exception ex) {
	    	
	    	//print this message:
	    	System.out.println("\nInvalid input. Please enter a parsable value.\n");
	    	
	    }
	}

}

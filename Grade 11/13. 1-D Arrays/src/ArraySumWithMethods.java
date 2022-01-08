/* This program displays the sum of all integers entered by the user
 * ICS3O, ArraySumWithMethods assignment
 * Author: Omar Anwar
 * Date: 5/20/21
 */

//importing utilities
import java.util.Scanner;

import javax.swing.JOptionPane;

//start of class
public class ArraySumWithMethods {

	//method to print program description
	public static void programDescription() {
		
		//displaying message box with output
		JOptionPane.showMessageDialog(null, "This program displays the sum of all integers entered by the user.", "ArraySumWithMethods", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	//method to store values to array
	public static int initializeNumbers(Scanner scanner1) {
		
		//declaring variable for array length
		final int ARRAY_SIZE;
		
		//first part of try and catch statement to store 
		try {
		
		//Get the input from the user
		String arrayInput = JOptionPane.showInputDialog(null, "Enter the length of the array:");  //NullPointerException NOT handled!
		
		if (arrayInput == null) {//Cancel button selected, exit the program
			 
			//output a message
			 JOptionPane.showMessageDialog(null, "Exiting Program", "PROGRAM TERMINATION", JOptionPane.INFORMATION_MESSAGE); 
			 System.exit(0);//exit the program
			 
         }
		
		//otherwise, store the length inputted to a variable
		ARRAY_SIZE = Integer.parseInt(arrayInput);
	
		//return the value of the array length
		return(ARRAY_SIZE);
		
		//second part of try and catch statment, catch any errors
		} catch (Exception ex) {
			
			//output the message to a message box
			JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);//exit the program
			
		}
		
		//this value is not actually returned, it is only here so the program does not return an error
		return(0);
		
	}

	//method to store values to array and calculate sum
	public static int calculateSum(int ARRAY_SIZE, int [] numbers, Scanner scanner1) {
		
		//declaring variables for string input, and sum
		int sum=0;
		String arrayInput;
         
		//first part of try and catch statement
		try {
		
         for ( int i = 0; i < ARRAY_SIZE; i++ ) {// use a for loop to initialize the array 
        	 
        	//Get the input from the user
        	arrayInput = JOptionPane.showInputDialog(null, "Enter a number:");  //NullPointerException NOT handled
            
            if (arrayInput == null) {//Cancel button selected, exit the program
   			 
    			//output a message
    			 JOptionPane.showMessageDialog(null, "Exiting Program", "PROGRAM TERMINATION", JOptionPane.INFORMATION_MESSAGE); 
    			 System.exit(0);//exit the program
    			 
            }
            
            //otherwise, store the value inputted to index i of the array
            numbers[ i ] = Integer.parseInt(arrayInput);

            sum += numbers[i];  //add each element to sum
                
         }
        
         //return the sum
         return(sum);
         
         //second part of try and catch statment
		} catch (Exception ex) {
			
			//output the message to a message box
			JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
			
			System.exit(0);//exit the program
			
		}
		
		//this value is not actually returned, it is just here so the program does not throw an error
		return(0);
         
	}
	
	//method to display results
	public static void displayResults(int sum) {
		
		//pretty simple, output the sum to a message box
		JOptionPane.showMessageDialog(null, "The sum of all values in the array " + " = " + sum, "ArraySumWithMethods", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	//main method
    public static void main (String [ ] args) {
    	
    	//declaring scanner
    	Scanner scanner1 = new Scanner(System.in);
    	
    	//declaring variable for array length
    	int ARRAY_SIZE;
    	 
    	//calling method to print program description
    	programDescription();
    	 
    	//storing the length of the array by calling method, and putting it into variable
    	ARRAY_SIZE = initializeNumbers(scanner1);
    	 
        int [ ] numbers = new int [ARRAY_SIZE];  // instantiate the array
        
        //calling method to print the results
        displayResults(calculateSum(ARRAY_SIZE, numbers, scanner1));
         
        scanner1.close(); //close the scanner
         
    } //main
 }  //class

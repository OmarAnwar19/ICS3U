/* This program displays the integers entered by user backwards in array
 * ICS3O, ArrayReverse assignment
 * Author: Omar Anwar
 * Date: 5/20/21
 */

//importing java utilities
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class ArrayReverse {

	//method to print program description
	public static void programDescription() {
		
		//output program discriptin to message box
		JOptionPane.showMessageDialog(null, "This program displays integers entered backwards.", "ArraySumWithMethods", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	//method to decleare length of values to the array
	public static int initializeNumbers(Scanner scanner1) {
		
		//declare variable for array length
		final int ARRAY_SIZE;
		
		//first part of try and catch statment
		try {
		
		//Get the input from the user
		String arrayInput = JOptionPane.showInputDialog(null, "Enter the length of the array:");  //NullPointerException NOT handled!
		
		if (arrayInput == null) {//Cancel button selected, exit the program
			 
			//output a message
			 JOptionPane.showMessageDialog(null, "Exiting Program", "PROGRAM TERMINATION", JOptionPane.INFORMATION_MESSAGE); 
			 System.exit(0);//exit the program
			 
         }
		
		//otherwise, the length of the array = the converted value of the string
		ARRAY_SIZE = Integer.parseInt(arrayInput);
		
		//return the length of the array
		return(ARRAY_SIZE);
		
		//catch exception
		} catch (Exception ex) {
			
			//output the message to a message box
			JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);//exit the program
			
		}
		
		//this will not actually be returned, it is just here so the program does not throw an error
		return(0);
		
	}
	
	//method to store values to the array
	public static int[] storeArray(int ARRAY_SIZE, int [] numbers, Scanner scanner1) {
		
		//declare variable for the input of the string
		String arrayInput;

		//try and catch statment to catch any errors
		try {
		
		//for the variable i, while less than length of array, populate the array
         for ( int i = 0; i < ARRAY_SIZE; i++ ) {// use a for loop to initialize the array 
        	 
        	//Get the input from the user
        	arrayInput = JOptionPane.showInputDialog(null, "Enter a number:");  //NullPointerException NOT handled
            
            if (arrayInput == null) {//Cancel button selected, exit the program
   			 
    			//output a message
    			 JOptionPane.showMessageDialog(null, "Exiting Program", "PROGRAM TERMINATION", JOptionPane.INFORMATION_MESSAGE); 
    			 System.exit(0);//exit the program
    			 
            }
            
            //otherwise, store the value inputted to the i index of the array
            numbers[ i ] = Integer.parseInt(arrayInput);
                
         }
        
         //return the array
         return(numbers);
        
        //second part of try and catch statement
		} catch (Exception ex) {
			
			//output the message to a message box
			JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
			
			System.exit(0);//exit the program
			
		}

		//this will not actually be returned, it is just here so the program does not throw an error
		return(null);
		
	}
	
	//method to display the results
	public static void displayResults(int ARRAY_SIZE, int numbers []) {
		
		//declaring new array to store the reverse values
		int reverse [ ] = new int [ARRAY_SIZE];
		
		//declaring counter variable
		int j = 0;
		
		//while i > length of the array
		for (int i = numbers.length - 1; i >= 0; i--) {
				
			//store the value of the index i of the initial array to the second array
				reverse[j] = numbers[i];
				j++;//increment the counter
								
		}
				
		//display the results
		JOptionPane.showMessageDialog(null, "The array in reverse is: " + Arrays.toString(reverse), "ArrayReverse", JOptionPane.PLAIN_MESSAGE);
		
		}
	
	//main method
    public static void main (String [ ] args) {
    	
    	//declaring scanner
    	Scanner scanner1 = new Scanner(System.in);
    	
    	//declaring vairable to store array length
    	int ARRAY_SIZE;
    	 
    	//call method to print program description
    	programDescription();
    	 
    	//store the value of the calculated number above to the variable for array length
    	ARRAY_SIZE = initializeNumbers(scanner1);
    	 
    	//declaring new array using the ARRAY_sIZE
        int [ ] numbers = new int [ARRAY_SIZE];  // instantiate the array
         
        //calling method to display the results
        displayResults(ARRAY_SIZE, storeArray(ARRAY_SIZE, numbers, scanner1));
         
        scanner1.close(); //close the scanner
         
    } //main
 }  //class

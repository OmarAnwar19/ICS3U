/* Omar Anwar
 * SumAndProduct assignment, ICS3O
 * 4/28/21
 * The purpose of this project is to take in 3 unformatted decimal values from the user, and then 
 * add them together, multiply them together, and ouput both of these sum and product values reformatted to 2 decimals.
 */

//importing utilities
import java.util.Scanner;
import java.text.*;

public class SumAndProduct {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the scanner and formatting 
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring all of the variables for user input and calculations
		double decNumber1;
		double decNumber2;
		double decNumber3;
		double decNumSum;
		double decNumProduct;
		
		//explained below
		try { 
		//explaining to the user what this program does, and then requesting a number
		System.out.println("This program intakes 3 decimal values from the user, and returns the sum and product!\n");
		System.out.println("Please enter first number: ");
		decNumber1 = scanner1.nextDouble();//storing said number to a variable
		
		//same as above
		System.out.println("\nPlease enter second number: ");
		decNumber2 = scanner1.nextDouble();
		
		//same as above
		System.out.println("\nPlease enter third number: ");
		decNumber3 = scanner1.nextDouble();
		
		decNumSum = (decNumber1 + decNumber2 + decNumber3);//adding all 3 values, not yet formatted
		decNumProduct = (decNumber1 * decNumber2 * decNumber3);//multiplying all 3 values
		
		System.out.println("\nSum of Values: " + df1.format(decNumSum));//outputting the sum of the numbers, while formatting it to 2 decimals
		System.out.println("\nProduct of Values: " + df1.format(decNumProduct));//outputting the product of the numbers, while formatting it to 2 decimals
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
		//this try, catch, just makes sure that the program doesn't crash if a user enters an invalid input
		} catch(Exception ex) {
			
			System.out.println("\nInvalid Input. Please enter a decimal value.");
			
		}
	}

}

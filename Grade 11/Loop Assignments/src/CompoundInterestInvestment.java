/* Omar Anwar
 * ICS3O, CompoundInterestInvestment assignment
 * 5/5/21
 * this program takes the This program takes the amount of years, initial investment, and interest rate, 
 * and then calculates how much is owed every year using a loop
 */

//importing scanner and decimal formatting tool (java.text)
import java.util.Scanner;
import java.text.*;

public class CompoundInterestInvestment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the scanner and decimalformat utilities
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring the doubles for amount of years, initial investment, and interest rate
		double P, i, Y;
		int j = 1;//declaring integer for counter in loop
		
		//explaining the program to the user
		System.out.println("This program takes the amount of years, initial investment, and interest rate,"
				+ " and then calculates how much is owed every year. \n");
		
		//try and catch statement to try the code, and return a message if there are any errors
		try {
		
		//asking the user for initial investment, investment rate, and number of years, then storing all to variables
		System.out.println("Please enter initial investment: ");
		P = scanner1.nextInt();
		
		System.out.println("\nPlease enter investment rate: ");
		i = scanner1.nextInt();
		
		System.out.println("\nPlease enter number of years: ");
		Y = scanner1.nextInt();
		
		//this line is just for formatting
		System.out.println("\n");

		//while the counter is less then or equal to the number of years inputed, do what's in the loop:
		while (j <= Y) {
			
			//NEW INVESTMENT = OLD INVESTMENT + (OLD INVESTMENT X THE INVESTMENT RATE)
			P = (P + (P * i / 100));
			System.out.println("Investment value after " + j + " year(s): $" + df1.format(P));//output this to the user, and format it in 2 decimal places
			j++;//after this, add to the counter, which will loop the lines on top until j = Y
			
		}
		
		//second part of the try and catch statement, if there are any errors, output a message to the user
		} catch (Exception ex) {
			
			//output this message to the user
			System.out.println("\nInvalid input. Please enter a parsable value. \n");
			
		}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
	}

}

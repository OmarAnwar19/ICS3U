/* Omar Anwar
 * ICS3O, PrintingPrice assignment
 * 5/3/21
 * This program takes in a number of papers to print from the user, and calculates the cost of printing
 * according to the quantity of papers they have chosen
 */

//importing scanner
import java.util.Scanner;

public class PrintingPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring the variables for userInput, and printPrice
		int userInput;
		double printPrice = 0;
		
		//explaining the program to the user, and asking for an input
		System.out.println("This program takes the number of papers printed from the user, "
				+ "and returns the cose of printing said papers according to printing price"
				+ "which changes depending on the number of papers.");
		System.out.println("\nPlease enter the number of papers you wish to print: ");
		
		//taking in input from the user and assigning it to a variable
		userInput = scanner1.nextInt();
		
		/* If:
		 * Papers = 0-99, Price = $0.30
		 * Papers = 100-499, Price = $0.28
		 * Papers = 500-749, Price = $0.27
		 * Papers = 750-1000, Price = $0.26
		 * Papers = 1000+, Price = $0.25
		 */
		
		if (userInput >= 1 && userInput <= 99) {
			printPrice = 0.30;
		
		} else if (userInput >= 100 && userInput <= 499) {
			printPrice = 0.28;
			
		} else if (userInput >= 500 && userInput <= 749) {
			printPrice = 0.27;
			
		} else if (userInput >= 750 && userInput <= 1000) {
			printPrice = 0.26;
			
		} else if (userInput >= 1000) {
			printPrice = 0.25;
			
		} else {//if the user inputs a letter, or negative integer tell them it is an incorrect value
			System.out.println("\nInvalid Input");
			System.out.println("Please enter a valid input.");
			
		}
		
		//declaring variable to calculate the printing price
		double costCalc = userInput * printPrice;
		
		//outputting the print cost
		System.out.println("\nPaper quantity: " + userInput);
		System.out.println("Print Price: $" + printPrice);
		System.out.println("Total Cost: $" + costCalc);

		//closing the scanner to avoid resource leaks
		scanner1.close();
	
	}

}

/* Omar Anwar
 * TriangleArea assignment
 * 5/28/21
 * This program takes the base and height of a triangle from the user, and returns the area
 */

//importing utilities for scanner, and decimal format
import java.text.DecimalFormat;
import java.util.Scanner;

//public class
public class TriangleArea {

	//boolean to display program description
	public static boolean newPrg = true;
	
	//method to display the area
	public static void displayArea(double area) {

		//declaring the decimal format
		DecimalFormat df = new DecimalFormat("#.00");
		
		//displaying the area to console
		System.out.println("\nThe area of the triangle is: " + df.format(area) + " units squared.");
		System.out.println("-----------------------------------------------");

	}

	//method to calculate the area
	public static double calculateArea(double base, double height) {

		//prefrom calculation
		double area = (base*height) / 2;
		return area;//return the calculated area

	}

	//method to exit
	public static void goodBye(Scanner s) {

		//display goodbye message
		System.out.println("\n-----------------------------");
		System.out.println("Terminating Program. \nGoodbye!");
		System.out.println("-----------------------------");

		//close scanner
		s.close();
		System.exit(0);//exit system

	}
	
	//method to handle exceptions
	public static void exHandling() {
		
		//display error message
		System.out.println("\n" + "--------------------\n" + "INVALID INPUT\n" + "--------------------");
		
		//make newPrg boolean = false, so the program description isn't displayed
		newPrg = false;
		
		//call the main method
		main(null);
		
	}

	//method to get the user input
	public static double getUserInput(Scanner s, String baseOrHeight) {

		//declare variables for the input and counter
		double input = 0;
		int counter = 0;

		//message to ask user for input
		String message = "\nPlease enter the " + baseOrHeight + ": ";

		//first part of do while statement
		do {

			//if the counter is 0, output the message above
			if (counter == 0) System.out.print(message);

			else//otherwise, do the following:

			//display error message, and then ask for input again
			System.out.print ("\n" + "--------------------\n" + "INVALID INPUT\n" + "--------------------\n" + message);

			//increment the counter
			counter++;

			
			try {//try to get an input
				
			//get input, and store it to variable
			input = s.nextDouble();

			//if there is an error:
			} catch (Exception ex) {//catch exception
				
				exHandling();//call method for error handling
				
			}
			
			//if the user enters 0
			if (input == 0 ) {

				//call the method to exit
				goodBye(s);

			}

		} while ((input < 0) || (input > 100));//do this while the value is less than 100, but greater than 0

		//return the inputed value
		return input;
	}

	//method to print program description
	public static void prgDesc() {

		//display the message
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("This program takes the base and height of a triangle from the user, and returns the area.");
		System.out.println("------------------------------------------------------------------------------------------");

	}

	//public method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if the newPrg boolean == true
		if (newPrg == true) {
		
			//call method to print program description
			prgDesc();
		
		}

		Scanner s = new Scanner(System.in);//declare scanner

		//do this until the program is exited
		while(true) {

			//call and store the method and values for base and height
			double base = getUserInput(s, "base");
			double height = getUserInput(s, "height");

			//call the method to calculate area, and store the returned value
			double area = calculateArea(base, height);

			//call method to display the area
			displayArea(area);

		}

	}

}

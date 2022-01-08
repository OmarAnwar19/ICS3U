/* Omar Anwar
 * CircleArea assignment, ICS3O
 * 4/28/21
 * The purpose of this assignment it to take in the radius  a circle, and then calculate the
 * area of the circle, and format it to 2 decimals.
 */

//importaing utilities
import java.util.Scanner;
import java.text.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the scanner and formatting
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring variables for user input and calculations
		double radCircle;
		double areaCircle;
		
		//explained below
		try {
		//explaining to the user what this program does, and then requesting the radius of the circle
		System.out.println("This program outputs the area of a circle based on the radius.!\n");
		System.out.println("Please enter circle radius: ");
		radCircle = scanner1.nextDouble();//storing the input to a variable
		
		//calculating the area of the circle using the normal equation for area of a circle, not yet formatted
		areaCircle = (radCircle * radCircle * Math.PI);
		
		//outputting the area of the circle, formatted to 2 decimals
		System.out.println("\nThe area of a circle with a radius of " + radCircle + " = " + df1.format(areaCircle));
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
		//this try, catch, just makes sure that the program doesn't crash if a user enters an invalid input
		} catch(Exception ex) {
					
			System.out.println("\nInvalid Input. Please enter a decimal value.");
					
		}
	}

}

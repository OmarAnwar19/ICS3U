/* Omar Anwar
 * ConeData assignment, ICS3O
 * 4/28/21
 * The purpose of this assignment it to take in the radius, and height of a cone, both in cm, and then
 * calculate for the surface area, and volume, and return these values to the user formatted to 2 decimals
 */

import java.util.Scanner;
import java.text.*;

public class ConeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring the scanner and formatting
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring all the variables for user input and calculations
		double radCone;
		double heightCone;
		double SACone;
		double volCone;
		
		try {
		//explaining to the user what this program does, and asking for the radius 
		System.out.println("This program outputs the Surface Area and Volume of a cone based on user inputs.!\n");
		System.out.println("Please enter cone radius(cm): ");
		radCone = scanner1.nextDouble();//storing the input to a value
		//same as above
		System.out.println("Please enter cone height(cm): ");
		heightCone = scanner1.nextDouble();
		
		//BOTH NOT YET FORMATTED
		//calculating the SA of a cone using the normal equation, it is a bit complicated, but simpler than it looks
		SACone = ((radCone * radCone * Math.PI) + (Math.PI * radCone * (Math.sqrt((radCone * radCone) + (heightCone * heightCone)))));
		volCone = ((Math.PI * radCone * radCone * heightCone) / 3);//same as above but for volume
		
		//outputting the surface area and volume that we just calculated, except rounded to 2 decimals
		System.out.println("\nA cone with a radius of " + radCone + "cm, and a height of " + heightCone + "cm, has: ");
		System.out.println("Surface Area of: " + df1.format(SACone) + "cm²");
		System.out.println("Volume of: " + df1.format(volCone) + "cm³");
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
		//this try, catch, just makes sure that the program doesn't crash if a user enters an invalid input
		} catch(Exception ex) {
					
			System.out.println("\nInvalid Input. Please enter a decimal number.");
			
		}
	}

}

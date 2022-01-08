/* Omar Anwar
 * ICS3O, CubeCalculator assignment
 * 30/4/21
 * This program takes the length of a cube from the user, and then returns the surface area and volume of the cube in 2 decimals
 */

//importing the scanner, and formatting utilities
import java.text.DecimalFormat;
import java.util.Scanner;

public class CubeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//delcaring variables for the scanner and decimal formatting
		Scanner scanner1 = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring the variables for the different equations, and the input
		double cubeLength;
		double cubeSA;
		double cubeVolume;
			
		//try and catch statement to try the code, and return a message if there is any errors
		try {
			
			//explaining the program to the user and requesting an input
			System.out.println("\nThis program requests of the user the length of a cube, and then returns the surface area and volume.");
			System.out.println("Please input the length of a cube: ");
			
			//taking the input aswell as storing it to variable
			cubeLength = scanner1.nextDouble();
			
			//calculating for the surface area and the volume and storing them to variables
			cubeSA = (6 * (cubeLength * cubeLength));
			cubeVolume = (cubeLength * cubeLength * cubeLength);
			
			//outputting the different values, all formatted to 2 decimal points
			System.out.println("\nA with length of " + df1.format(cubeLength) + " has: ");
			System.out.println("A surface area of: " + df1.format(cubeSA));
			System.out.println("A volume of: " + df1.format(cubeVolume) + "\n");
			
		//second part of the try and catch, sending out a message to the user incase of a wrong input	
		} catch (Exception ex) {
				
			//message to user
			System.out.println("\nPlease enter a valid input\n");	
			
			}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
		}
		
		
	}


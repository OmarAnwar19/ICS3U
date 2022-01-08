/* Omar Anwar	
 * ICS3O, SquareOfStars assignment
 * 5/5/21
 * This program takes a number from the user, and then displays a square of stars of the same size
 */

//importing scanner java util
import java.util.Scanner;

public class SquareOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring integer for number of stars from user
		int starCount;
		
		//explaining the program to the user, and then asking for a number of stars
		System.out.println("This program takes a number from the user, and then prints a square of stars of the same number");
		System.out.println("\nPlease enter number of stars: ");
		
		//try.. and catch.. statement in order to catch any errors, and display a message if a user enters an invalid input
		try {
		
		//asking for user input and then storing it to a value
		starCount = scanner1.nextInt();
		
		//for formatting
		System.out.println("\nSQUARE OF STARS: \n");
			
		//declare variable, and as long as its less then the number the user chose, add to the counter
		for(int i = 0; i < starCount; i++) {
			
			//as long as the counter is less then the user number, print out stars
			for(int j = 0; j < starCount; j++) {
				
				//print stars
				System.out.print("*"); 
			}
			
			//this is just to skip to next line in order to avoid printing all stars to one line
			System.out.print("\n"); 
		}	
	
		//second part of the try and catch statement, if there is wrong input, tell this to a user, and print to a user
		} catch (Exception ex) {
			
			System.out.println("\nInvalid input. Please enter a parsable value. \n");
			
		}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();

	}
			
	}



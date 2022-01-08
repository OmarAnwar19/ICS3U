/* @Omar Anwar	
 * @ICS3O, SquareOfStarsWithMethods assignment
 * @5/7/21
 * This program takes a number from the user, and then displays a square of stars of the same size
 */

//importing scanner java util
import java.util.Scanner;

public class SquareOfStarsWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try.. and catch.. statement in order to catch any errors, and display a message if a user enters an invalid input
		try {
		
		//explaining the program to the user
		PrintProgramDescription();
		
		//declaring a variable which has an integer value = to the value returned from this method
		int starCountMethod = getNumberOfStars();
		
		/* displaying the square of stars. since it needs the parameter for number of stars, we use the above declared
		 * variable from our method as the number of stars 
		 */
		displayStars(starCountMethod);
		
		//second part of the try and catch statement, if there is wrong input, tell this to a user, and print to a user
		} catch (Exception ex) {
					
		System.out.println("\nInvalid input. Please enter a parsable value. \n"); 
		
		}

	}
	
	public static void PrintProgramDescription() {
		
		//explaining the program to the user, and then asking for a number of stars
		System.out.println("This program takes a number from the user, and then prints a square of stars of the same number");
		
		//ending method
		return;
		
	}
	
	//method to ask user for number of stars
	public static int getNumberOfStars() {
		
		//declaring scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring int for number of stars
		int starCount;
		
		//asking user for input
		System.out.println("\nPlease enter number of stars: ");
		
		//getting starCount, then storing it to a variable
		starCount = scanner1.nextInt();
		
		//closing scanner to avoid resource leaks
		scanner1.close();
		
		//returning the value of starCount
		return (starCount);
	
	}
	
	//method to print the stars
	public static void displayStars(int starCount) {
				
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
	
	}
	
	}





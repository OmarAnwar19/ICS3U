/* Omar Anwar
 * ICS3O, Names Assignment
 * 4/29/21
 * This program takes a name input from a user, with first, middle, and last name, and then splits the name,
 * and returns to the user each part of the name individually.
 */

//importing scanner utility for user input
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring a variable for the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring variables for full, first, middle, and last name
		String strFullName;
		String strFirstName;
		String strMiddleName;
		String strLastName;
		
		//explaining the program to the user and asking for input
		System.out.println("This program takes in a full name (3 value) input from the user, and returns it split up.\n");
		System.out.println("Please enter your full name (first,middle,last): ");;
		
		//try and catch statement to display a message if there area any invalid inputs by the user
		try {
			
		//getting and storing user input
		strFullName = (scanner1.nextLine()).trim();//trim removes any blank spaces before or after the name
		
		//declaring a variable for whenever there's a blank space, for better readability
		int blankSpace1 = strFullName.indexOf(" ");
		int blankSpace2 = strFullName.lastIndexOf(" ");
		
		//splitting the name up		
		//storing from the beginning, to the first space in the name to a variable
		strFirstName = strFullName.substring(0, blankSpace1);
		//storing from the first, to the second space in the name to a variable
		strMiddleName = strFullName.substring(blankSpace1 + 1, blankSpace2);
		//storing from the second space, to the end of the name to a variable
		strLastName = strFullName.substring(blankSpace2 + 1, strFullName.length());

		//printing the 3 different names
		System.out.println("\nThe first name is: " + strFirstName.trim());//.trim to remove any excess spaces
		System.out.println("The middle name is: " + strMiddleName.trim());
		System.out.println("The last name is: " + strLastName.trim());
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
		//second part of the try and catch
		} catch (Exception ex) {
			
			//output a message to the user
			System.out.println("\nPlease enter a valid input");
			
		}
	}

}

/* Omar Anwar
 * ICS3O, Word assignment
 * 4/29/21
 * This program takes a string input from the user, and returns relevant information, such as first letter,
 * last letter, string length, and the string in uppercase and lowercase
 */

//import the scanner utility for inputs
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner, and the variable for string input
		Scanner scanner1 = new Scanner(System.in);
		String strInput;
		
		//explaining the program to the user
		System.out.println("This program will return information based on an inputted string\n");
		System.out.println("Please enter a string: ");
		
		//try and catch statement used in case user inputs a incompatible value
		try {
			
		//getting and storing user input
		strInput = scanner1.nextLine();
		
		//returning the info on the strings using string modules
		System.out.println("\nThe length of the word: " + strInput.length());
		System.out.println("The first character of the word: " + strInput.charAt(0));
		System.out.println("The last character of the word: " + strInput.charAt(strInput.length() - 1));
		System.out.println("The word in uppercase: " + strInput.toUpperCase());
		System.out.println("The word in lowercase: " + strInput.toLowerCase());
		
		//catching any errors using the try and catch
		} catch (Exception ex) {
			
			//displaying a message to the user
			System.out.println("Please enter a valid input.");
			
		}
		
		//closing the scanner to avoid resource leak
		scanner1.close();

	}

}

/* Omar Anwar
 * ICS3O, NewSentence assignment
 * 30/4/21
 * This program takes a sentence from the user, and then returns a series of values. These include: the setnence
 * with all spaces replaced with "+", the number of characters, the sentence in uppercase and lowercase,
 * aswell as the first and last letters of the sentence
 */

//declaring the scanner utility
import java.util.Scanner;

public class NewSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring all of the variables for input, as well as the reformatted sentence, and number of characters on the sentence
		String strInput;
		String strOutput;
		int strLength;
		
		//try and catch statement to run the code, and to return a message if there are any errors
		try {
			
		//explaining the program to the user, and asking for an input
		System.out.println("\nThis program takes a sentence from a user, and replaces all blank spaces with a '+', "
				+ "returns the characters, aswell as returns in in upper and lowercase, along with the first and last letters" );
		System.out.println("\nPlease input a string: ");
		
		//taking the input from the user, and storing it to a variable
		strInput = (scanner1.nextLine()).trim();//the .trim removes any spaces before or after the sentence
		
		//replacing all spaces with "+"'s, and storing it to a variable
		strOutput = (strInput.replaceAll(" ", "+"));
		
		//counting the number of characters in the string and storing it to a variable
		strLength = strOutput.length();
		
		//printing the variables we already calculated
		System.out.println("\nOriginal sentence: " + strInput);//original sentence
		System.out.println("Formatted sentence: " + strOutput);//sentence with +'s
		System.out.println("Sentence length: " + strLength + " characters\n");//length of characters
		
		System.out.println("Sentence in uppercase: " + strOutput.toUpperCase());//returning the formatted sentence in uppercase
		System.out.println("Sentence in lowercase: " + strOutput.toLowerCase());//returning the formatted sentence in lowercase
		System.out.println("First letter of sentence: " + strOutput.charAt(0));//returning the first letter of the sentence
		System.out.println("Last letter of sentence: " + strOutput.charAt(strLength - 1));//returning the last letter of the setnence
		
		//closing the scanner to avoid resource leaks
		scanner1.close();

		//second part of the try and catch, sending a message to the user incase of an error
		} catch (Exception ex) {
			
			//sending the message
			System.out.println("\nPlease enter a valid input.\n");
			
		}
	}

}

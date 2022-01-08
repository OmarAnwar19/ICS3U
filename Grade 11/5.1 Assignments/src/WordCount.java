/* Omar Anwar
 * ICS3O, WordCount assignment
 * 30/4/21
 * This assignment takes a sentence from the user, and then returns the number of words and characters
 */

//declaring the scanner and tokenizer utilities
import java.util.Scanner;
/*this utility takes a sentence, and then makes a token for each word, and assigns them to a virtual table,
this table can then have its values retrieved, and the words in a string can be easily counted*/
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring the variables for the string, aswell as the different word and character counts
		String strInput;
		int wordCount, charsCountWS, charsCountNoWS;
		
		//explaining the program to the user, and asks for an input
		System.out.println("This program takes a sentence from the user, and returns the word and character counts");
		System.out.println("Please enter a sentence: ");
		
		//using the scanner to get input from the user, and storing it into a variable
		strInput = (scanner1.nextLine()).trim();
		
		//declaring the tokenizer utility to tokenize the users input
		StringTokenizer strToken = new StringTokenizer(strInput);
		wordCount = strToken.countTokens();//counting the number of tokens assigned to the words in the input string
		
		charsCountWS = strInput.length();//counting the number of characters in the string with whitespace
		charsCountNoWS = (strInput.replace(" ", "")).length();//getting rid of whitespace, and counting the characters
		
		//outputting the original sentence, and the number of words in the input string
		System.out.println("\nOriginal sentence: " + strInput);
		System.out.println("Words in sentence: " + wordCount);
		
		//outputting the number of characters in the sentence both with and without whitespace
		System.out.println("\nCharacters in sentence (with whitepsace): " + charsCountWS + " characters." );
		System.out.println("Characters in sentence (without whitepsace): " + charsCountNoWS + " characters." );
		
		//closing the scanner to avoid resource leaks
		scanner1.close();

	}

}

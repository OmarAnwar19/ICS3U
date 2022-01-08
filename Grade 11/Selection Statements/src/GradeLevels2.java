/* Omar Anwar
 * ICS3O, GradeLevels A2 assignment
 * 5/3/21
 * This program takes in a letter grade input from the user, and then returns a number grade, 
 * as well as a corresponding message
 */

//importing the scanner for user input
import java.util.Scanner;

public class GradeLevels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring the variable for user input 
		String userGrade;
		
		//explaining the program to the user, showing them their options, and asking for an input
		System.out.println("This user intakes a letter grade from a user, and returns a number "
				+ "grade and a corresponding message");
		System.out.println("\nA - Excelent");
		System.out.println("B - Very Good");
		System.out.println("C - Good");
		System.out.println("D - Poor");
		System.out.println("F/I - Insufficient");
		System.out.println("\nPlease enter a letter grade: ");
		
		//taking the user's input and storing it to a value
		userGrade = scanner1.next();
		
		//switch..case statment to check the userGrade input, and return the number grade and corresponding message
		switch (userGrade) {
		
		//if the user inputed "A", either in upper or lower case, return the corresponding number grade and message
		case ("A"):
		case ("a"):
			System.out.println("\nNumber Grade: 1");
			System.out.println("Excellent Job!");
			break;//exit the switch
		
		//if the user inputed "B", either in upper or lower case, return the corresponding number grade and message
		case ("B"):
		case ("b"):
			System.out.println("\nNumber Grade: 2");
			System.out.println("Very Good Job!");
			break;//exit the switch
			
		//if the user inputed "C", either in upper or lower case, return the corresponding number grade and message
		case ("C"):
		case ("c"):
			System.out.println("\nNumber Grade: 3");
			System.out.println("Good Job!");
			break;//exit the switch
		
		//if the user inputed "D", either in upper or lower case, return the corresponding number grade and message
		case ("D"):
		case ("d"):
			System.out.println("\nNumber Grade: 4");
			System.out.println("Poor Job :(");
			break;//exit the switch
		
		//if the user inputed "F" or "I" , either in upper or lower case, return the corresponding number grade and message
		case ("F"):
		case ("f"):
		case ("I"):
		case ("i"):
			System.out.println("\nNumber Grade: 5");
			System.out.println("Insufficient Job :(");
			break;//exit the switch
			
		//if the user inputs a value which doesn't correspond to a menu choice, inform them of this and exit the switch
		default:
			System.out.println("\nInvalid Input");
			System.out.println("Please enter a parsable value");
			break;//exit the switch
			
		}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
	}

}

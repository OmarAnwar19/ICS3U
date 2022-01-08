/* Omar Anwar
 * ICS3O, GradeLevels A1 assignment
 * 5/3/21
 * This program takes a number input from a user, which corresponds to a performance in school, and then returns
 * to them the corresponding letter grade, and a relevant message.
 */

//importing the java scanner
import java.util.Scanner;

public class GradeLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring the variable for the user's number input
		int userGrade;
		
		//explaining the program to the user, then showing them the possible selections, and asking for an input
		System.out.println("This program takes in your grade level 1-6, and returns your letter grade and a message");
		System.out.println("\n1 - Excellent");
		System.out.println("2 - Very Good");
		System.out.println("3 - Good");
		System.out.println("4 - Poor");
		System.out.println("5 - Insufficient\n");
		System.out.println("Please enter a selection: ");
		
		//taking in user input, and storing it to userGrade variable
		userGrade = scanner1.nextInt();
		
		//switch... case statement, allows us to check the userGrade to decide what to input
		switch (userGrade) {
		
		//if the user chooses 1, give them an A letter grade, and congratulate them
		case (1):
			System.out.println("\nLetter Grade: A");
			System.out.println("Excellent Job!");
			break;//exit the switch 
		
		//if the user chooses 2, give them a B letter grade, and congratulate them
		case (2):
			System.out.println("\nLetter Grade: B");
			System.out.println("Very Good Job!");
			break;//exit the switch
		
		//if the user chooses 3, give them a C letter grade, and congratulate them
		case (3):
			System.out.println("\nLetter Grade: C");
		    System.out.println("Good Job!");
		    break;//exit the switch
		
		//if the user chooses 4, give them a D letter grade, and respond to them accordingly
		case (4):
			System.out.println("\nLetter Grade: D");
			System.out.println("Poor Job :(");
			break;

        //if the user chooses 5, give them a F letter grade, and respond to them accordingly
		case (5):
			System.out.println("\nLetter Grade: F");
			System.out.println("Insufficient Job :(");
			break;
		
		//if the user chooses a number of value which is not listed, tell them its a wrong input, and end the switch
		default:
			System.out.println("\nInvalid Input");
			System.out.println("Please enter a parsable value");
			break;
		
		}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();

	}

}

/* Omar Anwar
 * This assignment involves taking a name and age from the user and then outputting-
 * them to the console, I have also chosen to input and output date of birth.
 * ICS3O, InputOutput assignment
 * 27/04/21
 */

//declaring the scanner util to be able to input user data
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*declaring all variables, including the scanner, the name input, age input, and 
		 * date of birth. I have used a string to input text for the name, and integer to
		 * input an age from the user, and intitially I had used 3 different doubles in order to intake the
		 * day, month, and year in a 2 digit format (01/01/01), however, the formatting did not 
		 * look as how I desired, so I opted to use a normal integer.*/
		Scanner scanner1 = new Scanner(System.in);
		String nameInput;
		int ageInput;
		int dobInput;
		int mobInput;
		int yobInput;
		
		//asking the user their name, and then getting their input and storing it to a variable
		System.out.println("What is your name?");//ask for input
		nameInput = scanner1.nextLine();//store input
		System.out.println("");//this is just a blank line for formatting
		
		//asking the user their age, and then getting their input and storing it to a variable
		System.out.println("What is your age?");//ask for input
		ageInput = scanner1.nextInt();//store input
		System.out.println("");//this is just a blank line for formatting
		
		//asking the user their age, and then getting their input and storing it to a variable
		System.out.println("What is your day of birth (dd)?");//ask for input
		dobInput = scanner1.nextInt();//store input
		System.out.println("");//this is just a blank line for formatting
		
		//asking the user their age, and then getting their input and storing it to a variable
		System.out.println("What is your month of birth (mm)?");//ask for input
		mobInput = scanner1.nextInt();//store input
		System.out.println("");//this is just a blank line for formatting
		
		//asking the user their age, and then getting their input and storing it to a variable
		System.out.println("What is your year of birth (yy)?");//ask for input;
		yobInput = scanner1.nextInt();//store input
		System.out.println("");//this is just a blank line for formatting
		
		//outputting all of the info we've inputed out to a console
		System.out.println("*******************************");//this line is just for formatting
		System.out.println("You are: " + nameInput);//here we are outputting the name
		System.out.println("Your age is: " + ageInput);//here we are outputting the age
	    /*for this final line, I am outputting in the normal format, however, I had to use 3 
		different variables, in order to output the full date of birth*/
		System.out.println("Your date of birth is: " + dobInput + "/" + mobInput + "/" + yobInput + "/");
		System.out.println("*******************************");
	
		scanner1.close(); //closing the scanner
	}

}

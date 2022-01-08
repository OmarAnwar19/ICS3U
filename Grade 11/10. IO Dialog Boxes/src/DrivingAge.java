/* Omar Anwar
 * ICS3O, DrivingAge Assesment
 * 5/13/21
 * This program takes an input from the user, and returns whether or not they are allowed to drive, based on their age
 * all outputs, and inputs will be taken and outputted using mesage boxes.
 */

//importing method for the message box
import javax.swing.JOptionPane;

public class DrivingAge {

	public static void prntProgramDesc() {
		
		//declaring variable for YES_NO_OPTION, to check whether or not the user wants to continue
		int menuChoice;
		
		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will check whether or not you are allowed to drive, based on your age.", "Age Driving Check", JOptionPane.INFORMATION_MESSAGE);
		
		//displaying a Yes or No message box, to check whether or not the user wants to continue
		menuChoice = JOptionPane.showConfirmDialog(null, "Continue?", "Age Driving Check", JOptionPane.YES_NO_OPTION);
		
		//if the user chooses yes, this means the program continues normally. However:
		if (menuChoice == JOptionPane.NO_OPTION) {//if the user chooses No, we need to exit the program
			
			//output this to the user
			JOptionPane.showMessageDialog(null, "Exiting program.", "Age Driving Check", JOptionPane.QUESTION_MESSAGE);
			System.exit(0);//terminate the program
		
		} 
		
	}
	
	//method for getting user input
	public static int getUserInput() {
		
		//variables for user age, and int for parsing the age
		String userIn;
		int userNum;
		
		//try and catch statement to return a message if an invlaid input is entered
		try {
		
		//outputting a message box asking the user for their age, and storing it to a variable
		userIn = JOptionPane.showInputDialog(null, "Please Enter Your Age: ", "Age: ");
		
		//parsing the string inputed to an integer
		userNum = Integer.parseInt(userIn);
				
		//returning the user's age input
		return (userNum);
		
		//second part of try and catch statement, if an error is detected, show a message, and exit the system
		} catch (Exception ex) {
			
			//output a message
			JOptionPane.showMessageDialog(null, "ERROR: Invalid input was Entered.", "ERROR", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);//exit the system
			
		}
		
		//this value won't actually be returned, but is just here so the program doesn't throw an error
		return (0);
		
		
	}
	
	//method to check whether the user's age can drive
	public static void outResults(int userAge) {
		
		//if the user is younger than 17, this means they can not drive
		if (userAge < 16) {
			
			//explain to the user they can not drive
			JOptionPane.showMessageDialog(null, "Your age is:  " + userAge + " yrs. Sorry, you are too young to drive.", "Age Driving Check", JOptionPane.ERROR_MESSAGE);
		
		//if the user is older than 16, and younger than 80, this means they can drive
		} else if (userAge >= 16 && userAge < 80) {
			
			//explain to the user they can drive
			JOptionPane.showMessageDialog(null, "Your age is: " + userAge + "yrs. Congratulations, you are able to drive! Drive safely!.", "Age Driving Check", JOptionPane.INFORMATION_MESSAGE);
		
		//if the user is older than 80, this means they can not drive
		} else if (userAge >= 81) {
			
			//explain to the user they can not drive
			JOptionPane.showMessageDialog(null, "Your age is:  " + userAge + " yrs. Sorry, you are too old to drive.", "Age Driving Check", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variable for the user age
		int userAge;
		
		//calling method to print program description
		prntProgramDesc();
		
		//calling the method to get the user's age, and storing it to a variable
		userAge = getUserInput();
		
		//calling method to output the results, and passing the userAge as a parameter
		outResults(userAge);
		
	}

}

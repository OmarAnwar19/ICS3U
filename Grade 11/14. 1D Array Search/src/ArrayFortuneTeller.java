/* Omar Anwar
 * ICS3O, ArrayFortuneTeller assignment
 * 5/21/21
 * This program asks the user for an input, and then returns a random answer from a string of strings.
 */

//importing the message box utility
import javax.swing.JOptionPane;

//class
public class ArrayFortuneTeller {

	//method to print program description
	public static void prntPrgDesc() {

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will take a question, and return your fortune.", "ArrayFortuneTeller", JOptionPane.INFORMATION_MESSAGE);

	}

	//method to populate and declare array
	public static String [] populateArray() {

		//store values to the array
		String answers[] = {
				"You already know the answer!",
				"Most Likely!",
				"Better Not Tell You Now.",
				"How am I supposed to answer that?",
				"Without a doubt!",
				"Not a chance!",
				"There is a chance.",
				"That question is beyond me ---",
				"If you believe it!",
				"HAHAHA, are you trying to make me laugh?"
		};

		//return the string
		return(answers);

	}

	//method to get user input
	public static String getUserInput() {

		//ask user for input, and store to variable
		String userQuestion = JOptionPane.showInputDialog(null, "Please enter a question: ", "ArrayFortuneTeller", JOptionPane.QUESTION_MESSAGE);

		if (userQuestion == null) {//Cancel button selected, exit the program

			//output a message
			JOptionPane.showMessageDialog(null, "Exiting program.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

			System.exit(0);//exit the program

			//if the user input is blank
		} else if (userQuestion.isBlank()) {

			//output a message
			JOptionPane.showMessageDialog(null, "Exiting program.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

			System.exit(0);//exit the program

		}

		//return the user input
		return(userQuestion);

	}

	//method to get random number (for the answers)
	public static int getRandomInteger(int maximum, int minimum){ 

		//randomize number between range of maximum and minimum
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 

	}

	//method to display message
	public static void answerQuestion(String answers[]) {

		//get a random answer from the array we stored above, and output this to the messagebox
		JOptionPane.showMessageDialog(null, answers[getRandomInteger(10, 1)], "ArrayFortuneTeller", JOptionPane.INFORMATION_MESSAGE);

	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call method to print program description
		prntPrgDesc();

		//declaring array using the method to populate array
		String answers[] = populateArray();

		//loop this, while the program is not exited
		do {

			//call method to get user input
			getUserInput();

			//call method to return an answer
			answerQuestion(answers);

		} while(true);//while the program is true
	}

}

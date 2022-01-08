/* Omar Anwar
 * ICS30, RST-MysteryNumber assignment
 * 6/14/21
 * This is a guessing game. The user will have 5 attempts to guess a number between 1 and 5, if they are too high or too low, 
 * they will be informed." If the user is correct, they will be informed, if they are incorrect, the program will restart, 
 * and they get 5 new guesses at a new random number. (entering a null value, or pressing the 'x' on the window, will exit the program.) 
 */

//importing java utilities for array sorting and output, aswell as message box
import java.util.Arrays;
import javax.swing.JOptionPane;

//public class
public class functional {

	//declaring variable for invalidInput boolean, will be used later
	public static boolean invalidInput = false;

	//declaring counter variable
	public static int counter = 1;

	//method to print program description
	public static void prntPrgDesc() {

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This is a guessing game. The user will have 5 attempts to guess a number between 1 and 5, if they are too high or too low, they will be informed." +
				"\nIf the user is correct, they will be informed, if they are incorrect, the program will restart, and they get 5 new guesses at a new random number." + "\n(entering a null value, or pressing the 'x' on the window, will exit the program.)", "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

	}

	//method to get random number
	public static int getRandomInteger(int maximum, int minimum){ 

		//randomize number between range of maximum and minimum
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 

	}

	//method to populate the array
	public static int [] populateArray(int array1 [ ]) {

		//for integer i, while it's less than the length of the array
		for ( int i = 0; i < array1.length - 1; i++ ) {

			//populate the array with a random number between 1 and 20
			array1[i] = getRandomInteger(20, 0);

		}

		//sorting the array, so it's in order of smallest to largest
		Arrays.sort(array1);

		//return the array
		return(array1);

	}

	//method to get a random number from the array
	public static int rndCheck(int [] array1) {

		//declaring variables for randomIndex, and randomNumber
		int randomIndex, randomNumber;

		//declaring a random index
		randomIndex = getRandomInteger((array1.length - 1), 0);

		//assigning the value of that index in the array to the randomNumber integer variable
		randomNumber = array1[randomIndex];

		//retrning this number
		return (randomNumber);

	}

	//method to get userInput
	public static int getUserInput() {

		//declaring variables for the input from the message box
		String uInNumber;

		//declaring variable for the integer of the user input
		int uIntegerIn;

		//first part of try and catch statement to catch errors
		try {

			//asking for the user's guess
			uInNumber = JOptionPane.showInputDialog(null, "Please enter your guess: ", "RST-MysteryNumber", JOptionPane.QUESTION_MESSAGE);

			//if the x button is clicked
			if (uInNumber == null) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

				//otherwise, if the input is blank
			} else if (uInNumber.isBlank()) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

			}

			//if both conditions are passed, declare the string to an integer
			uIntegerIn = Integer.parseInt(uInNumber);

			if ((uIntegerIn < 0)) {//if the user enters a negative value

				//output a message
				JOptionPane.showMessageDialog(null, "Invalid input.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

				//make invalidInput = true
				invalidInput = true;

				//exit the loop
				return(999);

			}

			if ((uIntegerIn > 20)) {//if the user enters a value over 20

				//output a message
				JOptionPane.showMessageDialog(null, "Invalid input.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

				//make invalidInput = true
				invalidInput = true;

				//exit the loop
				return(999);

			}

			//return the array
			return(uIntegerIn);

			//second part of try and catch, if there is an error, do the following
		} catch (Exception ex) {

			//output a message
			JOptionPane.showMessageDialog(null, "Invalid input.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

			//make invalidInput = true
			invalidInput = true;

			//exit the loop
			return(999);

		}

	}

	public static void checkValues(int randomNumber, int uInNumber, int [] array1) { 

		JOptionPane.showMessageDialog(null, counter);
		
		//if the user has guessed too many times
		if (counter >= 4) {

			//output this to the user
			JOptionPane.showMessageDialog(null, "Sorry, you have guessed inccorectley too many times. The number was " + randomNumber + ". \nFrom the array: " + Arrays.toString(array1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

			//make the counter a very large number. This will cause the main method to restart from the first do while loop
			counter = 999;

		}

		//do this if the above condition, if not true (i.e the user has not guessed too many times)
		if (counter != 999) {

			//if the user number, and random number are the same
			if (uInNumber == randomNumber) {

				//output to the user this, and that they have won
				JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was correct!" + "\nFrom the array: " + Arrays.toString(array1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

				//make the counter a very large number. This will cause the main method to restart from the first do while loop
				counter = 999;

			//otherwise, if the user number is greater than the random number
			} else if(uInNumber > randomNumber) {

				//tell the user this
				JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too high!", "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

				//increment the counter by 1
				counter += 1;

			//otherwise if the user number is less than the random number
			} else if(uInNumber < randomNumber) {

				//tell this to the user
				JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too low!", "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

				//increment the counter by 1
				counter += 1;

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method to print program description
		prntPrgDesc();

		//do this,
		do {

			//start by initializing the counter and making it equal to 0
			counter = 0;

			//declaring array
			int [ ] array1 = new int [20];

			//populating array of random numbers
			populateArray(array1);

			//getting a random number from the array
			int randomNumber = rndCheck(array1);

			//do while loop
			do {

				//declare the boolean as false by default
				invalidInput = false;

				//if there is no invalid input then:
				if ((invalidInput == false)) {

					//calling method to get user input, and storing it to a variable
					int uInNumber = getUserInput();

					//if the userInput is a valid number
					if (uInNumber != 999) {

						//call the method to check wheteher or not the number is higher, lower, or correct
						checkValues(randomNumber, uInNumber, array1);	

					}
				}

			//do all this while the counter of guesses is not more than 5
			} while (counter <= 5);

			//while the program isn't exited
		} while(true);


	}

}


/* Omar Anwar
 * ICS30, PrintAllIntegers assignment
 * 5/27/21
 * This program will take the start and stop integers of an array, and return the entire array, aswell as the even and odd numbers from the array
 */

//importing the utilities for arrays, and message box
import java.util.Arrays;
import javax.swing.JOptionPane;

//public class
public class PrintAllIntegers {

	//declaring variable for invalidInput boolean, will be used later
	public static boolean invalidInput = false;

	//method to print program description
	public static void prntPrgDesc() {

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will take the start and stop integers of an array, and return the entire array, aswell as the array with only odd and only even numbers." +
				"\n(entering a null value, or pressing the 'x' on the window, will exit the program.)", "PumpkinSize", JOptionPane.INFORMATION_MESSAGE);

	}

	//method to get values, and store array
	public static int [] getArray() {

		//declaring variables for the input from the message box
		String uInMin, uInMax;

		//declaring variables for the minimum and maximum values of the array
		int MINIMUM_RANGE = 0;
		int MAXIMUM_RANGE = 0;

		//first part of try and catch statement to catch errors
		try {

			//asking for the minimum value of the array
			uInMin = JOptionPane.showInputDialog(null, "Please enter the minimum value of the array: ", "PrintAllIntegers", JOptionPane.QUESTION_MESSAGE);

			//if the x button is clicked
			if (uInMin == null) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

				//otherwise, if the input is blank
			} else if (uInMin.isBlank()) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

			}

			//if both conditions are passed, declare the string to an integer
			MINIMUM_RANGE = Integer.parseInt(uInMin);

			if ((MINIMUM_RANGE < 0)) {//if the user enters a negative value

				//output a message
				JOptionPane.showMessageDialog(null, "Invalid input.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				//make invalidInput = true
				invalidInput = true;

				//exit the loop
				return(null);

			}

			//asking for the maximum value of the array
			uInMax = JOptionPane.showInputDialog(null, "Please enter the maximum value of the array: ", "PrintAllIntegers", JOptionPane.QUESTION_MESSAGE);

			//if the x button is clicked
			if (uInMax == null) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

				//if the program input is blank
			} else if (uInMax.isBlank()) {

				//output a message
				JOptionPane.showMessageDialog(null, "Exiting program.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				System.exit(0);//exit the program

			} 

			//storing the string to an integer
			MAXIMUM_RANGE = Integer.parseInt(uInMax);

			if ((MAXIMUM_RANGE < 0)) {//if the user enters a negative value

				//output a message
				JOptionPane.showMessageDialog(null, "Invalid input.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

				//make invalidInput = true
				invalidInput = true;

				//exit the loop
				return(null);

			}

			//declare variable for the maximum number of the array
			int arrayMax = ((MAXIMUM_RANGE - MINIMUM_RANGE) + 1);
			int counter = 0;//declare variable for counter

			//declaring array
			int mainArray[] = new int[arrayMax];

			//the intial value of the counter is the minimum_range of the array
			counter = (MINIMUM_RANGE);

			//loop through the length of the array
			for (int i = 0; i < (arrayMax); i++) {

				//declaring the array, with value i being the counter
				mainArray[i] = counter;

				//Incrementing the counter
				counter++;

			}

			//return the array
			return(mainArray);

			//second part of try and catch, if there is an error, do the following
		} catch (Exception ex) {

			//output a message
			JOptionPane.showMessageDialog(null, "Invalid input.", "PrintAllIntegers", JOptionPane.WARNING_MESSAGE); 

			//make invalidInput = true
			invalidInput = true;

			//exit the loop
			return(null);

		}

	}

	//method to declare and store even integers of array
	public static int[] evenArray(int mainArray[]) {

		//declaring an array for the even numbers
		int[] evenArray = new int[mainArray.length];

		//declaring a variable for counter
		int j = 0;

		//loop through the length of the array
		for (int i = 0; i < mainArray.length; i++) {

			//if it is divisible by 2,
			if (mainArray[i] % 2 == 0) {

				//store the value of the main array at variable i, to the even array at value j
				evenArray[j] = mainArray[i];
				j++;//increment the counter

			}
		}

		//new array for the even numbers, but filtered so there are no extra 0's
		int filterArray[] = new int[j];

		//loop through the counter
		for (int i = 0; i < j; i++) {

			//storing to the new array, the values of the old array
			filterArray[i] = evenArray[i];

		}

		//return the filtered array
		return(filterArray);

	}

	//method to declare and store odd integers of array
	public static int[] oddArray(int mainArray[]) {

		//declaring the array
		int[] oddArray = new int[mainArray.length];

		//counter 
		int j = 0;

		//looping through the main array, if a value is not divisible by 2, add it to the even array
		for (int i = 0; i < mainArray.length; i++) {

			//if a number is indivisible by 2, add it to the even array
			if (mainArray[i] % 2 != 0) {

				oddArray[j] = mainArray[i];//add to the j value of the array, using the i or counter value of the first array

				j++;//Incrementing the counter

			}
		}

		//declaring a new array, to remove the excess 0's in the old array
		int filterArray[] = new int[j];

		//loop through the counter
		for (int i = 0; i < j; i++) {

			//storing to the new array, the values of the old array
			filterArray[i] = oddArray[i];

		}

		//returning the filtered array
		return(filterArray);

	}

	//method to output the results
	public static void displayResults(int mainArray[], int evenArray[], int oddArray[]) {

		//declaring variables for the maximum and minimum values of the array
		int arrayMin = (mainArray[0]);
		int arrayMax = (mainArray[mainArray.length - 1]);

		//output the array
		JOptionPane.showMessageDialog(null, "Integers between " + arrayMin + " and " + arrayMax + " are: \n" + Arrays.toString(mainArray));

		//output the odd numbers from the array
		JOptionPane.showMessageDialog(null, "Odd integers between " + arrayMin + " and " + arrayMax + " are: \n" + Arrays.toString(oddArray));

		//output the even numbers from the array
		JOptionPane.showMessageDialog(null, "Even integers between " + arrayMin + " and " + arrayMax + " are: \n" + Arrays.toString(evenArray));

	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling method for program description
		prntPrgDesc();

		//do this,
		do {

			//declare the boolean as false by default
			invalidInput = false;

			//declare array
			int mainArray[] = getArray();

			//as long as there is no error, do this
			if (invalidInput == false) {

				//call method to declare and store even numbers of array
				int evenArray[] = evenArray(mainArray);

				//call method to declare and store odd numbers of array
				int oddArray[] = oddArray(mainArray);

				//call method to display the results of the arrays
				displayResults(mainArray, evenArray, oddArray);

			}

			//while the program isn't exited
		} while(true);

	}

}

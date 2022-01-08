/* Omar Anwar
 * ICS3O, PumpkinSize assignment
 * 5/25/21
 * This program takes the weights of 5 pumpkins from the user, and then returns information about them.
 */

//importing utilities
import javax.swing.JOptionPane;
import java.util.Arrays;

//public class
public class PumpkinSize {

	//variable for invalidInputs, will be useful later
	public static boolean invalidInput = false;

	//method to print program description
	public static void prntPrgDesc() {

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will take the weights of 5 pumpkins, and return information about them." +
				"\n(entering a null value, or pressing the 'x' on the window, will exit the program.)", "PumpkinSize", JOptionPane.INFORMATION_MESSAGE);

	}

	public static double[] getUserInput() {

		//declaring the array for the pumpkin length
		double [] pumpkinArray = new double [5];

		//declaring variable for initial user input
		String userInput;

		//first part of try and catch statement
		try {

			//while i < the length of the array, 
			for (int i = 0; i < pumpkinArray.length; i++) {

				//ask the user for the weight of a pumpkin
				userInput = JOptionPane.showInputDialog(null, "Please enter the weight of pumpkin " + (i + 1), "Pumpkin", JOptionPane.QUESTION_MESSAGE);

				if (userInput == null) {//Cancel button selected, exit the program

					//output a message
					JOptionPane.showMessageDialog(null, "Exiting program.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

					System.exit(0);//exit the program

					//if the user input is blank
				} else if (userInput.isBlank()) {

					//output a message
					JOptionPane.showMessageDialog(null, "Exiting program.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

					System.exit(0);//exit the program

				} else if (Double.parseDouble(userInput) < 0) {//if the user enters a negative value

					//output a message
					JOptionPane.showMessageDialog(null, "Invalid input.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

					//make invalidInput = true
					invalidInput = true;

					//exit the loop
					break;

				}

				//store the input to value i of the array
				pumpkinArray[i] = Double.parseDouble(userInput);

			}

		} catch (Exception ex) {//second part of try and catch statement

			//if there is an error, show a message
			JOptionPane.showMessageDialog(null, "Invalid input.", "ArrayFortuneTeller", JOptionPane.WARNING_MESSAGE); 

			//set invalidInput as = to true
			invalidInput = true;

		}

		//return the user array
		return(pumpkinArray);

	}

	//method to get total of all the pumpkins
	public static double getTotal(double[] pumpkinArray) {

		//declare variable for total weight
		double totalWeight = 0;

		//while variable i < length of array
		for (int i = 0; i < pumpkinArray.length - 1; i++) {

			//go through the array, and add each value to total sum
			totalWeight += pumpkinArray[i];

		}

		//return the total weight of the pumpkins
		return(totalWeight);

	}

	//method to get avereage weight
	public static double getAverage(double[] pumpkinArray, double totalWeight) {

		//declare variable for average weight
		double averageWeight = 0;

		//calculating average weight
		averageWeight = (totalWeight / (pumpkinArray.length));

		//returning the value
		return(averageWeight);

	}

	//method to find minimum weight
	public static double minWeight(double[] pumpkinArray) {

		//declaring variable for minimum weight
		double minWeight = 0;

		//sort the array in ascending order
		Arrays.sort(pumpkinArray);

		//the minimum value will be the first value
		minWeight = (pumpkinArray[0]);

		//return this value
		return(minWeight);

	}

	//method to return max weight
	public static double maxWeight(double[] pumpkinArray) {

		//declaring a variable for max weight
		double maxWeight = 0;

		//sort the array in ascneding order
		Arrays.sort(pumpkinArray);

		//the max weight will be the final value in the array
		maxWeight = (pumpkinArray[pumpkinArray.length - 1]);

		//return this value
		return (maxWeight);

	}

	//method to display results
	public static void displayResults(double[] pumpkinArray, double totalWeight, double averageWeight, double minWeight, double maxWeight) {

		//output a message box with all the values
		JOptionPane.showMessageDialog(null, "Array: " + Arrays.toString(pumpkinArray) +
				"\nTotal Weight: " + totalWeight + "kg "+
				"\nAverage Weight: " + averageWeight + "kg "+
				"\nMinimum Weight: " + minWeight + "kg "+
				"\nMaximum Weight: " + maxWeight + "kg ",
				"PumpkinSize", JOptionPane.INFORMATION_MESSAGE);

	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variables for all calculations
		double averageWeight, totalWeight, minWeight, maxWeight;

		//calling method to print program description
		prntPrgDesc();

		//loop the program until it is exited
		do {

			//start by setting invalidInput = false
			invalidInput = false;

			//declaring and storing values to the array
			double pumpkinArray[] = getUserInput();

			//storing the total weight by calling the method, and rounding it to 2 decimals
			totalWeight = Math.round(getTotal(pumpkinArray)* 100.0) / 100.0;

			//storing the average weight by calling the method, and rounding it to 2 decimals
			averageWeight = Math.round(getAverage(pumpkinArray, totalWeight)* 100.0) / 100.0;

			//storing the minimum weight by calling the method, and rounding it to 2 decimals
			minWeight = Math.round(minWeight(pumpkinArray)* 100.0) / 100.0;

			//storing the maximum weight by calling the method, and rounding it to 2 decimals
			maxWeight = Math.round(maxWeight(pumpkinArray)* 100.0) / 100.0;

			//if invalidInput = false, then display results, otherwise, go back to start of loop
			if (invalidInput == false) {

				displayResults(pumpkinArray, totalWeight, averageWeight, minWeight, maxWeight);

			}

			//as stated above, do all this while the program is true, or not exited pretty much
		} while (true);

	}

}

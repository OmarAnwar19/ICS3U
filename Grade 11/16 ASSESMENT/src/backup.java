import java.util.Arrays;

import javax.swing.JOptionPane;

public class backup {

	public static void prntPrgDesc() {

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will take the start and stop integers of an array, and return the entire array + information." +
				"\n(entering a null value, or pressing the 'x' on the window, will exit the program.)", "PumpkinSize", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static int [] getArray() {
		
		String uInMin, uInMax;
		
		int MINIMUM_RANGE = 0;
		int MAXIMUM_RANGE = 0;
				
		uInMin = JOptionPane.showInputDialog(null, "Please enter the minimum value of the array: ", "PrintAllIntegers", JOptionPane.QUESTION_MESSAGE);
		MINIMUM_RANGE = Integer.parseInt(uInMin);
		
		uInMax = JOptionPane.showInputDialog(null, "Please enter the maximum value of the array: ", "PrintAllIntegers", JOptionPane.QUESTION_MESSAGE);
		MAXIMUM_RANGE = Integer.parseInt(uInMax);
		
		int arrayMax = ((MAXIMUM_RANGE - MINIMUM_RANGE) + 1);
		int currentValue = 0;
		
		int array1[] = new int[arrayMax];
		
		currentValue = (MINIMUM_RANGE);
		
		for (int i = 0; i < (arrayMax); i++) {
			
			array1[i] = currentValue;
			
			currentValue++;
			
		}
		
		return(array1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = getArray();
		
		JOptionPane.showMessageDialog(null, Arrays.toString(array1));
		
	}

}

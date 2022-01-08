/* Omar Anwar 
 * ICS3O, DivideTwoNumbers assignment
 * 5/14/21
 * This program takes two numbers from the user, and divides them by each other. Mainly, it's supposed to display knowledge of try and catch statments.
 */

//importing java utilities
import javax.swing.JOptionPane;
import java.text.*;

public class DivideTwoNumbers {

public static void prntProgramDesc() {
		
		//declaring variable for YES_NO_OPTION, to check whether or not the user wants to continue
		int menuChoice;
		
		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program will take 2 numbers from the user, and divide them by eachother.", "DivideTwoNumbers", JOptionPane.INFORMATION_MESSAGE);
		
		//displaying a Yes or No message box, to check whether or not the user wants to continue
		menuChoice = JOptionPane.showConfirmDialog(null, "Continue?", "DivideTwoNumbers", JOptionPane.YES_NO_OPTION);
		
		//if the user chooses yes, this means the program continues normally. However:
		if (menuChoice == JOptionPane.NO_OPTION) {//if the user chooses No, we need to exit the program
			
			//output this to the user
			JOptionPane.showMessageDialog(null, "Exiting program.", "DivideTwoNumbers", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);//terminate the program
		
		}
		
    }
	
	//method to getInput of numbers
	public static double getInput(String number) {
		
		//variables for the 2 numbers
		String nIn1, nIn2;
		double nInParse1, nInParse2;
		
		//first part of try and catch statment to catch exceptions
		try {
		
		//if the number choice = "n1"
		if (number == "n1") {
			
			//ask and delcare to variable nIn1
			nIn1 = JOptionPane.showInputDialog(null, "Please Enter a Number ", "Ex: 12.54");
			nInParse1 = Double.parseDouble(nIn1);//parse the input to a variable instead 
			
			//return the value of the input
			return (nInParse1);
			
		//same as above but with variable 2
		} else if (number == "n2") {
			
			nIn2 = JOptionPane.showInputDialog(null, "Please Enter a Number ", "Ex: 12.54");
			nInParse2 = Double.parseDouble(nIn2);
			
			return (nInParse2);
			
		}
		
		//second part of the try and catch statment for handling exceptions
		} catch (Exception ex) {
			
			//output a message
			JOptionPane.showMessageDialog(null, "ERROR: Invalid or No Input Was Entered.", "ERROR", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);//exit the system
			
		}
		
		//this return statement does not actually return any value, but rather is just there so the program doesnt throw an error
		return(0);
		
	}
	
	//method to divide the numbers
	public static double divNum(double number1, double number2) {
		
		//declaring variable for the result
		double result;
				
		//dividing the numbers
		result = (number1 / number2);//result = number1/number2
		
		return(result);//return the value of result
		
	}
	
	//method to output the results of the program
	public static void outResults(double number1, double number2, double result, DecimalFormat df1) {
		
		//output the value of the calculations
		JOptionPane.showMessageDialog(null, df1.format(number1) + " / " + df1.format(number2) + " = " + df1.format(result), "DivideTwoNumber", JOptionPane.QUESTION_MESSAGE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the decimal format machine
		DecimalFormat df1 = new DecimalFormat("#.00");
		
		//declaring variables for the first number, second number, and result of the division
		double num1, num2, divResult;
		
		//calling method to print the program description
		prntProgramDesc();
		
		//declaring variables to num1 and num2, and calling the method to get said inputs
		num1 = getInput("n1");
		num2 = getInput("n2");
		
		//declaring the result, and calling the method to divide the numbers
		divResult = divNum(num1, num2);
		
		//outputting the results through the use of the method for that purpouse
		outResults(num1, num2, divResult, df1);
		
	}

}

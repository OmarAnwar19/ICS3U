/* Omar Anwar
 * ICS3O, CircleAreaWithExceptions assignment
 * 5/14/21
 * This program takes a number from the user, and returns its area of a circle. This is meant mainly to demonstrate try and catch statments
 */

//importng utilities for message box and decimal format
import javax.swing.JOptionPane;
import java.text.*;

public class CircleAreaWithMessageBox {
	
	//method to print the program description
	public static void programDescription() {
	
		//declaring variable for YES_NO_OPTION, to check whether or not the user wants to continue
		int menuChoice;
				
		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This program calculates the area of a circle!", "AREA OF A CIRCLE", JOptionPane.INFORMATION_MESSAGE);
				
		//displaying a Yes or No message box, to check whether or not the user wants to continue
		menuChoice = JOptionPane.showConfirmDialog(null, "Continue?", "DivideTwoNumbers", JOptionPane.YES_NO_OPTION);
				
		//if the user chooses yes, this means the program continues normally. However:
		if (menuChoice == JOptionPane.NO_OPTION) {//if the user chooses No, we need to exit the program
					
			//output this to the user
			JOptionPane.showMessageDialog(null, "Exiting program.", "DivideTwoNumbers", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);//terminate the program
				
		}
		
	}

	//method to get the area of circle
	public static double getArea(double radius) {
		
		//return the area of the circle
		return Math.pow(radius, 2)*Math.PI;//multiply the radius by PI
	}
	
	//method to display the area
	public static void displayArea(double radius, double area) { //Formats and displays the area in the information message box
        
		//declaring the decimal format tool
		DecimalFormat df = new DecimalFormat("#.00");
		//outputting the results
		JOptionPane.showMessageDialog(null, "Radius = " + radius + " units, Area = " + df.format(area) + " units squared.", "AREA OF A CIRCLE", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//method to get the input of the radius from the user
	public static double getRadius() {
		
		//declaring variables for the radius, and boolean for the loop
		double dbleRad = 0;
		boolean invalidInput = true;

		//first part of do while loop
		do {
			
			//first part of try and catch statement to handle any exceptions in the code
			try {
				
				//Get the input from the user
				String radIn = JOptionPane.showInputDialog(null, "Enter the radius of a circle:");  //NullPointerException NOT handled!
				
				 if (radIn == null) {//Cancel button selected, exit the program
					 //output a messaage
					 JOptionPane.showMessageDialog(null, "BYE, BYE!", "PROGRAM TERMINATION", JOptionPane.INFORMATION_MESSAGE); 
					 System.exit(0);//exit the program
					 
	             }

				 dbleRad = Double.parseDouble(radIn); //converts a String to a double
				 
				 //if the value of the radius is less than or equal to 0, tell the user this is invalid, and don't display the area
				 if (dbleRad <= 0) {
					 
					//output error message to the message box and user
					JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);

				 }
				 
			//second part of try and catch statement. If there is an error, catch it, and display an error in a message box
			} catch (Exception ex) {
				
				//output the message to a message box
				JOptionPane.showMessageDialog(null, "Please enter a valid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			
		//second part of the loop. do this loop while invalidInput is not entered
		} while (invalidInput = false); 
		
		//return the value of the radius
		return (dbleRad);
		
	}

	//main method
	public static void main(String[] args) {
		
		//describe the purpose of the program
		programDescription();
		
		//loop to do the program until it is exited
		do {
			
			//get the radius
			double radius = getRadius();
			
			//the next method displays the area - it requires two arguments: 
			//the radius, and the area (obtained as a return value from the getArea(radius) method
			if (radius > 0) {//only display the area if the number inputed is greater than 0
				
				//call method to display the area of the circle
				displayArea(radius, getArea(radius));
			
			}
			
		//second part of the loop
		} while (true);
		
	}
}

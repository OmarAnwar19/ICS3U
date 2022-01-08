/* Omar Anwar
 * This assignment involves taking 2 integer values from the user, and then adding them
 * together and outputting to the console; I have chosen however to try and make a 
 * rudimentary type of calculator, where I can either add, subtract, multiply or divide the integers
 * ICS3O, AddTwoIntegers assignment
 * 27/04/21
 */

import java.util.Scanner;//importing the scanner

public class AddTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring all variables
		Scanner scanner1 = new Scanner(System.in);//scanner variable
		int operationChoiceIn;//the menu option
		int int1;//first integer
		int int2;//second integer
		int calcOut;//the variable to calculate the 2 integers
		/*this variable makes it so that the menu actually works, because without
		it, the program would crash whenever the menu had something wrong inputed*/
		boolean bolMenu = true;
		
		//asking for the first 2 integers, then storing them to individual variables
		System.out.println("Welcome to the calculator,:");
		
		System.out.println("What is your first integer?");
		int1 = scanner1.nextInt();//storing variable
		/*I had to search this up, but for some reason, 
		the program wouldn't let me input the menu option without this line*/
		scanner1.nextLine();
		System.out.println("");//for formatting
		
		//same as above
		System.out.println("What is your second integer?");
		int2 = scanner1.nextInt();
		scanner1.nextLine();
		System.out.println("");
		
		while (bolMenu = true) {//while the boolean is true, show the code, this is what fixes the menu
			//just printing a menu, and asking for an input
			System.out.println("Choose an option: ");
			System.out.println("1) addition ");			
			System.out.println("2) subtraction ");
			System.out.println("3) multiplication ");
			System.out.println("4) division ");
			System.out.println("");
			operationChoiceIn = scanner1.nextInt();//storing the option to a variable
		
		/*this is the same block of code a few times, it is simply checking the menu option,
		then according to the choice, it does a different operation onto the 2 integers*/
		if (operationChoiceIn == 1) {
			
			calcOut = (int1 + int2);//actually calculating the integers
			System.out.println(int1 + " + " + int2 + " = " + calcOut);//if menu = 1, then add them
			System.exit(0);//this exits out of the program, and terminates the loop
	
		//same as above but with subtraction
		} else if (operationChoiceIn == 2) {
			
			calcOut = (int1 - int2);
			System.out.println(int1 + " - " + int2 + " = " + calcOut);
			System.exit(0);
		
		//same as above but with multiplication
		}  else if (operationChoiceIn == 3) {
			
			calcOut = (int1 * int2);
			System.out.println(int1 + " x " + int2 + " = " + calcOut);
			System.exit(0);
			
		//same as above but with division	
		}  else if (operationChoiceIn == 4) {
			
			calcOut = (int1/int2);
			System.out.println(int1 + " ÷ " + int2 + " = " + calcOut);
			System.exit(0);
			
		} else {//if the menu input is none of the choices, then do this
			
			//print out the following message
			System.out.println("Sorry, that was an invlaid input, please choose another");
			System.out.println();
			
			/* after this, since we had an initial loop, and it was never terminated, unlike
			 * the previous lines of code, it goes back to the start of the menu, and runs
			 * through everything again*/
		}
		
		}
	
		scanner1.close();//closing the scanner
	}
	
}
			
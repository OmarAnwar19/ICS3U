/* @Omar Anwar
 * @5/7/21
 * @ICS3O, DieRpeatedValue assignment
 * This program uses methods to explain the program to the user, and then roll a die using a random number generator,
 * until 2 consecutive numbers appear, it then displays how many rolls were needed, and which 2 numbers were random
 */

public class DieRepeatedValue {

	//static variable so that it can be used in all methods
	static int die;
	
	//method to print program description
	public static void printProgramDescription () {
		
		//explaining the program to the user
		System.out.println("--------------------------------------------------------------------------------\n");
		
		System.out.println("This program rolls a die (random number 1-6), until 2 consecutive numbers apear;");
		System.out.println("It then reports how many rolls were needed\n");
		
		System.out.println("--------------------------------------------------------------------------------\n");
		
	}

	//method to roll the die, which is really just generating a random number between 1-6
	public static void rollTheDie() {	
		
		// Roll the die by setting it to be a random number
		die = (int)(Math.random()*6) + 1;//random number generator between 1 and 6
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variables for number of rolls, current, and last rolls
		int rollCount = (0);
		int currentRoll = (0);
		int lastRoll = (0);

		//calling method to print the program description
		printProgramDescription();
		
		//do while loop
		do {
			
			//this makes more sense when you take in the whole program, however, what is happening is that since below, the current
			//roll is declared = die, this means that the old current roll is actually now the lastRoll, and so I declare it to said variable
			lastRoll = currentRoll;
			
			//calling method to roll the die
			rollTheDie();
			
			//displaying the number which the dice rolled
			System.out.println("The die rolled: " + die);
			
			//adding to counter
			rollCount ++;
			
			//as explained above, the actual current roll is declared as the output of the rollTheDie method, so the old current
			//roll is actually the lastRoll
			currentRoll = die;
			
		//keep doing this loop until the last and current rolls are equal
		} while (currentRoll != lastRoll);
		
		//outputting how many rolls it took, and which numbers were the 2 consecutive ones
		System.out.println("\nIt took " + rollCount + " rolls, to get two consecutive numbers (" + currentRoll + ", " + currentRoll + ")");
		
	}

}

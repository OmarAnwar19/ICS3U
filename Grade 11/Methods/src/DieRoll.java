public class DieRoll {

	static int die;   // Number showing on the die; it is a class variable; belongs to the class,
	//  therefore visible throughout the class

	public static void printProgramDescription () {
		System.out.println("This program simulates rolling a die until 6 comes up.");
		System.out.println("It reports how many rolls were needed\n");
	}

	public static void rollTheDie() {	
		// Roll the die by setting it to be a random number
		die = (int)(Math.random()*6) + 1;  //random number generator between 1 and 6
	}

	public static void main(String[] args) {

		int rollCount = 0;  // Number of times the dice have been rolled

		printProgramDescription(); // call the method that prints the program description

		// Roll the die until 6 comes up
		do {
			rollTheDie();        // call the method that rolls the die
			System.out.println("The die comes up " + die);  // prints the die number
			rollCount++;         // Increment the number of times the dice have been rolled
		}  while (die != 6);           // repeat until the die number is not 6

		// Report the number of rolls. 
		System.out.println("\nIt took " + rollCount + " roll(s) to get a 6!");
	} //main    
}  // class
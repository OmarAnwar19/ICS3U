/* Omar Anwar
 * ICS30, RST-MysteryNumber assignment
 * 6/14/21
 * This is a guessing game. The user will have 5 attempts to guess a number between 1 and 5, if they are too high or too low, 
 * they will be informed." If the user is correct, they will be informed, if they are incorrect, the program will restart, 
 * and they get 5 new guesses at a new random number. (entering a null value, or pressing the 'x' on the window, will exit the program.) 
 * I have also added a new hint system, which gives you a hint when you are at 3 gueses, and when you are at 4 guesses. Additionally, I have
 * added an all-time leader board, where all the scores and names are stored, and can be retrieved, ordered from best to worst score.
 *
 * NOTE: I HAVE ADDED A DEBUGGING CODE IN THE "ENTER USERNAME" INPUT BOX. THIS CODE IS $GETSCORES999. I ADDED THIS TO AID ME
 * WHILE BUG-FIXING THE LEADERBOARD FEATURE, THIS CODE IS NOT KNOWN BY ANY USERS OTHER THEN MYSELF, HOWEVER, IT WILL THROW AN
 * ERROR IF THE CODE IS ENTERED BEFORE THE LEADERBOARD IS INITIALIZED FOR THE VERY FIRST TIME.
 */

//importing java utilities
import java.awt.Image;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//public class
public class RSTMysteryNumber {

	//declaring variable for invalidInput boolean, will be used later
	public static boolean invalidInput = false;

	//declaring counter variable
	public static int counter = 1;

	//method to print program description
	public static void prntPrgDesc() {

		//declaring the icon
		ImageIcon icon = new ImageIcon("img3.png"); // load the image to a imageIcon

		Image image = icon.getImage(); // transform it 

		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  

		icon = new ImageIcon(newimg);//return it to the original image

		//displaying a message box explaining the program to the user
		JOptionPane.showMessageDialog(null, "This is a guessing game. The user will have 5 attempts to guess a number between 1 and 20, if they are too high or too low, they will be informed." +
				"\nIf the user is correct, they will be informed, if they are incorrect, the program will restart, and they get 5 new guesses at a new random number." + "\n(entering a null value, or pressing the 'x' on the window, will exit the program.)", "RST-MysteryNumber", JOptionPane.PLAIN_MESSAGE, icon);
		
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
			array1[i] = getRandomInteger(20, 1);

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

		//returning this number
		return (randomNumber);

	}

	//method to get the name of the user for the leaderboard
	public static String getUserName() {

		//declaring variable for username
		String userName;

		//getting the user input
		userName = JOptionPane.showInputDialog(null, "Please enter a Leaderboard Username: ", "RST-MysteryNumber", JOptionPane.QUESTION_MESSAGE);

		//if the x button is clicked
		if (userName == null) {

			//output a message
			JOptionPane.showMessageDialog(null, "Exiting program.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

			System.exit(0);//exit the program

			//otherwise, if the input is blank
		} else if (userName.isBlank()) {

			//output a message
			JOptionPane.showMessageDialog(null, "Exiting program.", "RST-MysteryNumber", JOptionPane.WARNING_MESSAGE); 

			System.exit(0);//exit the program

		} 

		//this was mostly used as a debugging tool before I implemented an actual method of retrieving the leaderboard
		if (userName.equals("$GETSCORES999")) {//if the user enters this, display the leaderboard

			//calling the method to retrieve the leaderboard
			boardDisplay();

			//exiting the system
			System.exit(0);

			//otherwise, just store the value as normal
		} else {

			//return the name
			return(userName);

		}

		return(null);

	}

	//method to save the values to leaderboard txt files
	public static void saveToLeaderboard (String name) throws IOException {

		//store the name value to a string
		String leaderValue = (name);

		//store the score value to an integer
		int scoreValue = (counter + 1);

		//creating a new file if none exists
		File file1 = new File("scores.txt");
		//creating a filewriter, in order to be able to write to the text file
		FileWriter fw1 = new FileWriter(file1, true);
		//writing to said file
		PrintWriter pw1 = new PrintWriter(fw1);

		//printing the output to the text file
		pw1.println(scoreValue);

		//creating a new file if none exists
		File file2 = new File("names.txt");
		//creating a filewriter, in order to be able to write to the text file
		FileWriter fw2 = new FileWriter(file2, true);
		//writing to said file
		PrintWriter pw2 = new PrintWriter(fw2);

		//printing the output to the text file
		pw2.println(leaderValue);

		//closing printwriter to avoid resource leaks
		pw1.close();
		pw2.close();

	}

	//method to retrieve the scores from the text file
	public static List<Integer> readScores () {

		//declaring list to store to
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("scores.txt");//retirieving the file
		BufferedReader reader = null;//buffered reader = null

		//first part of try and catch statement
		try {

			//basically, all this code below is reading the values from the txt document, and storing it to a list
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {

				list.add(Integer.parseInt(text));

			}

			//catching exceptions
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			//otherwise, if there is nothing in the text document(which is never the case)
			try {

				//close the document
				if (reader != null) {
					reader.close();

				}

			} catch (IOException e) {

			}
		}

		//finally, return the list
		return(list);

	}

	//same as above, but with the names instead of the scores
	public static List<String> readNames () {

		List<String> list = new ArrayList<String>();
		File file = new File("names.txt");
		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {

				list.add(text);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (reader != null) {
					reader.close();

				}

			} catch (IOException e) {

			}
		}

		return(list);

	}

	//method to organize the leaderboard, and assign it to an array
	public static String [] leaderboardOut(List <Integer> scores, List <String> names) {

		//declaring an array, using the size of the list
		String [ ] array1 = new String [scores.size()];

		//for loop using length of the scores list
		for (int i = 0; i < scores.size(); i++) {

			//second loop
			for (int j = scores.size() - 1; j > i; j--) {
				if (scores.get(i) > scores.get(j)) {//if the index of i > index of j

					int tmp = scores.get(i);//declare a new variable = i
					scores.set(i,scores.get(j)) ;//swap the index of i and j
					scores.set(j,tmp);//swap the index of j and i

					//do the same, but for the names
					String tmp2 = names.get(i);
					names.set(i, names.get(j));
					names.set(j, tmp2);

				}

			}

		}

		//loop through the lists, and store them to an array
		for ( int j = 0; j < scores.size(); j++ ) {

			//store values to an array
			array1[j] = (names.get(j) + ": " + scores.get(j) + " guesses.");

		}

		//return the array
		return (array1);
	}

	//method to display the leaderboard
	public static void boardDisplay() {

		//retirieve the scores
		List <Integer> scores = readScores();

		//retrieve the names
		List <String> names = readNames();

		//create a new array where we can store both the values
		String [ ] array1 = new String [scores.size()];

		//store array1 using the 2 lists, by calling the leaderboardout method
		array1 = leaderboardOut(scores, names);

		//displaying the leaderboard to a messagebox
		JOptionPane.showMessageDialog(null, array1, "Leaderboard!", JOptionPane.INFORMATION_MESSAGE);

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

	//method to check how high or low user input is
	public static void checkValues(int randomNumber, int uInNumber, int [] array1, String userName) throws IOException { 

		//JOptionPane.showMessageDialog(null, counter);

		//do this if the above condition, if not true (i.e the user has not guessed too many times)
		if (counter != 999) {

			//if the user number, and random number are the same
			if (uInNumber == randomNumber) {

				//output to the user this, and that they have won
				JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was correct!" + "\nFrom the array: " + Arrays.toString(array1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

				saveToLeaderboard(userName);

				//make the counter a very large number. This will cause the main method to restart from the first do while loop
				counter = 999;

				//otherwise, if the user number is greater than the random number
			} else if(uInNumber > randomNumber) {

				//if the user has guessed 3 times, give them a hint
				if (counter == 2) {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too high!" + "\n(HINT: The number is between " + (randomNumber - 2) + " & " + (randomNumber + 2), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

					//if the user has guessed 4 times, give them a bigger hint
				} else if (counter == 3) {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too high!" + "\n(HINT: The number is between " + (randomNumber - 1) + " & " + (randomNumber + 1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

					//otherwise, if the guess counter is any other value, don't give them a hint
				} else {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too high!", "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

				}


				//otherwise if the user number is less than the random number
			} else if(uInNumber < randomNumber) {

				//if the user has guessed 3 times, give them a hint
				if (counter == 2) {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too low!" + "\n(HINT: The number is between " + (randomNumber - 2) + " & " + (randomNumber + 2), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

					//if the user has guessed 4 times, give them a bigger hint
				} else if (counter == 3) {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too low!" + "\n(HINT: The number is between " + (randomNumber - 1) + " & " + (randomNumber + 1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

					//otherwise, if the counter is at any other increment, don't give them a hint
				} else {

					//tell the user this
					JOptionPane.showMessageDialog(null, "Your guess " + uInNumber + " was too low!", "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

					//increment the counter by 1
					counter += 1;

				}
			}

		}

		//if the user has guessed too many times
		if ((counter > 4) && (counter != 999)) {

			//output this to the user
			JOptionPane.showMessageDialog(null, "Sorry, you have guessed inccorectley too many times. The number was " + randomNumber + ". \nFrom the array: " + Arrays.toString(array1), "RST-MysteryNumber", JOptionPane.INFORMATION_MESSAGE);

			//make the counter a very large number. This will cause the main method to restart from the first do while loop
			counter = 999;

		}

	}

	//main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//calling method to print program description
		prntPrgDesc();

		//do this,
		do {

			//if the counter has been set to the end value
			if (counter == 999) {

				//make a string of options for the next menu
				String[] options = new String[2];

				//options are to play again, or open leaderboard
				options[0] = new String("Play Again!");
				options[1] = new String("Leaderboard");

				//displaying message box for options
				int response = JOptionPane.showOptionDialog(null,"Choose an Option: ","RST-MysteryNumber", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);

				//if the user says play again, then go as usual
				if (response == 0) {


					//otherwise, open the leaderboard, then go on as usual
				} else if (response == 1) {

					//call method to display leaderboard
					boardDisplay();

				}
			}

			//get user name for leaderboard
			String userName = getUserName();

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

						//call the method to check whether or not the number is higher, lower, or correct
						checkValues(randomNumber, uInNumber, array1, userName);	

					}
				}

				//do all this while the counter of guesses is not more than 5
			} while (counter <= 5);

			//while the program isn't exited
		} while(true);


	}

}


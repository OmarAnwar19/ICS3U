/* This program prints Hello World into the console, and then asks user for their name,
 * and responds by sending out a message to them.
 * Author: Omar Anwar
 * ICS3U, HelloWorldPlus assignment
 * Date: 26/04/21
 */

import java.util.Scanner;//This is my declaration for a program which will allow us to get user input

public class HelloWorldPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//firstly I will print a line of ***, then the text, then a second line of ***
		//This first part will only be with my name
		System.out.println("*******************************");
		System.out.println("*This is my first Java program*");
		System.out.println("*         Hello World!        *");
		System.out.println("*      Author: Omar Anwar     *");
		System.out.println("*     Date: April 26, 2021    *");
		System.out.println("*******************************");
		
		//next, I will be taking in user input, and copying the same thing for them
		System.out.println("");
		Scanner userName = new Scanner(System.in); //declaring the variable
		System.out.println("What's your name?");//ask user for their name
		
		String outputName = userName.nextLine();//check what name they inputted
		
		System.out.println("*******************************");
		System.out.println("*    Thank you for viewing    *");
		System.out.println("*          Hello User!        *");
		System.out.println("*      Viewer " + outputName + "      *");//here, I print some normal text, then the variable for the inputted name, then some extra text
		System.out.println("*     Date: April 26, 2021    *");
		System.out.println("*******************************");
		

	}

}

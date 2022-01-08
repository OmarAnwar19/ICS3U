/* Omar Anwar
 * ICS3O, SortIntegers assignment
 * 5/3/21
 * This program takes 3 numbers from the user, and sorts them in ascending order(largest --> smallest)
 */

//importing scanner utility for user input
import java.util.Scanner;

public class SortIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring inputs for the 3 user inputs
		int varInt1;
		int varInt2;
		int varInt3;
		
		//explaining the program to the user
		System.out.println("This program takes 3 numbers from the user, and sorts them in ascending order.");
		
		//asking user for the first integer, and then storing it to a variable
		System.out.println("\nPlease enter the first integer: ");
		varInt1 = scanner1.nextInt();
		
		//asking user for the second integer, and then storing it to a variable
		System.out.println("\nPlease enter the second integer: ");
		varInt2 = scanner1.nextInt();
		
		//asking user for the third integer, and then storing it to a variable
		System.out.println("\nPlease enter the third integer: ");
		varInt3 = scanner1.nextInt();
		
		//declaring integers for the largest, smallest, and medium integers, this will be useful later
		int intLrg;
		int intMid;
		int intSmall;
		
		/*if the first integer is larger than the second, and the second is larger than the third,
		 * then int1 is the largest, int2 is the middle, and int3 is the smallest. However, if the third integer
		 * is larger than the second, and also larger than the first, then the int3 integer is the largest,
		 * int1 is the middle, and int2 is the smallest.
		 */
		if (varInt1 > varInt2) {
			if (varInt2 > varInt3) {
				intLrg = varInt1;
				intMid = varInt2;
				intSmall = varInt3;
				
				//outputting the results of the if statement, intLrg --> intMid --> intSmall
				System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
				
			} else if (varInt3 > varInt2) {
				if (varInt3 > varInt1) {
					intLrg = varInt3;
					intMid = varInt1;
					intSmall = varInt2;
				
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
			}
		
			/*if the second integer is larger than the first, and the first is larger than the third,
			 * then int2 is the largest, int1 is the middle, and int3 is the smallest. However, if the third integer
			 * is larger than the first, and also larger than the second, then the int3 integer is the largest,
			 * int2 is the middle, and int1 is the smallest.
			 */
		} else if (varInt2 > varInt1) {
			if (varInt1 > varInt3) {
				intLrg = varInt2;
				intMid = varInt1;
				intSmall = varInt3;
				
				//outputting the results of the if statement, intLrg --> intMid --> intSmall
				System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
				
			} else if (varInt3 > varInt1) {
				if (varInt3 > varInt2) {
					intLrg = varInt3;
					intMid = varInt2;
					intSmall = varInt1;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
			}
			
			/*if the third integer is larger than the second, and the second is larger than the first,
			 * then int3 is the largest, int2 is the middle, and int1 is the smallest. However, if the first integer
			 * is larger than the second, and also larger than the third, then the int1 integer is the largest,
			 * int3 is the middle, and int2 is the smallest.
			 */
		} else if (varInt3 > varInt2) {
			if (varInt2 > varInt1) {
				intLrg = varInt3;
				intMid = varInt2;
				intSmall = varInt1;
				
				//outputting the results of the if statement, intLrg --> intMid --> intSmall
				System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
				
			} else if (varInt1 > varInt3) {
				if (varInt3 > varInt2) {
					intLrg = varInt1;
					intMid = varInt3;
					intSmall = varInt2;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
			} else if (varInt1 == varInt2) {
				if (varInt3 > varInt1) {
					intLrg = varInt3;
					intMid = varInt2;
					intSmall = varInt1;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				} else if (varInt1 > varInt3) {
					intLrg = varInt1;
					intMid = varInt2;
					intSmall = varInt3;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
				
			} else if (varInt1 == varInt3) {
				if (varInt2 > varInt1) {
					intLrg = varInt2;
					intMid = varInt3;
					intSmall = varInt1;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				} else if (varInt1 > varInt2) {
					intLrg = varInt1;
					intMid = varInt3;
					intSmall = varInt2;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
				
			} else if (varInt2 == varInt3) {
				if (varInt1 > varInt2) {
					intLrg = varInt1;
					intMid = varInt2;
					intSmall = varInt3;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				} else if (varInt2 > varInt1) {
					intLrg = varInt2;
					intMid = varInt3;
					intSmall = varInt1;
					
					//outputting the results of the if statement, intLrg --> intMid --> intSmall
					System.out.println("\nInteger Order: " + intLrg + ", " + intMid + ", " + intSmall);
					
				}
				
				
			}
			
		}
		
		//closing the scanner to avoid resource leaks
		scanner1.close();
		
	}

}

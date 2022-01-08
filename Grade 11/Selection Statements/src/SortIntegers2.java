/* Omar Anwar
 * ICS3O, SortIntegers assignment
 * 5/3/21
 * This program takes 3 numbers from the user, and sorts them in ascending order(smallest --> largest)
 */

//importing scanner utilitvarInt2 for user input
import java.util.Scanner;

public class SortIntegers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the scanner
		Scanner scanner1 = new Scanner(System.in);
		
		//declaring inputs for the 3 user inputs
		int varInt1;
		int varInt2;
		int varInt3;
		
		//evarInt1plaining the program to the user
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
		
		//if varInt1 is greater than or equal to varInt2 then:
		if (varInt1 >= varInt2){
			
			//if varInt2 > or = to varInt3, this means that varInt1 is largest, then varInt2, then varInt3
            if (varInt2 >= varInt3) {
            	//output the integer order
            	System.out.print("\nInteger Order: " + varInt3 + ", "+ varInt2 + ", " + varInt1);
            	
            }
            
            //if varInt3 > or = to varInt1, this means that varInt3 is largest, then varInt1, then varInt2
            else if  (varInt3 >= varInt1) {
            	//output the integer order
            	System.out.print("\nInteger Order: " + varInt2 + ", "+ varInt1 + ", " + varInt3);
            	
            }
                
            //if varInt1 > or = varInt3, this means that varInt1 is the largest, then varInt3, then varInt2
            else if (varInt1 > varInt3) {
            	//output the integer order
            	System.out.print("\nInteger Order: " + varInt2 + ", " + varInt3 + ", " + varInt1); 
            	
            }
                
		}
		
		//same as above but with a second set of numbers
		if (varInt2 > varInt1){
			
			if (varInt3 >= varInt2) {
				//output the integer order
				System.out.print("\nInteger Order: " + varInt3 + ", " + varInt2 + ", "+ varInt1);
				
			}
			
			else if (varInt3 >= varInt1) {
				//output the integer order
				System.out.print("\nInteger Order: " + varInt1 + ", " + varInt3 + ", " + varInt2);
				
			}
			
			else if (varInt1 > varInt3)	{
				//output the integer order
				System.out.print("\nInteger Order: " + varInt3 + ", " + varInt1 + ", " + varInt2);
				
			}
             
		}

		//closing the scanner to avoid resource leaks
		scanner1.close();
		
  }

		
}

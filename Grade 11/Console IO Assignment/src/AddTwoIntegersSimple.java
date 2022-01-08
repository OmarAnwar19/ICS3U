
import java.util.Scanner;

public class AddTwoIntegersSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner1 = new Scanner(System.in);
		String operationChoiceIn;
		int int1;
		int int2;
		int calcOut;
		
		System.out.println("What is your first integer?");
		int1 = scanner1.nextInt();
		System.out.println("");
		
		System.out.println("What is your second integer?");
		int2 = scanner1.nextInt();
		System.out.println("");
		
		calcOut = (int1 + int2);
		System.out.println(int1 + " + " + int2 + " = " + calcOut);

		scanner1.close();
		
	}

}

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

	int number = 0;
	int ones = 0;
	int hundreds = 0;
	int tens = 0;

	number = Integer.parseInt(args[0]);

	ones = number % 10;
	tens = ((number % 100) - ones ) / 10;
	hundreds = (number / 100); 

	System.out.println( hundreds + " hundreds " + tens + " tens, and " + ones + " ones ");
	

	}
}

/*ArithmeticExpressions.java
 * This program takes 5 numbers inputed by the user and outputs different things using the numbers
 * Brennan Stanfield
 * March 10 2016 
 */ 

package stanfield;

import java.util.Scanner;

public class ArithmeticExpressions {

	public static void main(String[] args) {
	
		Scanner myInput = new Scanner(System.in); 
		
		//Declaring Variables 
		int numOne;
		int numTwo;
		int numThree;
		int numFour;
		int numFive;
		int sumAdd;
		int sumOneMinusThree;
		int sumOnePlusFive;
		int quotientFourDividedByTwo;
		int remainderFourDividedByTwo;
		double onePowerThree;
		double rootFive;
		
		
		//Input
		System.out.println("Enter the first number");
		numOne = Integer.parseInt(myInput.nextLine());
		System.out.println("Enter the second number");
		numTwo = Integer.parseInt(myInput.nextLine());
		System.out.println("Enter the third number");
		numThree = Integer.parseInt(myInput.nextLine());
		System.out.println("Enter the fourth number");
		numFour = Integer.parseInt(myInput.nextLine());
		System.out.println("Enter the fifth number");
		numFive = Integer.parseInt(myInput.nextLine());
		
		//Processing
		sumAdd = numOne + numTwo + numThree + numFour + numFive; 
		System.out.println("The sum of the 5 numbers is " + sumAdd);
		sumOneMinusThree = (numOne - numThree) + numTwo + numFour + numFive;
		System.out.println("The sum of the numbers after subtracting the first from the third is " + sumOneMinusThree);
		sumOnePlusFive = numOne + numFive;
		System.out.println("The sum of the first and fifth numbers is " + sumOnePlusFive);
		quotientFourDividedByTwo = numFour / numTwo;
		System.out.println("The quotient of the fourth number divided by the second is " + quotientFourDividedByTwo);
		remainderFourDividedByTwo = numFour % numTwo;
		System.out.println("The remainder of the fourth number divided by the second is " + remainderFourDividedByTwo);
		onePowerThree = Math.pow((double)numOne, (double)numThree);
		System.out.println("The first number to the power of the third is equal to " + onePowerThree);
	    rootFive = Math.sqrt(numFive);
	    System.out.println("The square root of the first number is " + rootFive);
		
		

		


	}

}

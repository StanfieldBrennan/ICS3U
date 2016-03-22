/* PosNegDiv7.java
 * This program takes an integer, determines whether it is positive or negative and whether or not it is divisible by 7
 * Brennan Stanfield
 * March 22 2016
 */
package stanfield;

import java.util.Scanner;

public class PosNegDiv7 {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 
		
		//Variables
		int userInt;
		int math;
		
		//Input
		System.out.println("Please input any integer");
		userInt = Integer.parseInt(myInput.nextLine());
		
		//Processing
		math = userInt % 7;
		if (userInt > 0){
			System.out.println("The number is positive");
		}else{
			System.out.println("The number is negative");	
		}
		
		if (userInt % 7 == 0){
			System.out.println("The number is divisible by 7");
		}else{
			System.out.println("The number is not divisible by 7. The remainder is " + math );
		}
	}

}

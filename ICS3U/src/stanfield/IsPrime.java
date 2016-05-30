/*IsPrime.java
 * 26/05/2016
 * Checks if a number is prime or not
 * Brennan Stanfield
 */
package stanfield;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		//gets user input
		System.out.println("Please enter a number");
		x = scan.nextInt();
		
		//Calls is prime
		if (isPrime(x) == true)
			//prints wether it is prime or not
			System.out.println("The number is not prime");
		else
			System.out.println("The number is prime");

	}
	//Division method
	public static boolean isDivisible(int x, int i){
		
		if(x % i == 0)
			return true;
		return false;
	}
	//method to check if the number is prime or not
	public static boolean isPrime(int x){
		
		for (int i = 2; i < x; i++){
		if(isDivisible(x, i))
			return true;

		}
		return false;
	}
	
	
	
}

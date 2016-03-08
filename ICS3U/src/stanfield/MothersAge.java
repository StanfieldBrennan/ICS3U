/* MothersAge.java
 *This program finds a mothers age when she gave birth to her child
 * Brennan Stanfield
 * Mar/8/2016
 */
package stanfield;

import java.util.Scanner;

public class MothersAge {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);

		//Variables
		int age; //age of kid
		int momsAge; //age of mother
		int momsAgeWhenBorn; //Age of mom when you were born

		//Input
		System.out.println("What is your age?");
		age = Integer.parseInt(myInput.nextLine());
		System.out.println("What is your moms age?");
		momsAge = Integer.parseInt(myInput.nextLine());

		//Processing
		momsAgeWhenBorn = momsAge - age;


	}

}

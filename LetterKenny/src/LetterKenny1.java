/*LetterKenny1.java
 * This program takes you through the life of people who live in LetterKenny Ontario.
 * April 6 2016
 * Brennan Stanfield
 */


import hsa_new.Console;
import java.util.Scanner;

public class LetterKenny1 {
	
	public static void main(String[] args) {
	
		
		//Variables
		Console c = new Console();
		String answer;
		
		//Output
		c.println("The phone rings. It's Sanchez. ''Okay don't come down the laneway.''");
		c.println("Sanchez walks up to you. Do you swing frist? Texas sized 10.4 or Hard no?");
		answer = c.readLine();
		
		if(answer.equalsIgnoreCase("Texas sized 10.4")){
		for (int i=0; i< 3; i++){
			c.println("Do you want to swing left hook or right?");
		}
		} else  if (answer.equalsIgnoreCase("Hard No")){
			c.println("Buddy you're softer than a tootsie roll fruit cup.");
		}
			

	}

}

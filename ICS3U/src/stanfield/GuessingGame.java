/*GuessingGame.java
 * 10/05/2016
 * Brennan Stanfield
 * Plays a guessing game with the user.
 */
package stanfield;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 
		
		String [] list = new String[]{"Brown Bear", "Giraffe", "Monkey", "Elephant", "Koala", "Iguana", "Zebra", "Lion", "Tiger", "Cheetah", "Lynx", "Rhino", "Stingray", "Polar Bear", "Wolf", "Peecock", "Snake", "Lizard", "Panda Bear", "Antelope"};
		String guessWL;  
		String dashes = ""; 
		int random = (int)(Math.random() * list.length); 
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("WordGuess game.");
		
		for (int i  = 0; i < list[random].length(); i++)
		{
			dashes = dashes + "-"; 
			
		}
		System.out.println(dashes); 
		do 
		{
			System.out.println("Please enter a letter of a colour or the word of a colour");
			guessWL = input.nextLine(); 
			
			if (guessWL == "!")
			{
				
			}
			else 
			{
				
			}
			
			
		
		
		
		
		
		
		
		
	}

}

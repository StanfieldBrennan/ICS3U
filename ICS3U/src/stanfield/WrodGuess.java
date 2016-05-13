/*WordGuess.java
 * 13/05/2016
 * This program picks a random word and the user guess's one letter at a time like hangman
 * Brennan Stanfield
 */
package stanfield;

import java.util.Scanner;

public class WrodGuess {

	public static void main(String[] args) {

		//variables
		String [] list = new String[]{"Tiger", "Time", "Tick", "Tongue", "Track", "Tie", "Tough", "Taught", "Tense"}; //list of words for the program to pick from
		String guessWordOrLetter; //the users guess
		int random = (int)(Math.random() * list.length); //picks which word to use randomly
		
		//made the scanner
		Scanner input = new Scanner(System.in);
		String dashes = ""; 
		System.out.println("Welcome to WordGuess game.");
		
		
		for (int i  = 0; i < list[random].length(); i++) 
		{
			dashes = dashes + "-"; 
			
		}
		
		System.out.println(dashes); 
		
		do 
		{
			int counter = 0; 

			System.out.println("Please enter a letter or a the word of a word that starts with t (Enter ! if you're going to guess a word)");
			guessWordOrLetter = input.nextLine(); 
			
			if (guessWordOrLetter.equalsIgnoreCase("!"))
			{
				System.out.println("What word do you think it is?");
				guessWordOrLetter = input.nextLine();
				
				if (guessWordOrLetter.equalsIgnoreCase(list[random])) 
				{
					System.out.println("Wow! You got it right!");
				}
				else
				{
					System.out.println("Sorry! That's incorrect..");
				}
				
			}
			else 
			{
				int number = list[random].indexOf(guessWordOrLetter);
				
				if(number == -1) 
				{
					System.out.println("Oh no, that letter is not part of the word");
				}
				else 
				{
					dashes = dashes.substring(0,number) + guessWordOrLetter + dashes.substring(number+1,list[random].length());
					System.out.println(dashes);

				}
				
				for(int i = 0; i< dashes.length(); i ++) 
				{
					if(dashes.charAt(i) != '-')
					{
						counter++; 
					}
					if (counter == list[random].length())
					{
						System.out.println("Yay! You guessed all the correct letters!!");
						guessWordOrLetter = list[random];
					}
					
				}
				
			}
						
		}
		while(!guessWordOrLetter.equalsIgnoreCase(list[random])); 
		
		
		
		
		
		
		
		
		
		
	}

}

/*GuessingGame.java
 * 10/05/2016
 * Brennan Stanfield
 * Plays a guessing game with the user.
 */
package stanfield;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//variables
		String [] colour = {"Brown Bear", "Giraffe", "Monkey", "Elephant", "Koala", "Iguana", "Zebra", "Lion", "Tiger", "Cheetah", "Lynx", "Rhino", "Stingray", "Polar Bear", "Wolf", "Peecock", "Snake", "Lizard", "Panda Bear", "Antelope"}; 
		String answer = "n"; 
		boolean [] colours = new boolean[colour.length]; 
		int guess = 0; 
		
		//Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, let's play a guessing game. Think of an animal you'd see at the Toronto Zoo! But don't tell me.");
		
			//processing
			do  
			{
				int rndmNumIndex = (int)(Math.random()* colour.length);
			
				if(!colours[rndmNumIndex])
				{
					colours[rndmNumIndex] = true;
					System.out.println("Is it a " + colour[rndmNumIndex] + "? (Y/N)");
					answer = input.nextLine(); 
					guess++; 
				
					if(answer.equalsIgnoreCase("y")) 
					{
						System.out.println("Yay! I win, I was able to get it in " + guess + " tries."); 
					}
					if (guess==colour.length) 
					{
						System.out.println("I give up, you win.");

					}
				}
			
			}while(answer.equalsIgnoreCase("n"));
			
			
		
		
		
		
		
		
		
		
	}

}

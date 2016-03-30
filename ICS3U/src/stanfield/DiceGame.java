/*DiceGame.java
 * This game rolls a pair of dice and shows the result and asks if they want to play again
 * Brennan Stanfield
 * March 28 2016
 */
package stanfield;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 
		
		
		//variables
		boolean reroll = true; 
		String answer;
		//while
		while (reroll){ 
		int dieOne = (int)(Math.random() * 6) + 1;
		int dieTwo = (int)(Math.random() * 6) + 1;
	
		
		//Processing
		if (dieOne > dieTwo){
			System.out.println("YOU WON!");
		}else if(dieOne < dieTwo){
			System.out.println("YOU LOST!");
		}else{
			System.out.println("It was tie...");
		}
		
		//output/input if they want to play again
		System.out.println("Do you want to play again? Yes or No?");
		answer = myInput.nextLine();
		
		//if
		if(answer.equalsIgnoreCase("yes")){
			reroll = true;
		}else if(answer.equalsIgnoreCase("no")){
			reroll = false; 
			System.out.println("Bye.");
		}
		}
	}

}

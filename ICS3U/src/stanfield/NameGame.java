/*NameGame.java
 * Takes a name and decides whether or not it likes it
 * Brennan Stanfield
 * March 28 2016
 */
package stanfield;

import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 
		
		//variables
		String name;
		
		//input
		System.out.println("Please input your name");
		name = myInput.nextLine();
		
		//processing
		int randomNumber = (int)(Math.random() * 10) + 1;
		
		if (randomNumber <=3){
			System.out.println("I hate your name, " + name +"!");
		}else{
			System.out.println("I love your name, " + name +"!");

		}
		
		
	}

}

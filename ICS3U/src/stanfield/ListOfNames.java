/*ListOfNames.java
 * 09/05/2016
 * Brennan Stanfield
 * Input names, out put in order and reverse.
 */

package stanfield;

import java.util.Scanner;

public class ListOfNames {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); 
		
		int howManyNames;
		System.out.println("How many names do you want to input?");
		howManyNames = Integer.parseInt(myInput.nextLine());
		
		String [] x = new String[howManyNames];
		
		
		System.out.println("What are the " + howManyNames + " name?");
		for (int i = 0; i<howManyNames; i++){
		x[i] = myInput.nextLine();
		}
		
		for (int i = 0; i<howManyNames; i++){
			System.out.println(x[i]);
		}
		
		for (int i = howManyNames - 1; i>-1; i--){
			System.out.println(x[i]);
		}
		
	}

}

/*aplusb.java
 * This program adds variables a and b
 * March 31 2016
 * Brennan Stanfield
 */
package stanfield;

import java.util.Scanner;

public class aplusb {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner myInput = new Scanner(System.in); 

		int a = myInput.nextInt();
		int b = myInput.nextInt();
		System.out.println(a + b);
		
		
				
	}

}

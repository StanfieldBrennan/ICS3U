/*HappyAndYouKnowIt.java
 * 10/05/16
 * Brennan Stanfield
 * Prints the lyrics to your happy and you know it with the actions stored in an array
 */
package stanfield;

public class HappyAndYouKnowIt {

	public static void main(String[] args) {

		//array
		String [] actions = new String[]{"clap your hands", "clap your fingers", "and you really really want to show it", "clap your feet", "stomp your feet", "snap your fingers", "and you really want to show it", "stomp one foot", "stomp the other foot", "jump around!"};
		
		//looping
		for (int i = 0; i!=10; i++){
			//printing
			System.out.println("If you're happy and you know it " + actions[i]);
		}
		
		
		
		
		
		
	}

}

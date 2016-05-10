/*DiceSimulator.java
 * 10/05/2016
 * Brennan Stanfield
 * Rolls two dice 10000 times and keeps track of the sums
 */
package stanfield;

public class DiceSimulator {

	public static void main(String[] args) {

		String [] rolled = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		
		int [] times = new int[11];
		
		for (int i = 0; i<10000; i++){
			int die1 = (int)(Math.random() * 6) + 1;
			int die2 = (int)(Math.random() * 6) + 1;
			int total = die1 = die2;
			
			if (total == 2){
				times[0]++;
			}else if(total == 3){
				times[1]++;
			}else if(total == 4){
				times[2]++;
			}else if(total == 5){
				times[3]++;
			}else if(total == 6){
				times[4]++;
			}else if(total == 7){
				times[5]++;
			}else if(total == 8){
				times[6]++;
			}else if(total == 9){
				times[7]++;
			}else if(total == 10){
				times[8]++;
			}else if(total == 11){
				times[9]++;
			}else if(total == 12){
				times[10]++;
			}
		}
			System.out.println("Total            Number of rolls");
			System.out.println("2          " + times[0]);
			System.out.println("3          " + times[1]);
			System.out.println("4          " + times[2]);
			System.out.println("5          " + times[3]);
			System.out.println("6          " + times[4]);
			System.out.println("7          " + times[5]);
			System.out.println("8          " + times[6]);
			System.out.println("9          " + times[7]);
			System.out.println("10         " + times[8]);
			System.out.println("11         " + times[9]);
			System.out.println("12         " + times[10]);


		
		
		
		
		
	}

}

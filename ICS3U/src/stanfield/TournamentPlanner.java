/*TournamentPlanner.java
 * 02/06/2016
 * The purpose is to take a number of teams participating in a round robin tournament and output the schedule
 * Brennan Stanfield
 */
package stanfield;

import java.util.Scanner;

public class TournamentPlanner {

	public static int amountTeams;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//do while to make sure that the number of teams participating is even
			do{
				//asks user how many teams will be participating
			System.out.println("How many teams are in the round robin? Please ensure it is an even number.");
			amountTeams = Integer.parseInt(scan.nextLine());
			}while(!isDivisible(amountTeams, 2));

		//string to hold team names
		String [] teamNames = new String[amountTeams];

		//asks what the team names are
		System.out.println("What are the team names?");
		//repeats the output and stores input for as many times as needed
		for (int i = 0; i<amountTeams; i++){
			teamNames[i] = scan.nextLine();
		}
		
		//out puts how many matches will be needed
		System.out.println("You will need " + calculation(amountTeams) + " matches.");
		
		//prints the match ups of teams
		String[][] matchups = matchUps(teamNames);

		for ( int i =0 ; i < matchups[0].length; i++){
			System.out.print(matchups[0][i] + " ");
			System.out.println(matchups[1][i]);
		}

	}
	//Method to calculate how many matches are needed
	public static int calculation(int amountTeams){

		int matches = amountTeams * (amountTeams - 1) / 2;
		return matches;

	}

	//Method to ensure the number of teams inputed are even
	public static boolean isDivisible(int amountTeams, int x){

		if(amountTeams % x == 0)
			return true;
		return false;
	}

	//Method to figure out who plays who
	public static String[][] matchUps(String [] teamNames){
		int counter = 0;
		String [][] schedule = new String[2][calculation(amountTeams)];
		for(int i = 0; i < amountTeams; i++){
			for(int j = i + 1; j < amountTeams; j++){
				schedule [0][counter] = teamNames[i];
				schedule [1][counter] = teamNames[j];
				counter++;
			}
		}

		return schedule;
	}

	//Method to organize who plays when
	public static int nextMatch(String [][] matchups, String team1, String team2 ){
		int counter = 0;
		for( int i = 0; i < amountTeams; i++){
			if (team1 == matchups [0][counter]  || team2 == matchups[0][counter] || team1 == matchups[1][counter] || team2 == matchups[1][counter]){
				System.out.println(counter);
			}else{
				
			}
		}
		
		
		return
	}
	
}
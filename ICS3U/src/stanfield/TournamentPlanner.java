/*TournamentPlanner.java
 * 02/06/2016
 * The purpose is to take a number of teams participating in a round robin tournament and output the schedule
 * Brennan Stanfield
 */
package stanfield;

import java.util.ArrayList;
import java.util.Scanner;

public class TournamentPlanner {

	public static int amountTeams;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// do while to make sure that the number of teams participating is even
		boolean error = false;
		do {
			// asks user how many teams will be participating
			System.out.println("How many teams are in the round robin? Please ensure it is an even number.");

			try {
				amountTeams = amountTeams / 2;
				amountTeams = Integer.parseInt(scan.nextLine());
				error = false;
			} catch (NumberFormatException e) {
				error = true;
			}

		} while (!isDivisible(amountTeams, 2) || error == true);

		// string to hold team names
		String[] teamNames = new String[amountTeams];

		// asks what the team names are
		System.out.println("What are the team names?");
		// repeats the output and stores input for as many times as needed
		for (int i = 0; i < amountTeams; i++) {
			teamNames[i] = scan.nextLine();
		}

		// out puts how many matches will be needed
		System.out.println("You will need " + calculation(amountTeams) + " matches.");

		// prints the match ups of teams
		String[][] matchups = matchUps(teamNames);

		for (int i = 0; i < matchups[0].length; i++) {
			System.out.print(matchups[0][i] + " ");
			System.out.println(matchups[1][i]);
		}
		
		//prints schedule
		match(matchups); 

	}

	// Method to calculate how many matches are needed
	public static int calculation(int amountTeams) {

		int matches = amountTeams * (amountTeams - 1) / 2;
		return matches;

	}

	// Method to ensure the number of teams inputed are even
	public static boolean isDivisible(int amountTeams, int x) {

		if (amountTeams % x == 0)
			return true;
		return false;
	}

	// Method to figure out who plays who
	public static String[][] matchUps(String[] teamNames) {
		int counter = 0;
		String[][] schedule = new String[2][calculation(amountTeams)];
		for (int i = 0; i < amountTeams; i++) {
			for (int j = i + 1; j < amountTeams; j++) {
				schedule[0][counter] = teamNames[i];
				schedule[1][counter] = teamNames[j];
				counter++;
			}
		}

		return schedule;
	}

	// Method to return the other team in every match up
	public static int nextMatch(String[][] matchups, ArrayList<String> teams, int start) {

		for (int i = start; i < matchups[0].length; i++) {
			for (int j = 0; j < teams.size(); j++) {
				if (teams.get(j) == matchups[0][i] || teams.get(j) == matchups[0][i]) {

				} else {
					return i;
				}
			}
		}

		return -1;
	}

	// Method to organize who plays when
	public static ArrayList<Integer> match(String [][] matchups){
		ArrayList<String> teamsChosen = new ArrayList<String>();
		int matchChosen = 0; 
		ArrayList<Integer> gamesChosen = new ArrayList<Integer>();
		while (matchChosen != -1){
			gamesChosen.add(matchChosen);
		teamsChosen.add(matchups[0][matchChosen]);
		teamsChosen.add(matchups[1][matchChosen]);
		
		matchChosen = nextMatch(matchups, teamsChosen, matchChosen); 
		}
		
		return gamesChosen; 
	}
}